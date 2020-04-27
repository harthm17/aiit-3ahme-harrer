/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue02_serienschaltung;

public class Serienschaltung_ue02_serienschaltung {
    private  double strom;
    private  double spannung;
    private  double[] widerstandsFeld;

    private void updateSpannung() {
        if (widerstandsFeld == null) {
            spannung = 0;
        } else {
           for (int i = 0; i < widerstandsFeld.length; i++) {
                spannung += strom * widerstandsFeld[i];
            } 
        }
    }
    
    public void addWiderstand (double widerstandInOhm) throws InvalidResistorValueException {
       if (widerstandInOhm < 0 || widerstandInOhm > 10E6) {
           throw new InvalidResistorValueException (widerstandInOhm);
       }
       
       if (widerstandsFeld == null) {
            widerstandsFeld = new double[1];
            widerstandsFeld[0] = widerstandInOhm;
        } else {
            double ablage[];
            ablage = new double[widerstandsFeld.length];
            System.arraycopy(widerstandsFeld, 0, ablage, 0, widerstandsFeld.length);
            widerstandsFeld = new double[widerstandsFeld.length + 1];
            System.arraycopy(ablage, 0, widerstandsFeld, 0, widerstandsFeld.length);
            widerstandsFeld[widerstandsFeld.length] = widerstandInOhm;
        }
        updateSpannung();
    }     

    public double getStrom() {
        return 0; 
    }

    public void setStrom(double strom) {
        this.strom = strom;
        updateSpannung();
    } 

    public double getSpannung() {
        return 0;
    }

    @Override
    public String toString() {
        return "Serienschaltung_ue02_serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstandsFeld=" + widerstandsFeld + '}';
    }  
    
}


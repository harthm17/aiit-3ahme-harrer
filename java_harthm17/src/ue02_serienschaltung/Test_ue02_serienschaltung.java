/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue02_serienschaltung;

public class Test_ue02_serienschaltung {
    public static void main(String[] args) throws InvalidResistorValueException {
        final Serienschaltung_ue02_serienschaltung serienschaltung = new Serienschaltung_ue02_serienschaltung();
        
        System.out.println("1: " + serienschaltung);
        try {
            serienschaltung.addWiderstand(-10);
        } catch (InvalidResistorValueException exception) {
            System.out.println("Es ist ein Fehler aufgetreten");
        }
        
        System.out.println("2: " + serienschaltung);
        serienschaltung.setStrom(0.5);
        System.out.println("3: " + serienschaltung);
        serienschaltung.addWiderstand(15);
        System.out.println("4: " + serienschaltung);
        serienschaltung.addWiderstand(20);
        System.out.println("5: " + serienschaltung);
        
        serienschaltung.setStrom(1);
        System.out.println("6: " + serienschaltung);
    }
}

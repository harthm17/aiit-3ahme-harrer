package ue06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author harthm17
 */
public class SerialCiruit {
    
    private final List<Component> liste = new ArrayList();
    private final double current;
     
    public SerialCiruit (Collection<Component> liste, double current) {
        this.liste.addAll(liste);
        this.current = current;
        for (Component c : this.liste) {
            c.setCurrent(current);
        }
    }   

    public double getCurrent() {
        return current;
    }
    
    public void setCurrent(double current) {
        this.current = current;
    }
    
    public double totalVoltage() {
        
    }
    
    public double totalPower() {
        
    }
    
    public double totalEnergy() {
        
    }
    

    public Object[] toArray() {
        return liste.toArray();
    }

    @Override
    public String toString() {
        return "SerialCiruit{" + "liste=" + liste + ", current=" + current + '}';
    }
     
}

package ue06;

import java.util.logging.Logger;

/**
 *
 * @author harthm17
 */
public class Resistor extends Component {
    
    public Resistor (double value) {
        super("R?", value);
    }
    
    public Resistor(String id, double value) {
        super(id, value);
    }

    @Override
    public void setCurrent (double current) {
        this.current = current;
    }
    
    @Override
    public void setVoltage (double voltage) {
        this.voltage = voltage;
    }

    @Override
    public String unit() {
        return "\u2126"; 
    }

    @Override
    public double energy() {
        return 0;
    }
    
}

package ue06;

/**
 *
 * @author harthm17
 */
public abstract class Component {
    
    private final String id;
    private final double value;
    double voltage;
    double current;

    public Component(String id, double value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public double getVoltage() {
        return voltage;
    }

    public double getCurrent() {
        return current;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public void setCurrent(double current) {
        this.current = current;
    }
    
    /*
    power(),
    formattedValue(),
    formattedValue(locale:Locale),
    */

    @Override
    public String toString() {
        return "Component{" + "id=" + id + ", value=" + value + ", voltage=" + voltage + ", current=" + current + '}';
    }
   
    public abstract String unit ();
    
    public abstract double energy ();
    
}
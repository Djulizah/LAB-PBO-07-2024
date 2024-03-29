public class TemperaturConverter {
    String fromScale;
    String toScale;
    double value;
    double ConvertedValue;
    String getFromScale() {
        return fromScale;
    }
    public void setFromScale(String fromScale) {
        this.fromScale = fromScale;
    }
    public String getToScale() {
        return toScale;
    }
    public void setToScale(String toScale) {
        this.toScale = toScale;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public double getConvertedValue() {
        if ("Celsius".equals(fromScale) && "Fahrenheit".equals(toScale)) {
            return (value * 9/5) + 32;
        } else if ("Fahrenheit".equals(fromScale) && "Celsius".equals(toScale)) {
            return (value - 32) * 5/9;
        }
        return value;
    }
    public void setscale(String fromScale, String toScale){
        this.fromScale = fromScale;
        this.toScale = toScale;
    
    }
    
    public void printConvertedValue() {
        double convertedValue = getConvertedValue();
        System.out.println(value + " degrees " + fromScale + " is equal to " + convertedValue + " degrees " + toScale);
    }

    public static void main(String[] args) {
        TemperaturConverter converter = new TemperaturConverter();
        converter.setValue(90);
        converter.setscale("Celsius", "Fahrenheit");
        converter.printConvertedValue();
        converter.getConvertedValue();
    }
   
}

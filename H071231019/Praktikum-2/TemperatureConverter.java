public class TemperatureConverter {
    private String fromScale;
    private String toScale;
    private double value;

    public void setScales(String fromScale, String toScale) {
        this.fromScale = fromScale;
        this.toScale = toScale;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getConvertedValue() {
        if ("Celcius".equals(fromScale) && "Fahrenheit".equals(toScale)) {
            return (value * 9/5 + 32);
        }
        return value;
    }

    public void printConvertedValue() {
        double convertedValue = getConvertedValue();
        System.out.println(value + " degrees " + fromScale + " is equal to " + convertedValue + " degrees " + toScale);
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        converter.setValue(90);
        converter.setScales("Celcius", "Fahrenheit");
        converter.printConvertedValue();
    }
}

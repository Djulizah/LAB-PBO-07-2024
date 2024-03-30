package Tugas2;

class TemperatureConverter {
    String fromScale;
    String toScale;
    double value;
    
    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(String fromScale, String toScale) {
        this.fromScale = fromScale;
        this.toScale = toScale;
    }
    
    public double getConvertedValue(double value) {
        double convertedValue = 0.0;
        
        if (fromScale.equals("Celcius") && toScale.equals("Farenheit")) {
            convertedValue = (value * 9/5) + 32;
        } else if (fromScale.equals("Farenheit") && toScale.equals("Celcius")) {
            convertedValue = (value - 32) * 5/9;
        }
        
        return convertedValue;
    }

    public void printConvertedValue(){
        System.out.printf("%.0f degrees %s is equal to %.0f %s\n", value, fromScale, getConvertedValue(value), toScale);
    }
    

    public static void main(String[] args) {
        TemperatureConverter suhu = new TemperatureConverter();
        suhu.setValue(90);
        suhu.setScale("Celcius", "Farenheit");

        suhu.printConvertedValue();
        
    }
}


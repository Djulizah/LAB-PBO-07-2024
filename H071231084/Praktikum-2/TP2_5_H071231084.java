class TemperatureConverter{
    String fromScale;
    String toScale;
    double value;

    public void setScales(String fromScale, String toScale){
        this.fromScale = fromScale;
        this.toScale = toScale;
    }

    public void setValue(double value){
        this.value = value;
    }

    public double getConvertedValue(){
        if (fromScale == "Celcius" && toScale == "Fahrenheit"){
            return (value * 9/5) + 32;
        } else if (fromScale == "Fahrenheit" && toScale == "Celcius"){
            return (value - 32) * 5/9;
        }
        return 0;
    }

    public void printConvertedValue(){
        if (fromScale == "Celcius" && toScale == "Fahrenheit"){
            System.out.println(value + " degrees Celcius is equal to " + getConvertedValue() + " degrees Fahrenheit");
        } else if (fromScale == "Fahrenheit" && toScale == "Celcius"){
            System.out.println(value + " degrees Fahrenheit is equal to " + getConvertedValue() + " degrees Celcius");
        } else {
            System.out.println("The 'fromScale' and 'toScale' formats do not match!");
        }
    }
}

public class TP2_5_H071231084 {
    public static void main(String[] args) {
        TemperatureConverter temp = new TemperatureConverter();
        temp.setScales("Celcius", "Fahrenheit");
        temp.setValue(90);
        temp.printConvertedValue();
    }
}
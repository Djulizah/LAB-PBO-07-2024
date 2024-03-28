public class TP2_5_H071231064 {

    public static void main(String[] args) {
        TemperaturConverter tConverter = new TemperaturConverter();
        tConverter.setScale("Celcius", "Fahrenheit");
        tConverter.setValue(90);
        tConverter.printConvertValue();
    }
}
/**
 TemperaturConverter
 */
class TemperaturConverter {

    String fromScale;
    String toScale;
    double value;

    public void setScale(String fromScale,String toScale){
        this.fromScale = fromScale;
        this.toScale = toScale;
    }
    public void setValue(double value){
        this.value = value;
    }

    public double getConvertedValue(double value){
        if (toScale =="Celcius") {
            double hasil = (value - 32) * 5/9 ;
            return hasil;
        }
        if (toScale == "Fahrenheit") {
            double hasil = (value*9/5)+32;
            return hasil;
        }
        return 0;
    }
    public void printConvertValue(){
        System.out.println(value+" degrees "+fromScale+" is equal to "+ getConvertedValue(value)+ " degrees "+ toScale);
    }


}




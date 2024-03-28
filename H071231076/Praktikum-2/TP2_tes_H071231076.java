public class TP2_tes_H071231076 {
    String fromScale;
    String toScale;
    double value;
    double convertedValue;

    public String getFromScale() {
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

    public void setScales(String fromScale, String toScale){
        this.fromScale = fromScale;
        this.toScale = toScale;
    }

    public double getConvertedValue() {
        if (fromScale.equals("Celcius") && toScale.equals("Fahrenheit")) {
            convertedValue = (value * 9 / 5) + 32;
        } else if (fromScale.equals("Fahrenheit") && toScale.equals("Celcius")){
            convertedValue = (value - 32) * 5 / 9;
        }
        return convertedValue;
    }

    public void printConvertedValue() {
        System.out.println(value + " degrees " + fromScale + " is equal to " + convertedValue + " degrees " + toScale);
    }

    public static void main(String[] args) {
        TP2_tes_H071231076 convert = new TP2_tes_H071231076();
        convert.setScales("Celcius", "Fahrenheit");
        convert.setValue(90);
        convert.getConvertedValue();
        convert.printConvertedValue();
    }
}

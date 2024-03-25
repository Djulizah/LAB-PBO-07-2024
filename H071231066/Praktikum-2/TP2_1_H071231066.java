package Pertemuan2;
import java.util.Scanner;

public class TP2_1_H071231066 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Person orang = new Person();
        System.out.println(orang.getAge());
        orang.setAge(18);
        orang.setName("Faizz");
        orang.setGender(true); // True laki-laki, 
        System.out.println(orang.getAge());
        System.out.println(orang.getName());
        System.out.println(orang.getGender());
        input.close();
    }
}

class Person {
    private String name;
    private int age;
    private boolean isMale;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    
    void setGender(boolean gender){
        this.isMale = gender;
    }
    String getGender(){
        if (isMale == true){
            return "Laki-laki";
        } else {
            return "Perempuan";
        }
    }


}
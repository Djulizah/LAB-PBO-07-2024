class Person{
    String name;
    int age;
    boolean isMale;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        String gender = (isMale == true) ? "Male" : "Female";
        return gender;
    }
    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

}

public class TP2_1_H071231084 {
    public static void main(String[] args) {
        Person khalika = new Person();
        khalika.setName("Khalika Tsabitah Malik");
        khalika.setAge(19);
        khalika.setGender(false);

        System.out.println("Name\t: " + khalika.getName());
        System.out.println("Age\t: " + khalika.getAge());
        System.out.println("Gender\t: " + khalika.getGender());
    }    
}
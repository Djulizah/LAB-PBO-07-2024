public class TP2_1_H071231064 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("A.M.Yusran Mazidan");
        person.setAge(20);
        person.setGender(true);

        System.out.println("Nama: " + person.getName());
        System.out.println("Umur: " + person.getAge());
        System.out.println("Jenis Kelamin: " + person.getGender());
    }
}

/**
 * Person
 */
class Person {

    String name;
    int age;
    boolean isMale;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setGender(boolean isMale){
        this.isMale = isMale;
    }
    public String getGender(){
        return isMale ? "Male" : "Female";
    }    
}

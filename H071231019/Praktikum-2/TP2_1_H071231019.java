public class TP2_1_H071231019 {
    public static void main(String[] args) {
        Person person = new Person(); // menginstansiasikan objek

        person.setName("Suci");
        person.setAge(55);
        person.setGender(false);
        System.out.println("Nama: " + person.getName());
        System.out.println("Umur: " + person.getAge());
        System.out.println("Male?: " + person.getGender());
    }
}
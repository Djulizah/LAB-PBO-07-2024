package Tugas2;

class person {
    String name;
    int age;
    boolean isMale;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return isMale ? "Male" : "Female";
    }
    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + getGender());
    }
    public static void main(String[] args) {
        person Student = new person();

        Student.setName("Rani");
        Student.setAge(15);
        Student.setGender(false);

        Student.printInfo();
    }
}

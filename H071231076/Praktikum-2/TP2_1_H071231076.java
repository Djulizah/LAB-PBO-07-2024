public class TP2_1_H071231076 {
    private String name;
    private int age;
    private boolean isMale;

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

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        return isMale ? "Male" : "Female";
    }

    public static void main(String[] args) {
        TP2_1_H071231076 person1 = new TP2_1_H071231076();
        person1.setName("Adrian Tri Putra");
        person1.setAge(18);
        person1.setGender(true);

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());
    }
}

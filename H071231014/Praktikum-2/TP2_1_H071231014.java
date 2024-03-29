public class TP2_1_H071231014 {
    private String name;
    private int age;
    private boolean isMaleandfemale;
    
    // setter
    public void setName(String newName) {
        name = newName;
    }
    
    public void setAge(int newAge) {
        age = newAge;
    }
    
    public void setGender(boolean maleandfemale) {
        isMaleandfemale = maleandfemale;
    }
    
    // getter
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getGender() {
        if (isMaleandfemale) {
            return "Male";
        } else {
            return "Female";
        } 
    }
    
    public static void main(String[] args) {
        TP2_1_H071231014 person = new TP2_1_H071231014();
        person.setName("Musliati");
        person.setAge(19);
        person.setGender(false);
    
        System.out.println("Name    : " + person.getName());
        System.out.println("Age     : " + person.getAge());
        System.out.println("Gender  : " + person.getGender());
    }
}
package login_app.models;

public class Profile {
    public String fullname, nickname, hobby;
    public int age;

    public Profile(String fullname, String nickname, String hobby, int age) {
        this.fullname = fullname;
        this.nickname = nickname;
        this.hobby = hobby;
        this.age = age;
    }
}

package login_app.utils;

public class StringUtils {
    public static String getNickName(String fullName) {
        String[] words = fullName.split(" "); //variabel

        if (words.length == 0) {
            return fullName;
        } else {
            return words[1];
        }
    }
}
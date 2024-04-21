package login_app_utils;

public class StringUtils {
    public static String generateNickname(String fullName) {
        String[] nameParts = fullName.split(" ");
        if (nameParts.length == 1) {
            return fullName;
        } else {
            return nameParts[1];
        }
    }
}

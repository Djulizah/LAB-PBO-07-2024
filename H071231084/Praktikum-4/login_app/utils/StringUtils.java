package login_app.utils;

public class StringUtils {
    public static String setNickName(String fullname) {
        // ini dia buat array yang isinya full name dipecah satu2
        String[] name = fullname.split(" ");
        if (name.length == 1) {
            return name[0];
        } else {
            return name[1];
            //jika nama > 1 kata, yg diambil kata kedua
        }
    }
}
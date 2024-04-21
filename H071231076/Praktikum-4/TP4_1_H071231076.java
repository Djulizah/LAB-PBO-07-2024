package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app_models.Profile;
import login_app_models.User;
import login_app_utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                showLoginMenu();
                break;
            case 2:
                showRegisterMenu();
                break;
            default:
                runApp();
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.nextLine();
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }
        if (userIndex != -1) {
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.nextLine();

            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);

            if (isPasswordMatch) {
                String fullName = listUserProfile.get(userIndex).getFullName();
                System.out.println("Berhasil Login");
                System.out.println("----------------------------------");
                System.out.println("Selamat datang, " + fullName + "!");
                System.out.println("----------------------------------");
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                System.out.println("Password Salah");
            }
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username atau password tidak boleh kosong!");
            showRegisterMenu();
            return;
        }

        for (User user : listUser) {
            if (user.getUsername().equals(username)) {
                System.out.println("Username sudah digunakan!");
                showRegisterMenu();
                return;
            }
        }

        if (password.length() < 8) {
            System.out.println("Password harus memiliki minimal 8 karakter!");
            showRegisterMenu();
            return;
        }

        User user = new User(username, password);
        Profile profile = new Profile();

        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();

        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);
        profile.setNickName(StringUtils.generateNickname(fullName));

        listUser.add(user);
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("Nama Lengkap: " + profile.getFullName());
        System.out.println("Nama Panggilan: " + profile.getNickName());
        System.out.println("Umur: " + profile.getAge());
        System.out.println("Hobby: " + profile.getHobby());
        System.out.println("--------------------------");
    }
}

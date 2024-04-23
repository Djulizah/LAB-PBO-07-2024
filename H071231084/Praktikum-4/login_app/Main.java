package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("----------------------------");
        System.out.println("| Aplikasi Login Sederhana |");
        System.out.println("----------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                // Membuka Halaman Login
                showLoginMenu();
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
            default:
                System.out.println("Pilih menu yang tepat!");
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("----------------------------");
        System.out.println("            LOGIN           ");
        System.out.println("----------------------------");

        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");
        
        int userIndex = -1; // Membuat variabel userIndex yang mana nanti akan menampung index dari user

        String username = sc.next();
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).username.equals(username)) {
                userIndex = i;
                break;
            }
        }

        if (userIndex == -1) {
            System.out.println("Username tidak ditemukan! Lakukan register terlebih dahulu!");
            runApp();
        } else { //kondisi user ditemukan
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();

            boolean isPasswordMatch;
            if (listUser.get(userIndex).password.equals(password)) {
                isPasswordMatch = true;
            } else {
                isPasswordMatch = false;
            }

            if (isPasswordMatch) {
                System.out.println("Berhasil Login!");
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                System.out.println("Password Salah!");
            }
        }
    }

    private static void showRegisterMenu() {
        System.out.println("----------------------------");
        System.out.println("          REGISTER          ");
        System.out.println("----------------------------");
        // Menginput username dan password
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();

        User user = new User(username, password);
        // Profile profile = new Profile();

        // Menginput Data Profile
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        //profile.fullname = fullName;

        String nickname = StringUtils.setNickName(fullName);

        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();
        
        // Membuat objek profile dengan atribut sesuai inputan
        Profile profile = new Profile(fullName, nickname, hobby, age);

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("----------------------------");
        System.out.println("Berhasil Membuat User Baru!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("--------------------------------------------------");
        System.out.println("|                 SELAMAT DATANG                 |");
        System.out.println("--------------------------------------------------");
        System.out.println("Nama Lengkap    : " + profile.fullname);
        System.out.println("Nama Panggilan  : " + profile.nickname);
        System.out.println("Umur            : " + profile.age);
        System.out.println("Hobi            : " + profile.hobby);
        System.out.println("--------------------------------------------------");
    }
}
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
        runApp();
    }

    private static void runApp() {
        printLine();
        System.out.println("Aplikasi Login Sederhana");
        printLine();
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
        printLine();
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.next();
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
            String password = sc.next();
            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);

            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                System.out.println("Password Salah");
                runApp();
            }
        } else {
            System.out.println("Username tidak ditemukan. Silakan coba lagi.");
            runApp();
        }
    }

    private static void showRegisterMenu() {
        printLine();
        System.out.println("REGISTER");
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();

        System.out.println("Password");
        System.out.print("> ");
        String password;
        while (true) {
            System.out.println("Password (minimal 8 karakter)");
            System.out.print("> ");
            password = sc.nextLine();
            if (password.length() < 8) {
                System.out.println("Password terlalu pendek! Harus minimal 8 karakter.");
            } else {
                break;
            }
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
        profile.setNickName(StringUtils.generateNickName(fullName));
        Profile.inputMovies(sc, profile);
        listUser.add(user);
        listUserProfile.add(profile);
        printLine();
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        printLine();
        System.out.println("Selamat Datang di Welcome");
        printLine();
        System.out.println("Nama Lengkap\t\t : " + profile.getFullName());
        System.out.println("Umur\t\t\t :  " + profile.getAge());
        System.out.println("Hobby\t\t\t : " + profile.getHobby());
        System.out.println("Nickname\t\t : " + profile.getNickName());
        profile.printFavoriteMovies();
        System.out.println("Ingin menghapus film? (y/n)");
        System.out.print("> ");
        sc.nextLine(); // membersihkan buffer
        String answer = sc.nextLine();

        while (answer.equalsIgnoreCase("y")) {
            System.out.println("Masukkan nomor film yang ingin dihapus:");
            profile.printFavoriteMovies(); // tampilkan lagi daftar film
            System.out.print("> ");
            int removeIndex = sc.nextInt();
            sc.nextLine(); // bersihkan newline

            if (removeIndex > 0 && removeIndex <= profile.getFavoriteMovies().size()) {
                profile.getFavoriteMovies().remove(removeIndex - 1);
                System.out.println("Film berhasil dihapus.");
            } else {
                System.out.println("Nomor tidak valid.");
            }

            // Tampilkan data lagi
            System.out.println("Nama Lengkap : " + profile.getFullName());
            System.out.println("Umur : " + profile.getAge());
            System.out.println("Hobby : " + profile.getHobby());
            System.out.println("Nickname : " + profile.getNickName());
            profile.printFavoriteMovies();

            System.out.println("Hapus film lain? (y/n)");
            System.out.print("> ");
            answer = sc.nextLine();
        }

        System.out.println("Film favorit setelah penghapusan:");
        profile.printFavoriteMovies();
    }

    private static void printLine() {
        for (int i = 0; i < 25; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}

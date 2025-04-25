package login_app.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Profile {
    private String fullName;
    private int age;
    private String hobby;
    private String nickName;
    private ArrayList<Movie> favoriteMovies = new ArrayList<>();

    public Profile() {
    }

    public Profile(String fullName, int age, String hobby, String nickName) {
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
        this.nickName = nickName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public ArrayList<Movie> getFavoriteMovies() {
        return favoriteMovies;
    }

    public void setFavoriteMovies(ArrayList<Movie> favoriteMovies) {
        this.favoriteMovies = favoriteMovies;
    }

    public void printFavoriteMovies() {
        if (favoriteMovies.isEmpty()) {
            System.out.println("Belum ada film favorit.");
        } else {
            System.out.println("Daftar Film Favorit:");
            for (int i = 0; i < favoriteMovies.size(); i++) {
                Movie m = favoriteMovies.get(i);
                System.out.println((i + 1) + ". Judul: " + m.getTitle() + " ( " + m.getGenre() + " ) ");
            }
        }
    }

    public static void inputMovies(Scanner sc, Profile profile) {
        System.out.println("Berapa banyak film favorit yang ingin dimasukkan?");
        System.out.print("> ");
        int total = sc.nextInt();
        sc.nextLine(); // Buang newline

        for (int i = 0; i < total; i++) {
            System.out.println("Masukkan nama film ke-" + (i + 1));
            System.out.print("> ");
            String title = sc.nextLine();

            System.out.println("Masukkan genre film ke-" + (i + 1));
            System.out.print("> ");
            String genre = sc.nextLine();

            Movie movie = new Movie(title, genre);
            profile.getFavoriteMovies().add(movie);
        }
    }
}

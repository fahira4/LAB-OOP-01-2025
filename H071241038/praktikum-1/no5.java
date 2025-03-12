import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String input = x.nextLine();

        boolean panjang = true;
        if(input.length() < 8 ){
            panjang = false;
        }

        boolean kapital = false;
        boolean kecil = false;
        boolean angka = false;

        for(char i : input.toCharArray()){
            if (Character.isUpperCase(i)){
                kapital = true;
            } else if (Character.isLowerCase(i)){
                kecil = true;
            }else if (Character.isDigit(i)){
                angka = true;
            }
        }

        if (panjang && kapital && kecil && angka){
            System.out.println("Passward Valid");
        }else{
            System.out.println("Passward Tidak Valid");
        }
        x.close();
    }
}

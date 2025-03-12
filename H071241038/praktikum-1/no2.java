import java.util.Random;
import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int barismatriks = 3;
        int kolommatriks = 3;
        int[][] nums = new int [barismatriks][kolommatriks];
        Random random = new Random();

        for(int baris = 0; baris < nums.length; baris++){
            for(int kolom = 0; kolom < nums[baris].length; kolom++){
                nums[baris][kolom]= random.nextInt(10);
                System.out.print(nums[baris][kolom] + " ");
            }System.out.println();
        }
        
            try {
                int angka = x.nextInt();
                boolean flag = false;
            for (int baris = 0 ; baris < nums.length; baris++){
                for (int kolom= 0 ; kolom < nums[baris].length; kolom++){
                    if ( nums[baris][kolom] == angka ){
                        System.out.println("Founds "+ angka + " at " + "["+baris+"]" + "["+kolom+"]");
                        flag = true;
                    }
                }
            }
            
            if(!flag){
                System.out.println("tdk ditemukan ");
            }
            
        } catch (Exception e) {
            System.out.println("Inputan harus angkaa"+ e.getMessage());
            
        } finally{
            x.close();
        }

    }
}

import java.util.Scanner;

class Hero {
  String name;
  int health,attackPower;
 
  public Hero(String name, int health, int attackPower) {
      this.name = name;
      this.health = health;
      this.attackPower = attackPower;
  }

  public void attack() {
      System.out.println(name + " menyerang dengan kekuatan " + attackPower + "!!!!!!");
  }
}

class Fighter extends Hero {
  Fighter (String name) {
      super(name , 190, 190);
  }
}

class Wizard extends Hero {
  Wizard (String name,int health, int attackPower) {
      super(name,health,attackPower);
      }
}

class Archer extends Hero {
  Archer(String name,int health, int attackPower) {
  super(name,health,attackPower);
  }
}


public class Main {
    public static void main(String[] args) {
      Scanner x = new Scanner(System.in);
      
      System.out.println("=== Pilih Karakter ===");
        System.out.println("1. Archer");
        System.out.println("2. Wizard");
        System.out.println("3. Fighter");
        System.out.print("Pilihan Anda: ");

      int pilihan = x.nextInt();

     Hero hero = null;

      if (pilihan == 1) {
        hero = new Archer("fahira", 190, 190);
      } else if (pilihan == 2) {
        hero = new Wizard("fahira", 190, 190);
      } else if (pilihan == 3) {
        hero = new Fighter("fahira");
      } else {
        System.out.println("salah");
        return;
      }

      int menu = 0;
      do{
        System.out.println("\n=== Menu ===");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");
            System.out.print("Pilih aksi: ");
        
        menu = x.nextInt();
        if (menu == 1) {
          hero.attack();
        } else if (menu == 2) {
          System.out.println("babay");
        } else {
          System.out.println("salah");
        }

      } while (menu != 2);

      x.close();
    }
    
}
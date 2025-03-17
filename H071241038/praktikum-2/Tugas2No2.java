class Toko {
    String ID;
    String name;
    int stock;
    int price;

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void produkData() {
        System.out.println("ID produk\t: " + getID());
        System.out.println("Name produk\t: " + getName());
        System.out.println("Price produk\t: " + getPrice());
        if (getStock() <= 0) {
            System.out.println("Stock produk\t: produk tidak ada");
        } else {
            System.out.println("Stock produk\t: " + getStock());
        }
    }

    public void restproduk() {
        System.out.println("------------------------------------------------");
        if (getStock() <= 0) {
            System.out.printf("produk %s tidak ada",name);
        } else {
            System.out.println("Stock produk : " + getStock());
            System.out.printf("produk %s ada",name);
        }
        System.out.println("\n------------------------------------------------");
    }
}

public class Tugas2No2 {
    public static void main(String[] args) {
        Toko serba_ada = new Toko();
        serba_ada.ID = "H071241038";
        serba_ada.name = "Apel";
        serba_ada.price = 4000;
        serba_ada.stock = 1;


        serba_ada.produkData();
        serba_ada.restproduk();
    }
}

package kendaraan;

public class Helikopter extends Kendaraan implements IBergerak {
    private double kecepatan;
    private boolean terbang;
    private int jumlahBalingBaling;
    private String tipeMesin;

    public Helikopter(String merek, String model) {
        super(merek, model);
        this.kecepatan = 0;
        this.terbang = false;
    }

    public int getJumlahBalingBaling() {
        return jumlahBalingBaling;
    }

    public void setJumlahBalingBaling(int jumlahBalingBaling) {
        this.jumlahBalingBaling = jumlahBalingBaling;
    }

    public String getTipeMesin() {
        return tipeMesin;
    }

    public void setTipeMesin(String tipeMesin) {
        this.tipeMesin = tipeMesin;
    }

    @Override
    public boolean mulai() {
        terbang = true;
        System.out.println("Helikopter mulai terbang!");
        return true;
    }

    @Override
    public boolean berhenti() {
        terbang = false;
        kecepatan = 0;
        System.out.println("Helikopter mendarat.");
        return true;
    }

    @Override
    public double getKecepatan() {
        return kecepatan;
    }

    @Override
    public void setKecepatan(double kecepatan) {
        if (terbang) {
            this.kecepatan = kecepatan;
            System.out.println("Kecepatan helikopter sekarang: " + kecepatan + " km/h");
        } else {
            System.out.println("Helikopter sedang diam, tidak bisa menambah kecepatan.");
        }
    }

    @Override
    public double hitungPajak() {
        // Contoh: pajak helikopter lebih mahal
        return 5000000;
    }

    @Override
    public String getTipeKendaraan() {
        return "Helikopter";
    }
}

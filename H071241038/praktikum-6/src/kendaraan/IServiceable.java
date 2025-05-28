package kendaraan;


public interface IServiceable {
    boolean periksaKondisi();
    void lakukanServis();
    String getWaktuServisBerikutnya();
    double hitungBiayaServis();
}

public class Cattify {
    String nama;
    int jumlahRealitasRusak;
    EditorKode editorFavorit;
    Bug bugPartner;
    boolean sedangSakit;

    public Cattify() {
        this.nama = "Cattify";
        this.jumlahRealitasRusak = 0;
        this.editorFavorit = new EditorKode();
        this.bugPartner = new Bug();
        this.sedangSakit = false;
    }

    public Cattify(String nama, int jumlahRealitasRusak, EditorKode editorFavorit, Bug bugPartner) {
        this.nama = nama;
        this.jumlahRealitasRusak = jumlahRealitasRusak;
        this.editorFavorit = editorFavorit;
        this.bugPartner = bugPartner;
        this.sedangSakit = false;
    }

    void ngodingLewatMimpi(Cattify kucingLain) {
        System.out.println(this.nama + " dan " + kucingLain.nama + " tidur siang sambil ngoding lewat mimpi.");
        this.jumlahRealitasRusak++;
        kucingLain.jumlahRealitasRusak++;
    }

    void debugDenganKekuatanMeong() {
        System.out.println(this.nama + " mengeluarkan suara frekuensi tinggi untuk menenangkan bug...");
        System.out.println(editorFavorit.getFiturUnik());
        bugPartner.mengamuk();
    }

    void updateKesehatan(boolean sakit) {
        this.sedangSakit = sakit;
        editorFavorit.cekError(sakit);
    }
}

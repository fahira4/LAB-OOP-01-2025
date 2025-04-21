
// import java.util.Random;

public class EditorKode {
    String namaEditor;
    String fitur;
    boolean errorKarenaCattifySakit;
   

    public EditorKode() {
        this.namaEditor = "MeowStudio";
        this.fitur = "Autocomplete berdasarkan suara meongan";
        this.errorKarenaCattifySakit = false;
    }

    public EditorKode(String namaEditor, String fitur) {
        this.namaEditor = namaEditor;
        this.fitur = fitur;
        this.errorKarenaCattifySakit = false;
    }

    String getFiturUnik() {
        return "Fitur unik dari editor " + namaEditor + ": " + fitur;
    }

    void cekError(boolean cattifySakit) {
        if (cattifySakit) {
            errorKarenaCattifySakit = true;
            System.out.println("Editor " + namaEditor + " error karena Cattify sedang sakit!");
        } else {
            errorKarenaCattifySakit = false;
            System.out.println("Editor berjalan normal.");
        }
    }
}

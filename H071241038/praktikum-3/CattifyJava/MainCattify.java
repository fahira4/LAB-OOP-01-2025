
public class MainCattify {
    public static void main(String[] args) {
        EditorKode editor1 = new EditorKode("VSMeowCode", "Run otomatis saat kucing mendengkur");
        Bug bug1 = new Bug("SegmentationMeow", 7);

        Cattify cat1 = new Cattify("Cattify Alpha", 2, editor1, bug1);
        Cattify cat2 = new Cattify();

        cat1.ngodingLewatMimpi(cat2);
        cat1.updateKesehatan(false);
        cat1.debugDenganKekuatanMeong();
        cat2.ngodingLewatMimpi(cat1);
    }
}

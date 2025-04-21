public class Bug {
    String jenisBug;
    int tingkatKeberisikan;

    Bug() {
        this.jenisBug = "NullPawException";
        this.tingkatKeberisikan = 10;
    }

    Bug(String jenisBug, int tingkatKeberisikan) {
        this.jenisBug = jenisBug;
        this.tingkatKeberisikan = tingkatKeberisikan;
    }

    void mengamuk() {
        System.out.println("Bug " + jenisBug + " mengamuk!!!!!");
    }

}


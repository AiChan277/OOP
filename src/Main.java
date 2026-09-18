import A.A1;
import A.A2;
import B.B1;
import B.B2;

public class Main {
    public static void main(String[] args) {

        // 1. Akses dari dalam kelas sendiri (A1)
        A1 a1 = new A1();
        a1.testAksesInternal();

        // 2. Akses dari kelas lain di package yang sama (A2)
        A2 a2 = new A2();
        a2.testAkses();

        // 3. Akses dari subclass di beda package (B1)
        B1 b1 = new B1();
        b1.testAkses();

        // 4. Akses dari kelas biasa di beda package (B2)
        B2 b2 = new B2();
        b2.testAkses();
    }
}

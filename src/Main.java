import A.A1;
import A.A2;
import B.B1;
import B.B2;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   DEMO ACCESS MODIFIER — TOKO PANCING       ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

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

        // Tabel ringkasan
        System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
        System.out.println("║              RINGKASAN ACCESS MODIFIER                            ║");
        System.out.println("╠══════════════╦══════════╦══════════╦══════════╦══════════╦════════╣");
        System.out.println("║  Modifier    ║ A1(Self) ║ A2(Same) ║ B1(Sub)  ║ B2(Other)║ Status║");
        System.out.println("╠══════════════╬══════════╬══════════╬══════════╬══════════╬════════╣");
        System.out.println("║  public      ║   BISA   ║   BISA   ║   BISA   ║   BISA   ║  OK   ║");
        System.out.println("║  protected   ║   BISA   ║   BISA   ║   BISA   ║  ERROR   ║  OK   ║");
        System.out.println("║  default     ║   BISA   ║   BISA   ║  ERROR   ║  ERROR   ║  OK   ║");
        System.out.println("║  private     ║   BISA   ║  ERROR   ║  ERROR   ║  ERROR   ║  OK   ║");
        System.out.println("╚══════════════╩══════════╩══════════╩══════════╩══════════╩════════╝");
    }
}

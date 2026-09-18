package A;

public class A2 {
    public void testAkses() {
        A1 obj = new A1();

        System.out.println("Akses dari A2 (Satu package dengan A1)");
        System.out.println("Nama Alat  (public)    : " + obj.namaAlat);    // Attribut dapat diakses karena public terbuka untuk semua
        System.out.println("Harga      (protected) : " + obj.harga);       // Attribut masih dalam satu package
        System.out.println("Stok       (default)   : " + obj.stok);        // Default berlaku di package yang sama sehingga attribut masih bisa diakses

        // COMPILE ERROR:
        // System.out.println("Supplier   (private)   : " + obj.supplier);
        // Error: 'supplier' has private access in 'A.A1'
        // Attribut private hanya bisa diakses dari dalam kelas A1 itu sendiri

        System.out.println();
    }
}

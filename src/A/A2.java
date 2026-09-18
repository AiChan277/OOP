package A;

public class A2 {
    public void testAkses() {
        A1 obj = new A1();

        System.out.println("Akses dari A2 (Satu Package dengan A1)");
        System.out.println("Nama Alat  (public)    : " + obj.namaAlat);    // BISA: public terbuka untuk semua
        System.out.println("Harga      (protected) : " + obj.harga);       // BISA: masih dalam satu package
        System.out.println("Stok       (default)   : " + obj.stok);        // BISA: default berlaku di package yang sama

        // COMPILE ERROR:
        // System.out.println("Supplier   (private)   : " + obj.supplier);
        // Alasan error: 'supplier' has private access in 'A.A1'
        // — private hanya bisa diakses dari dalam kelas A1 itu sendiri

        System.out.println();
    }
}

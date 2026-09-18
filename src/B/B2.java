package B;

import A.A1;

public class B2 {
    public void testAkses() {
        A1 obj = new A1();

        System.out.println("Akses dari B2 (Beda Package, Bukan Turunan)");
        System.out.println("Nama Alat  (public)    : " + obj.namaAlat); // BISA: public selalu bisa diakses

        // COMPILE ERROR:
        // System.out.println("Harga      (protected) : " + obj.harga);
        // Alasan error: 'harga' has protected access in 'A.A1' (B2 bukan subclass)

        // COMPILE ERROR:
        // System.out.println("Stok       (default)   : " + obj.stok);
        // Alasan error: 'stok' is not public; cannot be accessed from outside package

        // COMPILE ERROR:
        // System.out.println("Supplier   (private)   : " + obj.supplier);
        // Alasan error: 'supplier' has private access in 'A.A1'

        System.out.println();
    }
}

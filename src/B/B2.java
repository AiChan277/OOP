package B;

import A.A1;

public class B2 {
    public void testAkses() {
        A1 obj = new A1();

        System.out.println("Akses dari B2 (Beda Package, bukan subclass dari A1)");
        System.out.println("Nama Alat  (public)    : " + obj.namaAlat); // Attribut public selalu bisa diakses

        // COMPILE ERROR:
        // System.out.println("Harga      (protected) : " + obj.harga);
        // Alasan error: 'harga' has protected access in 'A.A1' (B2 bukan subclass)
        // Attribut 'harga' mempunyai protected access dari A.A1 yang dimana B2 yang bukan subclass tidak dapat mengakses attribut ini

        // COMPILE ERROR:
        // System.out.println("Stok       (default)   : " + obj.stok);
        // Alasan error: 'stok' is not public; cannot be accessed from outside package
        // Attribut 'stok' bermodifier default yang hanya bisa diakses dalam package yang sama sehingga attribut ini tidak dapat diakses di package yang berbeda

        // COMPILE ERROR:
        // System.out.println("Supplier   (private)   : " + obj.supplier);
        // Alasan error: 'supplier' has private access in 'A.A1'
        // Attribut 'supplier' hanya bisa diakses di kelas A1 itu sendiri

        System.out.println();
    }
}

/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Codelab.modul2.codelab1;


/**
 * Class kucing - Deskripsi singkat mengenai kelas ini.
 */
public class kucing implements hewan_interface {

    /**
     * private variable agar hanya bisa diakses diclass kucing saja.
     */
    private String nama;
    private String jenis;
    private String suara;

    // Constructor dengan atribut
    public kucing(String nama, String jenis, String suara) {
        this.nama = nama; // this mengambil dari variable instance nama dan nilai parameter nama disimpan kedalam variable instance
        this.jenis = jenis; // this mengambil dari variable instance jenis dan nilai parameter jenis disimpan kedalam variable instance
        this.suara = suara; // this mengambil dari variable instance suara dan nilai parameter suara disimpan kedalam variable instance
    }
    /**
     * Override dari method tampilkan_infohewan interface hewan_interface
     */
    @Override
    public void tampilkan_infohewan() {
        System.out.println("========"+"Info : "+this.nama+"=======");
        System.out.println("Nama : "+this.nama);
        System.out.println("Jenis : "+this.jenis);
        System.out.println("Suara : "+this.suara);
        System.out.println("===========SELESAI=============");
    }
}

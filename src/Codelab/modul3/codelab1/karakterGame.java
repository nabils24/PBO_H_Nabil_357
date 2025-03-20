/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Codelab.modul3.codelab1;


/**
 * Class karakterGame - Deskripsi singkat mengenai kelas ini.
 */
public class karakterGame {

    private String nama;
    private int kesehatan;

    public karakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public void serang(karakterGame target, int damage, String skil) {
        // Akan di-override oleh subclass

    }
}

/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Codelab.modul2.codelab1;


/**
 * Class codelab1 - Class untuk codelab1 ini.
 */
public class codelab1 {

    /**
     * Metode utama yang dijalankan saat program dimulai.
     *
     * @param args Argumen baris perintah
     */
    public static void main(String[] args) {
        hewan_interface hewan1 = new anjing("Cihuaha","Mamalia","Miawwwah", "18");
        hewan_interface hewan2 = new kucing("Kucing Oren","Mamalia","Miawwwah");

        hewan1.tampilkan_infohewan();
        System.out.println("\n");
        hewan2.tampilkan_infohewan();
    }
}

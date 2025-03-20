/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Codelab.modul3.codelab1;


/**
 * Class codelab1 - Deskripsi singkat mengenai kelas ini.
 */
public class codelab1 {

    /**
     * Metode utama yang dijalankan saat program dimulai.
     *
     * @param args Argumen baris perintah
     */
    public static void main(String[] args) {
        karakterGame umum = new karakterGame("Karakter Umum", 100);
        minion minionMidlane = new minion("Minion MidLane", 20);
        hero miya = new hero("Miya", 150);
        enemies jhonson = new enemies("Jhonson", 200);

        System.out.println("Welcome to mobile legend");
        System.out.println("5 Second to be enemies reaches to battlefield");
        System.out.println("SMASH THEM");
        System.out.println("ALL TROPS DEPLOY");

        /**
         * Setup Hero 1 dan Hero 2
         * Hero 1
         * GETTER nama, kesehatan
         * Hero 2
         * GETTER nama, kesehatan
         */
        System.out.println(miya.getNama() + " memiliki kesehatan: " + miya.getKesehatan());
        System.out.println(jhonson.getNama() + " memiliki kesehatan: " + jhonson.getKesehatan());
        System.out.println(minionMidlane.getNama() + " memiliki kesehatan: " + minionMidlane.getKesehatan());

        System.out.println("\n===Pertarungan Dimidlane===");
        miya.serang(jhonson, 10, "Lempar panah");
        jhonson.serang(miya, 130, "lempar palu");
        minionMidlane.serang(miya, 20, "Lempar batu");
        miya.serang(minionMidlane, 15, "lempar panah");
        System.out.println("===Pertarungan Dimidlane Selesai===");

        /**
         * Setup Hero 1 dan Hero 2
         * Hero 1
         * GETTER nama, kesehatan
         * Hero 2
         * GETTER nama, kesehatan
         */
        System.out.println("\n===CHECK DARAH SEMUA HERO===");
        System.out.println(miya.getNama() + " memiliki kesehatan: " + miya.getKesehatan());
        System.out.println(jhonson.getNama() + " memiliki kesehatan: " + jhonson.getKesehatan());
        System.out.println(minionMidlane.getNama() + " memiliki kesehatan: " + minionMidlane.getKesehatan());
    }
}

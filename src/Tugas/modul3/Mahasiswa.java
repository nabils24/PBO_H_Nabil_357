/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Tugas.modul3;


/**
 * Class Mahasiswa - Deskripsi singkat mengenai kelas ini.
 */
public class Mahasiswa extends User{

    // Constructor Mahasiswa yang menggunakan super untuk menginisialisasi nama dan nim
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void loginSystem() {
        // Misalnya data valid mahasiswa
        String validNama = "Nabils";
        String validNim = "123321";

        if (this.getUsername().equals(validNama) && this.getNim().equals(validNim)) {
            System.out.println("Login berhasil sebagai Mahasiswa!");
            displayInfo();  // Menampilkan info pengguna
        } else {
            System.out.println("Login gagal. Nama atau NIM salah.");
        }
    }

    // override method displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Informasi Mahasiswa: ");
        System.out.println("Nama: " + getUsername());
        System.out.println("NIM: " + getNim());
        System.out.println("Status: Mahasiswa berhasil login.");
    }
}

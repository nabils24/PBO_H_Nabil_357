/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Tugas.modul2;


/**
 * Class Mahasiswa - Deskripsi singkat mengenai kelas ini.
 */
public class Mahasiswa {
    private String nim;
    private String password;

    // Constructor Mahasiswa
    public Mahasiswa(String nim, String password) {
        this.nim = nim;
        this.password = password;
    }

    // Menampilkan informasi
    public void displayInfo() {
        System.out.println("\n======================================");
        System.out.println("      SELAMAT DATANG MAHASISWA       ");
        System.out.println("======================================");
        System.out.println("NIM: " + nim + "!");
        System.out.println("======================================\n");
    }

    // Melakukan validasi login mahasiswa
    public boolean login(String nimInput, String passwordInput) {
        if (nimInput == null || nimInput.isEmpty() ||
                passwordInput == null || passwordInput.isEmpty()) {
            System.out.println("NIM atau password tidak boleh kosong.");
            return false;
        }
        return this.nim.equals(nimInput) && this.password.equals(passwordInput);
    }

}

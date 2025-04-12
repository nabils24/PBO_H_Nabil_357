/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Tugas.modul2;


/**
 * Class Admin - Deskripsi singkat mengenai kelas ini.
 */
public class Admin {
    private String username;
    private String password;

    // Constructor Admin
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Menampilkan informasi
    public void displayInfo() {
        System.out.println("\n======================================");
        System.out.println("   WELCOME TO THE ADMIN DASHBOARD    ");
        System.out.println("======================================");
        System.out.println("Halo Admin, " + username + "!");
        System.out.println("======================================\n");
    }

    // Melakukan validasi login admin
    public boolean login(String usernameInput, String passwordInput) {
        if (usernameInput == null || usernameInput.isEmpty() ||
                passwordInput == null || passwordInput.isEmpty()) {
            System.out.println("Username atau password tidak boleh kosong.");
            return false;
        }
        return this.username.equals(usernameInput) && this.password.equals(passwordInput);
    }

}

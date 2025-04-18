/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Tugas.modul3;


/**
 * Class Admin - Deskripsi singkat mengenai kelas ini.
 */
public class Admin extends User {
    private String username, password;

    // Constructor
    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    // Getter dan Setter untuk username dan password
    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void loginSystem() {
        //data dummy untuk login admin
        String validUsername = "admin";
        String validPassword = "admin123";

        if (this.username.equals(validUsername) && this.password.equals(validPassword)) {
            System.out.println("Login berhasil sebagai Admin!");
            displayInfo();  // Menampilkan info pengguna
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }
    }

    // Overide dari method displayinfo yang berasal dari superclassssss
    @Override
    public void displayInfo() {
        System.out.println("Informasi Admin: ");
        System.out.println("Nama: " + getUsername());
        System.out.println("NIM: " + getNim());
        System.out.println("Status: Admin berhasil login.");
    }


}

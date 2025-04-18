/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Tugas.modul3;


/**
 * Class User - Deskripsi singkat mengenai kelas ini.
 */
public class User implements userInterface {
    private String username, nim;

    // Constructor
    public User(String username, String nim) {
        this.username = username;
        this.nim = nim;
    }

    /**
     * Getter Setter Username, dan set Username
     * @return
     */
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter Setter Nim
     * @return
     */
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Implementasi method login dari abstract func
    public void loginSystem() {
        System.out.println("Login method not implemented yet.");
    }
    public void displayInfo() {
        System.out.println("Informasi User: ");
        System.out.println("Nama: " + username);
        System.out.println("NIM: " + nim);
    }

}

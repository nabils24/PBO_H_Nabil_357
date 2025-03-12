/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Tugas.modul2;
import java.util.ArrayList;

/**
 * Class listMahasiswa - Deskripsi singkat mengenai kelas ini.
 */
public class listMahasiswa {

    //Init
    public ArrayList<mahasiswa> list;

    // Constructor
    public listMahasiswa() {
        list = new ArrayList<mahasiswa>();
        list.add(
                new mahasiswa(
                        1,
                        202410370110357L,
                        "nabil",
                        "jalan jalan",
                        "085930258437",
                        "123321"
                )
        );
    }

    public boolean validateMahasiswa(String nim, String password) {
        for (mahasiswa mhs : list) {
            if (mhs.login(nim, password)) {
                return true;
            }
        }
        return false;
    }

    public void Tampil_mahasiswa() {
        System.out.printf("| %-5s | %-15s | %-20s | %-12s | %-10s |\n",
                "ID", "NIM", "Nama", "Telepon", "Password");
        System.out.println("--------------------------------------------------------------------");

        for (mahasiswa mhs : list) {
            System.out.printf("| %-5d | %-15s | %-20s | %-12s | %-10s |\n",
                    mhs.getId_Mahasiswa(),
                    mhs.getNim(),
                    mhs.getNama(),
                    mhs.getTelepon(),
                    mhs.getPassword());
        }

        System.out.println("--------------------------------------------------------------------");
    }

    //menampilkan mahasiswa menurut id
    public mahasiswa findAllMahasiswa(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId_Mahasiswa() == id) {
                return list.get(i);
            }
        }
        return null;
    }
    //Cari nama berdasarkan ID
    public String findAdmin(int id) {
        return list.get(id).getNama();
    }

    //Debug
    public void set_passwordMhs(int idMahasiswa, String newPassword) {
        for (mahasiswa mhs : list) {
            if (mhs.getId_Mahasiswa() == idMahasiswa) {
                mhs.setPassword(newPassword);
                System.out.println("Password berhasil diubah: " + newPassword); // Debugging
                return;
            }
        }
        System.out.println("ID Mahasiswa tidak ditemukan!");
    }
}

/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Tugas.modul2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class tugas1 - Deskripsi singkat mengenai kelas ini.
 */
public class tugas1 {

    // Constructor
    public tugas1() {
        // Inisialisasi jika diperlukan
    }

    /**
     * Metode utama yang dijalankan saat program dimulai.
     *
     * @param args Argumen baris perintah
     */
    public static void main(String[] args) {

        boolean stay = true;
        Scanner input = new Scanner(System.in);

        listAdmin daftarAdmin = new listAdmin();
        listMahasiswa daftarMahasiswa = new listMahasiswa();

        while (stay) {
            System.out.println("");
            System.out.println("\t==========Aplikasi Login System==========");
            System.out.println("");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Mahasiswa");
            System.out.println("3. Keluar");

            System.out.print("Pilih opsi: ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.println("\t==========ADMIN LOGIN==========");
                System.out.print("Masukkan nama : ");
                String nama = input.nextLine();
                System.out.print("Masukkan password : ");
                String password = input.nextLine();
                if (daftarAdmin.validateAdmin(nama, password)) {
                    System.out.println("=-=Login Admin Berhasil!=-=");
                    adminMenu(input, daftarAdmin);
                } else {
                    System.out.println("Login Admin Gagal!");
                }
            } else if (pilihan == 2) {
                System.out.println("\t==========MAHASISWA LOGIN==========");
                System.out.print("Masukkan nim : ");
                String nim = input.nextLine();
                System.out.print("Masukkan password : ");
                String password = input.nextLine();
                if (daftarMahasiswa.validateMahasiswa(nim, password)) {
                    System.out.println("=-=Login Mahasiswa Berhasil!=-=");
                    mahasiswaMenu(input, daftarMahasiswa);
                } else {
                    System.out.println("Login Mahasiswa Gagal!");
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan aplikasi.");
                stay = false;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        input.close();
    }

    private static void adminMenu(Scanner input, listAdmin daftarAdmin) {

        int pilihanAdmin;
        do {
            System.out.println("\n=== ADMIN DASHBOARD ===");
            System.out.println("1. List Admin");
            System.out.println("2. Ubah Password Admin");
            System.out.println("3. Tambah Admin");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            pilihanAdmin = input.nextInt();
            input.nextLine();

            switch (pilihanAdmin) {
                case 1:
                    daftarAdmin.Tampil_admin();
                    break;
                case 2:
                    System.out.print("Masukkan ID Admin: ");
                    int idAdmin = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Password Baru: ");
                    String newPassword = input.nextLine();
                    daftarAdmin.set_passwordAdmin(idAdmin, newPassword);
                    break;
                case 3:
                    System.out.print("Masukkan ID Admin : ");
                    idAdmin = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukan Nama Admin : ");
                    String nama = input.nextLine();
                    System.out.print("Masukan Alamat Admin : ");
                    String alamat = input.nextLine();
                    System.out.print("Masukan Nomor Telp Admin : ");
                    String noTelp = input.nextLine();
                    System.out.print("Masukkan Password Admin : ");
                    String password = input.nextLine();

                    daftarAdmin.tambah_Admin(idAdmin, nama, alamat, noTelp, password);
                    break;
                case 4:
                    System.out.println("Keluar dari menu Admin.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihanAdmin != 4);
    }

    private static void mahasiswaMenu(Scanner input, listMahasiswa daftarMahasiswa) {
        int pilihanMahasiswa;
        do {
            System.out.println("\n=== MAHASISWA DASHBOARD ===");
            System.out.println("1. List Mahasiswa");
            System.out.println("2. Ubah Password Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            pilihanMahasiswa = input.nextInt();
            input.nextLine();

            switch (pilihanMahasiswa) {
                case 1:
                    daftarMahasiswa.Tampil_mahasiswa();
                    break;
                case 2:
                    System.out.print("Masukkan Id Mahasiswa: ");
                    int idMahasiswa = input.nextInt(); // Ganti dari idAdmin ke idMahasiswa
                    input.nextLine();
                    System.out.print("Masukkan Password Baru: ");
                    String newPassword = input.nextLine();
                    daftarMahasiswa.set_passwordMhs(idMahasiswa, newPassword);
                    break;
                case 3:
                    System.out.println("Keluar dari menu Mahasiswa.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihanMahasiswa != 3);
    }

}

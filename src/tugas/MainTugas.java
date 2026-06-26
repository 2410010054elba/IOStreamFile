/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Nama: Muhammad Elba Hasani
// NPM : 2410010054
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Array kategori, ukuran tetap
        String[] kategori = {"Elektronik", "Sembako", "Alat Tulis", "Pakaian"};

        System.out.println("== Daftar Kategori ==");
        for (String k : kategori) {
            System.out.println("- " + k);
        }
        System.out.println();

        // Membuat gudang dan mengisi minimal 5 barang
        Gudang gudang = new Gudang("barang.txt");
        gudang.tambahBarang(new Barang("Kabel HDMI", 35000, 20));
        gudang.tambahBarang(new Barang("Beras 5kg", 65000, 50));
        gudang.tambahBarang(new Barang("Pulpen", 3000, 100));
        gudang.tambahBarang(new Barang("Kaos Polos", 45000, 30));
        gudang.tambahBarang(new Barang("Mouse Wireless", 75000, 15));

        gudang.tampilkanSemua();
        System.out.println("Total nilai persediaan: Rp" + gudang.totalNilai());
        gudang.simpanKeBerkas();

        System.out.println();

        // Membuktikan data tersimpan: objek baru, muat ulang dari berkas
        Gudang gudangLain = new Gudang("barang.txt");
        gudangLain.muatDariBerkas();
        gudangLain.tampilkanSemua();
        System.out.println("Total nilai persediaan (setelah dimuat ulang): Rp" + gudangLain.totalNilai());
    }
}

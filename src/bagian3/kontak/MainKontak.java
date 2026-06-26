/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@mail.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@mail.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@mail.com"));
        buku.tampilkanSemua();
        buku.simpanKeBerkas();

        System.out.println();

        buku.cariKontak("Budi");
        buku.cariKontak("Eka");

        System.out.println();

        buku.hapusKontak("Andi");
        buku.tampilkanSemua();

        System.out.println();

        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
    }
}
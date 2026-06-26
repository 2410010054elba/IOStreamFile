/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        try {
            // Soal 1: Cek laporan.txt
            File laporan = new File("laporan.txt");
            if (laporan.exists()) {
                System.out.println("Berkas ada, ukuran: " + laporan.length() + " byte");
            } else {
                System.out.println("Berkas laporan.txt tidak ditemukan.");
            }

            // Soal 2: Buat folder arsip
            File folder = new File("arsip");
            boolean berhasilBuatFolder = folder.mkdir();
            if (berhasilBuatFolder) {
                System.out.println("Folder arsip berhasil dibuat.");
            } else {
                System.out.println("Folder arsip gagal dibuat (mungkin sudah ada).");
            }

            // Soal 3: Buat lalu hapus sementara.txt
            File sementara = new File("sementara.txt");
            sementara.createNewFile();
            System.out.println("Sebelum dihapus, ada? " + sementara.exists());
            sementara.delete();
            System.out.println("Sesudah dihapus, ada? " + sementara.exists());

        } catch (IOException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}
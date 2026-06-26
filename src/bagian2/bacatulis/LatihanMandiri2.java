/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiri2 {
    public static void main(String[] args) {

        // Soal 1
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            for (String h : hari) {
                penulis.println(h);
            }
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        System.out.println("== Isi hari.txt setelah ditulis ==");
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        // Soal 2
        try (PrintWriter penulis2 = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulis2.println("Sabtu");
            penulis2.println("Minggu");
        } catch (IOException e) {
            System.out.println("Gagal menambah: " + e.getMessage());
        }

        System.out.println("== Isi hari.txt setelah ditambah ==");
        try (BufferedReader pembaca2 = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca2.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        // Soal 3
        int jumlah = 0;
        try (BufferedReader pembaca3 = new BufferedReader(new FileReader("hari.txt"))) {
            while (pembaca3.readLine() != null) {
                jumlah++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
        System.out.println("Jumlah baris: " + jumlah);
    }
}
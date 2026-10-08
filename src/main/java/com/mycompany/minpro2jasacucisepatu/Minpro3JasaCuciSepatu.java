package com.mycompany.minpro2jasacucisepatu;

import Controller.TransaksiController;
import Model.Admin;
import Model.Kasir;
import Model.Pelanggan;
import Model.Sepatu;
import Model.SepatuBoot;
import Model.SepatuSneakers;
import Model.Transaksi;
import View.Menu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Minpro3JasaCuciSepatu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Admin admin = new Admin("admin", "admin123");
        Kasir kasir = new Kasir("kasir", "kasir123");

        boolean berhasilLogin = false;
        String role = "";

        System.out.println();
        System.out.println("========================================");
        System.out.println("     SISTEM MANAJEMEN JASA CUCI SEPATU");
        System.out.println("========================================");
        System.out.println("                 LOGIN");
        System.out.println("========================================");

        for (int percobaan = 1; percobaan <= 3; percobaan++) {

            System.out.print("Username : ");
            String username = input.nextLine().trim();

            System.out.print("Password : ");
            String password = input.nextLine().trim();

            if (admin.login(username, password)) {

                berhasilLogin = true;
                role = "Admin";

                System.out.println();
                System.out.println("Login berhasil. Selamat datang, "
                        + admin.getUsername() + "!");
                System.out.println("Role : Admin");

                break;
            }

            if (kasir.login(username, password)) {

                berhasilLogin = true;
                role = "Kasir";

                System.out.println();
                System.out.println("Login berhasil. Selamat datang, "
                        + kasir.getUsername() + "!");
                System.out.println("Role : Kasir");

                break;
            }

            System.out.println("Username atau password salah.");
            System.out.println("Percobaan ke-" + percobaan + " dari 3.");
            System.out.println();
        }

        if (!berhasilLogin) {
            System.out.println("Batas percobaan login telah habis.");
            System.out.println("Program dihentikan.");
            input.close();
            return;
        }


        loadingAnimation();

        TransaksiController controller = new TransaksiController();

        String tanggal = LocalDate.now().format(
                DateTimeFormatter.ofPattern("dd-MM-yyyy")
        );


        Pelanggan pelanggan1 = new Pelanggan(
                "PL001",
                "Syahla",
                "081234567890",
                "Samarinda",
                true
        );

        Sepatu sepatu1 = new SepatuSneakers(
                "SP001",
                "Nike",
                "Putih"
        );

        Transaksi transaksi1 = new Transaksi(
                "TR001",
                pelanggan1,
                sepatu1,
                "Deep Clean",
                35000,
                tanggal,
                "Menunggu"
        );

        controller.tambah(transaksi1);


        Pelanggan pelanggan2 = new Pelanggan(
                "PL002",
                "Cala",
                "082345678901",
                "Bontang",
                false
        );

        Sepatu sepatu2 = new SepatuBoot(
                "SP002",
                "Dr. Martens",
                "Hitam"
        );

        Transaksi transaksi2 = new Transaksi(
                "TR002",
                pelanggan2,
                sepatu2,
                "Fast Clean",
                20000,
                tanggal,
                "Diproses"
        );

        controller.tambah(transaksi2);

        Menu menu = new Menu(controller, role, input);
        menu.tampilkanMenu();

        input.close();
    }


    private static void loadingAnimation() {

  
        System.out.print("Memuat sistem ");

        for (int i = 0; i < 3; i++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.print(".");
        }

        System.out.println(" Selesai!");
        System.out.println("Sistem siap digunakan.");
    }
}
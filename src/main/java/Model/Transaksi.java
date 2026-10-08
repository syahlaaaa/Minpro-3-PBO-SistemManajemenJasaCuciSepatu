package Model;

import java.util.Random;

public class Transaksi implements CetakStruk {

    private final String idTransaksi;
    private final Pelanggan pelanggan;
    private final Sepatu sepatu;
    private final String promo;
    private final int persentaseDiskon;

    private String jenisLayanan;
    private int harga;
    private String tanggal;
    private String status;

    public Transaksi(
            String idTransaksi,
            Pelanggan pelanggan,
            Sepatu sepatu,
            String jenisLayanan,
            int harga,
            String tanggal,
            String status) {

        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.sepatu = sepatu;
        this.jenisLayanan = jenisLayanan;
        this.harga = harga;
        this.tanggal = tanggal;
        this.status = status;

        Random random = new Random();
        int pilihanPromo = random.nextInt(3);

        if (pilihanPromo == 0) {
            this.promo = "Diskon 10%";
            this.persentaseDiskon = 10;
        } else if (pilihanPromo == 1) {
            this.promo = "Diskon 5%";
            this.persentaseDiskon = 5;
        } else {
            this.promo = "Tidak ada promo";
            this.persentaseDiskon = 0;
        }
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Sepatu getSepatu() {
        return sepatu;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPromo() {
        return promo;
    }

    public int getPersentaseDiskon() {
        return persentaseDiskon;
    }

    public double getDiskon() {
        return harga * persentaseDiskon / 100.0;
    }

    public double getTotalHarga() {
        return harga - getDiskon();
    }

    public void tampilkanData() {
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Tanggal      : " + tanggal);
        System.out.println("ID Pelanggan : "
                + pelanggan.getIdPelanggan());
        System.out.println("Pelanggan    : "
                + pelanggan.getNama());
        System.out.println("No. Telepon  : "
                + pelanggan.getNoTelepon());
        System.out.println("Alamat       : "
                + pelanggan.getAlamat());

        System.out.println("ID Sepatu    : "
                + sepatu.getIdSepatu());
        System.out.println("Merek        : "
                + sepatu.getMerek());

        sepatu.tampilkanJenis();

        System.out.println("Warna        : "
                + sepatu.getWarna());
        System.out.println("Layanan      : "
                + jenisLayanan);
        System.out.println("Harga Awal   : Rp"
                + harga);
        System.out.println("Promo        : "
                + promo);
        System.out.println("Diskon       : Rp"
                + (int) getDiskon());
        System.out.println("Total        : Rp"
                + (int) getTotalHarga());
        System.out.println("Status       : "
                + status);
    }

    public void tampilkanData(boolean singkat) {
        if (singkat) {
            System.out.println("ID Transaksi : "
                    + idTransaksi);
            System.out.println("Pelanggan    : "
                    + pelanggan.getNama());
            System.out.println("Sepatu       : "
                    + sepatu.getMerek());
            System.out.println("Layanan      : "
                    + jenisLayanan);
            System.out.println("Promo        : "
                    + promo);
            System.out.println("Total        : Rp"
                    + (int) getTotalHarga());
            System.out.println("Status       : "
                    + status);
        } else {
            tampilkanData();
        }
    }

    @Override
    public void cetak() {
        System.out.println();
        System.out.println("========================================");
        System.out.println("          STRUK CUCI SEPATU");
        System.out.println("========================================");
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Tanggal      : " + tanggal);
        System.out.println("Pelanggan    : "
                + pelanggan.getNama());
        System.out.println("No. Telepon  : "
                + pelanggan.getNoTelepon());
        System.out.println("Sepatu       : "
                + sepatu.getMerek());

        sepatu.tampilkanJenis();

        System.out.println("Warna        : "
                + sepatu.getWarna());
        System.out.println("Layanan      : "
                + jenisLayanan);
        System.out.println("Harga Awal   : Rp"
                + harga);
        System.out.println("Promo        : "
                + promo);
        System.out.println("Diskon       : Rp"
                + (int) getDiskon());
        System.out.println("Total Bayar  : Rp"
                + (int) getTotalHarga());
        System.out.println("Status       : "
                + status);
        System.out.println("========================================");
        System.out.println("      Terima kasih telah menggunakan");
        System.out.println("          jasa cuci sepatu kami!");
        System.out.println("========================================");
    }
}
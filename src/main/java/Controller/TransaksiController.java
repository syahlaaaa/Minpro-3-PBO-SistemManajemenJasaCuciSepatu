package Controller;

import Model.Transaksi;
import java.util.ArrayList;

public class TransaksiController {

    private final ArrayList<Transaksi> daftarTransaksi;

    public TransaksiController() {
        daftarTransaksi = new ArrayList<>();
    }

    public boolean tambah(Transaksi transaksi) {
        if (transaksi == null) {
            return false;
        }

        for (Transaksi data : daftarTransaksi) {
            if (data.getIdTransaksi().equalsIgnoreCase(
                    transaksi.getIdTransaksi())) {
                return false;
            }
        }

        daftarTransaksi.add(transaksi);
        return true;
    }

    public ArrayList<Transaksi> getDaftarTransaksi() {
    return new ArrayList<>(daftarTransaksi);
}

    public String generateIdPelanggan() {
        int nomorTerbesar = 0;

        for (Transaksi transaksi : daftarTransaksi) {
            String id = transaksi.getPelanggan().getIdPelanggan();

            if (id != null && id.startsWith("PL")) {
                try {
                    int nomor = Integer.parseInt(id.substring(2));

                    if (nomor > nomorTerbesar) {
                        nomorTerbesar = nomor;
                    }
                } catch (NumberFormatException e) {
                  
                }
            }
        }

        return String.format("PL%03d", nomorTerbesar + 1);
    }

    public String generateIdSepatu() {
        int nomorTerbesar = 0;

        for (Transaksi transaksi : daftarTransaksi) {
            String id = transaksi.getSepatu().getIdSepatu();

            if (id != null && id.startsWith("SP")) {
                try {
                    int nomor = Integer.parseInt(id.substring(2));

                    if (nomor > nomorTerbesar) {
                        nomorTerbesar = nomor;
                    }
                } catch (NumberFormatException e) {
                    
                }
            }
        }

        return String.format("SP%03d", nomorTerbesar + 1);
    }

    public String generateIdTransaksi() {
        int nomorTerbesar = 0;

        for (Transaksi transaksi : daftarTransaksi) {
            String id = transaksi.getIdTransaksi();

            if (id != null && id.startsWith("TR")) {
                try {
                    int nomor = Integer.parseInt(id.substring(2));

                    if (nomor > nomorTerbesar) {
                        nomorTerbesar = nomor;
                    }
                } catch (NumberFormatException e) {
                   
                }
            }
        }

        return String.format("TR%03d", nomorTerbesar + 1);
    }

    public boolean hapus(String idTransaksi) {
        for (int i = 0; i < daftarTransaksi.size(); i++) {
            if (daftarTransaksi.get(i).getIdTransaksi()
                    .equalsIgnoreCase(idTransaksi)) {

                daftarTransaksi.remove(i);
                return true;
            }
        }

        return false;
    }
}

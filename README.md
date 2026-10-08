# 😶‍🌫️ Sistem Manajemen Jasa Cuci Sepatu

 ## 👤 Identitas
 | Data | Keterangan |
|---|---|
| 👩 Nama | **Dliya Syahla Hariyanto** |
| 🆔 NIM | **2509116095** |
| 📚 Program Studi | **Sistem Informasi** |
| 📖 Mata Kuliah | **Praktikum PBO** |

## 📌 Deskripsi Singkat
Sistem Manajemen Jasa Cuci Sepatu merupakan program berbasis Java Console yang digunakan untuk membantu pengelolaan transaksi jasa cuci sepatu.

Program ini memiliki fitur login dengan dua role, yaitu Admin dan Kasir. Admin memiliki akses untuk mengelola data transaksi, sedangkan Kasir memiliki akses untuk melihat data, mencari transaksi, dan mencetak struk.

Program juga menyediakan fitur pemilihan jenis sepatu, jenis layanan, validasi input, perubahan status transaksi, promo atau diskon, pencetakan struk, serta loading animation.

Program dikembangkan menggunakan konsep Object-Oriented Programming (OOP) dan menerapkan struktur MVC (Model, View, Controller).

---

# 2. Tujuan Program

Tujuan dibuatnya Sistem Manajemen Jasa Cuci Sepatu adalah:

1. Membuat simulasi sistem pengelolaan jasa cuci sepatu berbasis Java Console.
2. Mempermudah proses pencatatan data pelanggan, sepatu, dan transaksi.
3. Membantu pengelolaan status transaksi dari awal hingga selesai.
4. Memberikan pembagian hak akses antara Admin dan Kasir.
5. Menerapkan konsep Object-Oriented Programming (OOP) dalam sebuah program yang nyata.
6. Menerapkan struktur MVC agar program memiliki pemisahan antara Model, View, dan Controller.
7. Menerapkan validasi input agar data yang dimasukkan pengguna lebih terkontrol.
8. Memberikan pengalaman penggunaan program yang lebih interaktif melalui fitur promo, diskon, loading animation, dan pencetakan struk.

---

# 3. Fitur Program

Program memiliki beberapa fitur utama sebagai berikut:

### 3.1 Login

Program menyediakan sistem login sebelum pengguna dapat mengakses menu utama.

Terdapat dua role pengguna:

- Admin
- Kasir

Program memberikan maksimal 3 kali percobaan login.

---

### 3.2 Role Admin

Admin memiliki hak akses penuh terhadap pengelolaan transaksi.

Fitur yang dapat digunakan Admin:

1. Tambah Data
2. Lihat Data
3. Ubah Status Transaksi
4. Hapus Data
5. Cari Data
6. Cetak Struk
7. Keluar

#### Akun Admin

```text
Username : admin
Password : admin123
```
3.3 Role Kasir
Kasir memiliki hak akses yang lebih terbatas dibandingkan Admin.
Fitur yang dapat digunakan Kasir:
1. Lihat Data
2. Cari Data
3. Cetak Struk
4. Keluar
Kasir tidak memiliki akses untuk menghapus data atau mengubah status transaksi.
Akun Kasir
```
Username : kasir
Password : kasir123
```
Pembagian role ini digunakan untuk membedakan hak akses pengguna dalam sistem.
3.4 Tambah Data Transaksi
Admin dapat menambahkan transaksi baru.
Data yang dimasukkan meliputi:
- ID Pelanggan
- Nama Pelanggan
- Nomor Telepon
- Alamat
- ID Sepatu
- Jenis Sepatu
- Merek Sepatu
- Warna Sepatu
- Jenis Layanan
- Harga
- Tanggal Transaksi
- Status Transaksi
ID Pelanggan, ID Sepatu, dan ID Transaksi dibuat secara otomatis oleh sistem.
3.5 Pilihan Jenis Sepatu
Program menyediakan dua jenis sepatu:
- Sneakers
- Boots
Jenis sepatu diterapkan menggunakan konsep inheritance dan abstraction.
3.6 Pilihan Layanan
Program menyediakan dua pilihan layanan:
Layanan	Harga
Fast Clean	Rp20.000
Deep Clean	Rp35.000


3.7 Sistem Promo dan Diskon
Program memiliki fitur promo yang diberikan secara acak ketika transaksi dibuat.
Kemungkinan promo yang diperoleh:
- Diskon 10%
- Diskon 5%
- Tidak mendapatkan promo
Jika pengguna mendapatkan promo, program akan menampilkan informasi promo, jumlah potongan harga, dan total harga setelah diskon.
Perhitungan diskon dilakukan secara otomatis oleh sistem.
3.8 Perubahan Status Transaksi
Status transaksi memiliki alur:
Menunggu-Diproses-Selesai-Diambil

Pengguna juga dapat membatalkan transaksi selama transaksi belum berstatus final.
Status Diambil dan Batal dianggap sebagai status final.
3.9 Pencarian Data
Program menyediakan fitur pencarian/pemilihan transaksi untuk melihat informasi transaksi tertentu.
Informasi transaksi yang dapat ditampilkan meliputi:
- ID Transaksi
- Tanggal
- Data Pelanggan
- Data Sepatu
- Jenis Layanan
- Harga
- Promo
- Diskon
- Total Harga
- Status

3.10 Hapus Data
Admin dapat menghapus transaksi yang dipilih.
Namun transaksi yang sudah berstatus Diambil tidak dapat dihapus.
Hal ini dibuat agar data transaksi yang sudah selesai tidak langsung hilang dari sistem.
3.11 Cetak Struk
Program menyediakan fitur cetak struk transaksi.
Struk hanya dapat dicetak apabila status transaksi sudah:
Diambil

Struk berisi:
- ID Transaksi
- Tanggal
- Nama Pelanggan
- Nomor Telepon
- Merek Sepatu
- Jenis Sepatu
- Warna
- Layanan
- Harga Awal
- Promo
- Diskon
- Total Bayar
- Status
3.12 Validasi Input
Program menerapkan validasi untuk mengurangi kesalahan input pengguna.
Validasi yang diterapkan meliputi:
Validasi Nama
Nama:
- Hanya boleh berisi huruf dan spasi.
- Minimal 3 huruf.
- Maksimal 20 huruf.
Validasi Nomor Telepon
Nomor telepon:
- Harus diawali 08.
- Harus terdiri dari 10-13 digit.
Validasi Alamat
Alamat:
- Minimal 5 karakter.
- Maksimal 100 karakter.
- Harus mengandung huruf.
Input seperti:
1111111

tidak akan diterima sebagai alamat karena tidak mengandung huruf.
Validasi Pilihan Menu
Program juga memastikan pengguna hanya memasukkan pilihan yang tersedia.
Contohnya jika menu hanya menyediakan pilihan 1-4, pengguna tidak dapat memasukkan pilihan 5.

Struktur Package
Program menggunakan struktur MVC (Model, View, Controller).
Struktur project:

<img width="403" height="386" alt="image" src="https://github.com/user-attachments/assets/d655946d-7e68-4863-8d82-776339ace21c" />

# 5. Penjelasan Struktur MVC
5.1 Model
Package Model berisi class yang merepresentasikan objek dan data yang digunakan dalam program.
Class pada Model:
Admin.java
Digunakan untuk menyimpan username dan password Admin serta melakukan proses login.
Kasir.java
Digunakan untuk menyimpan username dan password Kasir serta melakukan proses login.
Pelanggan.java
Digunakan untuk menyimpan data pelanggan seperti:
- ID Pelanggan
- Nama
- Nomor Telepon
- Alamat
- Status Member
Sepatu.java
Merupakan abstract class yang menjadi superclass untuk objek sepatu.
SepatuSneakers.java
Merupakan subclass dari Sepatu yang digunakan untuk jenis sepatu Sneakers.
SepatuBoot.java
Merupakan subclass dari Sepatu yang digunakan untuk jenis sepatu Boots.
Transaksi.java
Digunakan untuk menyimpan data transaksi dan mengatur proses perhitungan promo, diskon, total harga, status transaksi, serta pencetakan struk.
CetakStruk.java
Merupakan interface yang digunakan untuk mendefinisikan kemampuan mencetak struk.
5.2 View
Package View berisi tampilan dan interaksi dengan pengguna.
Class yang terdapat di dalamnya:
Menu.java
Digunakan untuk:
- Menampilkan menu Admin.
- Menampilkan menu Kasir.
- Menerima input pengguna.
- Menampilkan data transaksi.
- Memproses pilihan menu.
- Melakukan validasi input.
5.3 Controller
Package Controller berisi class yang mengatur pengelolaan data transaksi.
TransaksiController.java
Digunakan untuk:
- Menambahkan transaksi.
- Mengambil daftar transaksi.
- Menghapus transaksi.
- Membuat ID pelanggan otomatis.
- Membuat ID sepatu otomatis.
- Membuat ID transaksi otomatis.
Controller menjadi penghubung antara data pada Model dengan proses pada View.

# 6. Penjelasan Alur Program
Alur utama program adalah sebagai berikut:

<img width="482" height="676" alt="image" src="https://github.com/user-attachments/assets/0424b774-a7bd-4e6c-a4e3-14cd510d4057" />

# 7. Alur Transaksi
Proses transaksi:

<img width="305" height="718" alt="image" src="https://github.com/user-attachments/assets/c3307ac5-7b05-4c22-babf-3bef910a2c12" />

# 8. Penerapan Encapsulation
Encapsulation diterapkan dengan menggunakan access modifier private pada atribut class.
Contohnya pada class Pelanggan:
```
private final String idPelanggan;
private String nama;
private String noTelepon;
private String alamat;
private boolean member;
```

Atribut tersebut tidak dapat diakses secara langsung dari luar class.
Untuk mengakses atau mengubah data digunakan getter dan setter.
Contohnya:
```
public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}
```
Penerapan encapsulation membantu menjaga data agar tidak dapat diubah secara sembarangan dari luar class.
# 9. Penerapan Inheritance
Inheritance diterapkan pada class Sepatu.
Class Sepatu digunakan sebagai superclass, sedangkan:
- SepatuSneakers
- SepatuBoot
digunakan sebagai subclass.
Contoh:
```
public class SepatuSneakers extends Sepatu
```
dan:
```
public class SepatuBoot extends Sepatu
```
Dengan inheritance, subclass dapat menggunakan atribut dan constructor yang berasal dari superclass.

# 10. Penerapan Abstraction
Abstraction diterapkan menggunakan abstract class dan abstract method.
Class Sepatu dibuat sebagai abstract class:
```
public abstract class Sepatu
```
Class tersebut memiliki abstract method:
```
public abstract void tampilkanJenis();
```
Abstract method tersebut kemudian diimplementasikan oleh subclass.
Dengan abstraction, Sepatu hanya menentukan bahwa setiap jenis sepatu harus memiliki method tampilkanJenis() tanpa menentukan implementasinya secara langsung.
# 11. Penerapan Polymorphism
Program menerapkan dua bentuk polymorphism, yaitu:
1. Overriding
2. Overloading
11.1 Polymorphism Overriding
Overriding diterapkan pada method tampilkanJenis().
Pada SepatuSneakers:
```
@Override
public void tampilkanJenis() {
    System.out.println("Jenis Sepatu : Sneakers");
}
```
Pada SepatuBoot:
```
@Override
public void tampilkanJenis() {
    System.out.println("Jenis Sepatu : Boots");
}
```
Method yang sama memiliki implementasi berbeda pada subclass.
Saat objek Sneakers digunakan:
```
Jenis Sepatu : Sneakers
```
Sedangkan saat objek Boots digunakan:
```
Jenis Sepatu : Boots
```

11.2 Polymorphism Overloading
Overloading diterapkan pada class Transaksi.
Terdapat dua method dengan nama yang sama:
```
public void tampilkanData()
```
dan:
```
public void tampilkanData(boolean singkat)
```
Kedua method memiliki parameter yang berbeda.
Jika dipanggil:
```
tampilkanData();
```
program menampilkan data transaksi secara singkat.
# 12. Penerapan Interface
Interface digunakan sebagai nilai tambah pada program.
Interface yang digunakan adalah:
```
public interface CetakStruk {
    void cetak();
}
```
Interface tersebut diimplementasikan oleh class Transaksi:
```
public class Transaksi implements CetakStruk
```
Method cetak() kemudian diimplementasikan:
```
@Override
public void cetak() {
    // proses pencetakan struk
}
```
Dengan interface tersebut, Transaksi memiliki kemampuan untuk mencetak struk.

# 13. Penerapan Keyword final
Keyword final digunakan untuk atribut yang nilainya tidak boleh diubah setelah objek dibuat.
Contohnya pada class Transaksi:
```
private final String idTransaksi;
private final Pelanggan pelanggan;
private final Sepatu sepatu;
```
final juga digunakan pada class Admin, Kasir, dan Pelanggan.
Penggunaan final membantu menjaga data tertentu agar tetap konsisten selama objek digunakan.
# 14. Penerapan Keyword super
Keyword super digunakan pada constructor subclass untuk memanggil constructor dari superclass.
Contohnya pada SepatuSneakers:
```
super(idSepatu, merek, warna);
```
dan pada SepatuBoot:
```
super(idSepatu, merek, warna);
```
super digunakan untuk menginisialisasi atribut yang berasal dari class Sepatu.

#15. Penerapan Role Admin dan Kasir
Program memiliki dua role pengguna dengan hak akses yang berbeda.
Admin
Admin bertanggung jawab terhadap pengelolaan transaksi.
Hak akses: 
-Tambah Data
-Lihat Data
- Ubah Status
- Hapus Data
- Cari Data
- Cetak Struk
- Keluar

Kasir
Kasir bertugas melihat informasi transaksi dan mencetak struk.
Hak akses:
-Lihat Data
-Cari Data
-Cetak Struk
-Keluar

# 16. Penerapan Nilai Tambah
Nilai tambah yang diterapkan pada program adalah interface.
Interface yang digunakan:
CetakStruk

Interface digunakan untuk mendefinisikan method cetak() yang kemudian diimplementasikan oleh class Transaksi.
Selain interface, program juga memiliki beberapa fitur tambahan untuk meningkatkan interaktivitas program, yaitu:
- Role Admin dan Kasir.
- Sistem promo dan diskon.
- Loading animation.
- Validasi input.
- ID transaksi otomatis.
- ID pelanggan otomatis.
- ID sepatu otomatis.
- Sistem perubahan status transaksi.
- Pencetakan struk.
- Pembatasan hak akses berdasarkan role.

# 17. Perhitungan Promo dan Diskon
Program memberikan promo secara acak.
Kemungkinan promo:
```
Diskon 10%
Diskon 5%
Tidak ada promo
```
```
Rumus diskon:
Diskon = Harga × Persentase Diskon / 100
```
```
Rumus total harga:
Total Harga = Harga Awal - Diskon
```
Contoh:
```
Harga Awal    : Rp35.000
Diskon 10%    : Rp3.500
Total Bayar   : Rp31.500
```

## Penjelasan Screenshot Program

# Admin

1.  Halaman Login
Gambar menunjukkan halaman awal program yang digunakan untuk melakukan login. Pengguna dapat masuk sebagai Admin atau Kasir menggunakan username dan password yang telah ditentukan. Program memberikan maksimal 3 kali percobaan login.

<img width="395" height="125" alt="image" src="https://github.com/user-attachments/assets/6819499d-1edc-4668-9817-fd04a4924793" />

2.  Login Berhasil dan Loading Animation
Setelah username dan password benar, program menampilkan pesan login berhasil dan role pengguna. Selanjutnya program menjalankan loading animation sebelum masuk ke menu utama.
Gambar menunjukkan menu yang dapat diakses oleh Admin. Admin memiliki hak akses untuk menambah data, melihat data, mengubah status transaksi, menghapus data, mencari data, mencetak struk, dan keluar dari program.

<img width="420" height="572" alt="image" src="https://github.com/user-attachments/assets/520c2da7-33c6-41ca-9c06-ea5c80311c9d" />

2.  Tambah Data
Gambar menunjukkan proses penambahan data transaksi yang meliputi data pelanggan, sepatu, layanan, dan tanggal transaksi. ID pelanggan, ID sepatu, dan ID transaksi dibuat secara otomatis oleh sistem.

<img width="348" height="757" alt="image" src="https://github.com/user-attachments/assets/a79ef174-14b2-4579-a9d6-79dd597a367c" />

3.  Lihat Data
Gambar menunjukkan tampilan data transaksi yang telah tersimpan di dalam sistem. Data yang ditampilkan meliputi informasi pelanggan, sepatu, layanan, harga, promo, total harga, tanggal, dan status transaksi.

<img width="380" height="785" alt="image" src="https://github.com/user-attachments/assets/7b37101d-99bd-4cc0-98dc-0b0d4f79f16d" />


4. Ubah Status Transaksi
Gambar menunjukkan proses mengubah status transaksi sesuai dengan tahapan pengerjaan sepatu. Status transaksi dapat diubah dari Menunggu, Diproses, Selesai, hingga Diambil.

<img width="462" height="303" alt="image" src="https://github.com/user-attachments/assets/a6048af7-6800-4c57-9751-b8bb56ff60c9" />


6.  Hapus Data
Gambar menunjukkan proses penghapusan data transaksi yang sudah tidak diperlukan. Sistem akan meminta pengguna memilih transaksi yang ingin dihapus, kemudian data tersebut akan dihapus dari daftar transaksi.

<img width="397" height="262" alt="image" src="https://github.com/user-attachments/assets/2019cfcb-e353-492d-890c-98f3112da641" />

7.Cari Data
Gambar menunjukkan fitur Cari Data yang digunakan untuk mencari dan menampilkan detail transaksi tertentu. Fitur ini memudahkan Admin dalam menemukan informasi transaksi yang sudah tersimpan di dalam sistem.

<img width="415" height="397" alt="image" src="https://github.com/user-attachments/assets/26d6cec1-20a1-4110-802b-5a51571b5b2c" />

8.Cetak Struk
Gambar menunjukkan proses mencetak struk transaksi yang berisi informasi pelanggan, sepatu, layanan, harga, promo, total pembayaran, dan status transaksi. Fitur ini digunakan sebagai bukti transaksi setelah sepatu selesai dan berstatus Diambil.

<img width="407" height="477" alt="image" src="https://github.com/user-attachments/assets/53be0496-6297-47d4-908c-0b30e58cfe53" />

9. Keluar Program
Gambar menunjukkan proses ketika pengguna memilih menu Keluar. Sistem akan mengakhiri penggunaan program dan menampilkan pesan bahwa pengguna telah keluar dari sistem.

<img width="632" height="452" alt="image" src="https://github.com/user-attachments/assets/5296e702-a058-4ebc-bcc6-7b93a8cc1f6f" />

# Kasir

1.Menu Kasir
Gambar menunjukkan Menu Kasir yang digunakan untuk mengelola transaksi dengan akses yang lebih terbatas dibandingkan Admin. Kasir dapat melihat data, mencari data, dan mencetak struk transaksi.

<img width="425" height="510" alt="image" src="https://github.com/user-attachments/assets/cf07a779-cf3b-4e4e-918f-bd739ca1f62d" />


2.Lihat Data Kasir
Gambar menunjukkan data transaksi yang dapat dilihat oleh Kasir. Informasi yang ditampilkan meliputi data pelanggan, sepatu, layanan, harga, promo, total harga, tanggal, dan status transaksi. Fitur ini membantu Kasir mengetahui informasi transaksi yang sedang diproses.

<img width="317" height="782" alt="image" src="https://github.com/user-attachments/assets/20775b98-5d7d-4df6-9a6c-936d72f5f7a4" />

3. Cetak Struk Kasir
Gambar menunjukkan fitur Cetak Struk yang tersedia pada Menu Kasir. Kasir dapat mencetak struk apabila transaksi sudah berstatus Diambil. Status transaksi tersebut sebelumnya harus sudah diproses hingga selesai oleh Admin.

<img width="407" height="630" alt="image" src="https://github.com/user-attachments/assets/88a1f28c-ace9-47fd-9e63-2f375547830f" />


4.Keluar Program
Gambar menunjukkan pengguna memilih menu Keluar untuk mengakhiri penggunaan sistem. Setelah memilih menu tersebut, sistem menampilkan pesan bahwa program telah selesai dan proses penggunaan sistem dihentikan.

<img width="687" height="375" alt="image" src="https://github.com/user-attachments/assets/7f02ab7f-74a7-4172-854e-85e162e5d0b1" />

## Kesimpulan
Sistem Manajemen Jasa Cuci Sepatu merupakan aplikasi Java Console yang dibuat untuk mensimulasikan proses pengelolaan jasa pencucian sepatu.
Program tidak hanya menerapkan fitur transaksi, tetapi juga menerapkan berbagai konsep Object-Oriented Programming seperti encapsulation, inheritance, abstraction, polymorphism, dan interface.
Program juga menggunakan struktur MVC untuk memisahkan bagian Model, View, dan Controller sehingga struktur kode menjadi lebih terorganisir.
Selain fitur utama, program memiliki fitur tambahan seperti role Admin dan Kasir, validasi input, promo dan diskon, loading animation, pembuatan ID otomatis, pengelolaan status transaksi, dan pencetakan struk.
Dengan penerapan tersebut, program diharapkan dapat menjadi simulasi sederhana sistem manajemen jasa cuci sepatu yang interaktif sekaligus menunjukkan penerapan konsep OOP dalam Java.


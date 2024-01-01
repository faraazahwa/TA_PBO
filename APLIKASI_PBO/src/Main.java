import AplikasiJavaBerbasisOOP.Log_in;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pilih;
        int pilih1;
        boolean jawab = true;

        System.out.println();
        System.out.println("=====Pemograman Aplikasi Pendataan Barang di Bidang Wirausaha dengan Konsep OOP Berbasis Java=====");
        System.out.println();
        System.out.println("1. LOGIN");
        System.out.println("2. LOGOUT");
        System.out.println();

        while (jawab) {
            Log_in login = new Log_in() {
                @Override
                public void tampil() {

                }
            };
            Barang Thing1 = new Barang();
            Barang1 Thing2 = new Barang1();
            Barang2 Thing3 = new Barang2();

            login.setUsername("faraazahwa");
            login.setPassword(123456);

            Scanner input;
            input = new Scanner(System.in);
            System.out.print("Pilih = ");
            pilih = input.nextInt();
            System.out.println();

            if (pilih == 1) {
                System.out.println("--------- Silahkan LOGIN ---------");
                while (jawab) {
                    System.out.println();
                    System.out.print("Username = ");
                    String user = input.next();
                    System.out.print("Password = ");
                    int pass = input.nextInt();
                    System.out.println();

                    if (login.getUsername().equals(user) && login.getPassword()==pass) {
                        System.out.println("OOOOOOO Login Berhasil OOOOOOO");
                        break;

                    } else {
                        System.out.println("XXXXXXX Login Gagal XXXXXXX");
                        System.out.println();
                        System.out.println("------- Silahkan Login Ulang -------");
                    }
                }

                System.out.println();
                System.out.println("======= Menu Utama =======");
                System.out.println();
                System.out.println("1. Input Data Barang");
                System.out.println("2. Tampilkan Data Barang");
                System.out.println("3. Update Spesifik Data Barang");
                System.out.println("4. Kembali Ke Halaman Menu LOGIN");
                System.out.println();
                while (jawab) {

                    System.out.print("Pilih = ");
                    pilih1 = input.nextInt();
                    System.out.println();

                    if (pilih1 == 1) {
                        System.out.println();
                        System.out.println("======= Menu 1 =======");
                        System.out.println();
                        System.out.println("1. Input Data Barang 1");
                        System.out.println("2. Input Data Barang 2");
                        System.out.println("3. Input Data Barang 3");
                        System.out.println("4. Tampilkan Data Barang");
                        System.out.println("5. Kembali Ke Halaman Menu Utama");
                        System.out.println();

                        while (jawab) {

                            System.out.print("Pilih = ");
                            pilih1 = input.nextInt();
                            System.out.println();

                            if (pilih1 == 1) {
                                System.out.println("------- Input Data Barang 1 -------");
                                System.out.println();
                                System.out.print("Kode Barang : ");
                                String KBarang = input.next();
                                System.out.print("Nama Supplier : ");
                                String NSupplier = input.next();
                                System.out.print("Tanggal Masuk (dd-mm-yyyy) : ");
                                String TSimpan = input.next();
                                System.out.print("Nama Barang : ");
                                String NBarang = input.next();
                                System.out.print("Jenis Barang : ");
                                String JBarang = input.next();
                                System.out.print("Satuan Barang : ");
                                String SBarang = input.next();
                                System.out.print("Harga Satuan : ");
                                int HSatuan = input.nextInt();
                                System.out.print("Stok : ");
                                int Stk = input.nextInt();
                                System.out.println();

                                System.out.println("[      DATA BARANG 1      ]");
                                System.out.println();

                                Thing1.KodeBarang = KBarang;
                                Thing1.NamaSupplier = NSupplier;
                                Thing1.TanggalSimpan = TSimpan;
                                Thing1.NamaBarang = NBarang;
                                Thing1.JenisBarang = JBarang;
                                Thing1.SatuanBarang = SBarang;
                                Thing1.HargaSatuan = HSatuan;
                                Thing1.Stok = Stk;
                                Thing1.tampil();
                                System.out.println();
                                System.out.println("======= Menu 1 =======");
                                System.out.println();
                                System.out.println("1. Input Data 1");
                                System.out.println("2. Input Data 2");
                                System.out.println("3. Input Data 3");
                                System.out.println("4. Tampilkan Data Barang");
                                System.out.println("5. Kembali Ke Halaman Menu Utama");
                                System.out.println();
                                continue;
                            }

                            if (pilih1 == 2) {
                                System.out.println("------- Input Data Barang 2 -------");
                                System.out.println();
                                System.out.print("Kode Barang : ");
                                String KoeBarang = input.next();
                                System.out.print("Nama Supplier : ");
                                String NamSupplier = input.next();
                                System.out.print("Tanggal Masuk (dd-mm-yyyy) : ");
                                String TanSimpan = input.next();
                                System.out.print("Nama Barang : ");
                                String NammBarang = input.next();
                                System.out.print("Jenis Barang : ");
                                String JenBarang = input.next();
                                System.out.print("Satuan Barang : ");
                                String SatBarang = input.next();
                                System.out.print("Harga Satuan : ");
                                int HarSatuan = input.nextInt();
                                System.out.print("Stok : ");
                                int tk = input.nextInt();
                                System.out.println();

                                System.out.println("[      DATA BARANG 2      ]");
                                System.out.println();

                                Thing2.KoBarang = KoeBarang;
                                Thing2.NaSupplier = NamSupplier;
                                Thing2.TaSimpan = TanSimpan;
                                Thing2.NaBarang = NammBarang;
                                Thing2.JeBarang = JenBarang;
                                Thing2.SaBarang = SatBarang;
                                Thing2.HaSatuan = HarSatuan;
                                Thing2.Stk = tk;
                                Thing2.tampil();
                                System.out.println();
                                System.out.println("======= Menu 1 =======");
                                System.out.println();
                                System.out.println("1. Input Data 1");
                                System.out.println("2. Input Data 2");
                                System.out.println("3. Input Data 3");
                                System.out.println("4. Tampilkan Data Barang");
                                System.out.println("5. Kembali Ke Halaman Menu Utama");
                                System.out.println();
                                continue;
                            }

                            if (pilih1 == 3) {
                                System.out.println("------- Input Data Barang 3 -------");
                                System.out.println();
                                System.out.print("Kode Barang : ");
                                String kBarang = input.next();
                                System.out.print("Nama Supplier : ");
                                String nSupplier = input.next();
                                System.out.print("Tanggal Masuk (dd-mm-yyyy) : ");
                                String tSimpan = input.next();
                                System.out.print("Nama Barang : ");
                                String nBarang = input.next();
                                System.out.print("Jenis Barang : ");
                                String jBarang = input.next();
                                System.out.print("Satuan Barang : ");
                                String sBarang = input.next();
                                System.out.print("Harga Satuan : ");
                                int hSatuan = input.nextInt();
                                System.out.print("Stok : ");
                                int stk = input.nextInt();
                                System.out.println();

                                System.out.println("[      DATA BARANG 3      ]");
                                System.out.println();

                                Thing3.KBarang = kBarang;
                                Thing3.NSupplier = nSupplier;
                                Thing3.TSimpan = tSimpan;
                                Thing3.NBarang = nBarang;
                                Thing3.JBarang = jBarang;
                                Thing3.SBarang = sBarang;
                                Thing3.HSatuan = hSatuan;
                                Thing3.St = stk;
                                Thing3.tampil();
                                System.out.println();
                                System.out.println("======= Menu 1 =======");
                                System.out.println();
                                System.out.println("1. Input Data 1");
                                System.out.println("2. Input Data 2");
                                System.out.println("3. Input Data 3");
                                System.out.println("4. Tampilkan Data Barang");
                                System.out.println("5. Kembali Ke Halaman Menu Utama");
                                System.out.println();
                                continue;
                            }

                            if (pilih1 == 4) {
                                System.out.println("--------- Tampil Data Yang Ada ---------");
                                System.out.println();
                                System.out.println("[      DATA BARANG 1      ]");
                                System.out.println();
                                Thing1.tampil();
                                System.out.println("[      DATA BARANG 2      ]");
                                System.out.println();
                                Thing2.tampil();
                                System.out.println("[      DATA BARANG 3      ]");
                                System.out.println();
                                Thing3.tampil();
                                System.out.println();
                                System.out.println("======= Menu 1 =======");
                                System.out.println();
                                System.out.println("1. Input Data 1");
                                System.out.println("2. Input Data 2");
                                System.out.println("3. Input Data 3");
                                System.out.println("4. Tampilkan Data Barang");
                                System.out.println("5. Kembali Ke Halaman Menu Utama");
                                System.out.println();
                                continue;
                            }

                            if (pilih1 > 5) {
                                System.out.println("XXXXXXX Mohon Maaf Tidak Ada Pilihan Pada Sistem XXXXXXX");
                                System.out.println();
                                System.out.print("------- Silahkan Pilih Menu Yang Tersedia -------");
                                System.out.println();
                                System.out.println();
                                System.out.println("======= Menu 1 =======");
                                System.out.println();
                                System.out.println("1. Input Data 1");
                                System.out.println("2. Input Data 2");
                                System.out.println("3. Input Data 3");
                                System.out.println("4. Tampilkan Data Barang");
                                System.out.println("5. Kembali Ke Halaman Menu Utama");
                                System.out.println();
                            } else {
                                System.out.print("******* Kembali Ke Halaman Utama *******");
                                System.out.println();
                                System.out.print("======= Menu Utama =======");
                                System.out.println();
                                System.out.println("1. Input Data/Input Data Baru");
                                System.out.println("2. Tampilkan Data Barang");
                                System.out.println("3. Update Spesifik Data Barang");
                                System.out.println("5. Kembali Ke Halaman Menu LOGIN");
                                System.out.println();
                                break;
                            }
                        }
                        continue;
                    }

                    if (pilih1 == 2) {
                        System.out.println("======= Menu 2 =======");
                        System.out.println();
                        System.out.println("[      DATA BARANG 1      ]");
                        System.out.println();
                        Thing1.tampil();
                        System.out.println();
                        System.out.println("[      DATA BARANG 2      ]");
                        System.out.println();
                        Thing2.tampil();
                        System.out.println();
                        System.out.println("[      DATA BARANG 3      ]");
                        System.out.println();
                        Thing3.tampil();
                        System.out.println();
                        System.out.print("======= Menu Utama =======");
                        System.out.println();
                        System.out.println("1. Input Data/Input Data Baru");
                        System.out.println("2. Tampilkan Data Barang");
                        System.out.println("3. Update Spesifik Data Barang");
                        System.out.println("4. Kembali Ke Halaman Menu LOGIN");
                        System.out.println();
                        continue;
                    }

                    if (pilih1 == 3) {
                        System.out.println();
                        System.out.println("======= Menu 3 =======");
                        System.out.println();
                        System.out.println("1. Update Data 1");
                        System.out.println("2. Update Data 2");
                        System.out.println("3. Update Data 3");
                        System.out.println("4. Tampilkan Data Barang");
                        System.out.println("5. Kembali Ke Halaman Menu Utama");
                        System.out.println();
                        while (jawab) {
                            System.out.print("Pilih = ");
                            pilih1 = input.nextInt();
                            System.out.println();

                            if (pilih1 == 1) {
                                while (jawab) {
                                    System.out.println();
                                    System.out.println("------- Silahkan Pilih Data Barang 1 Yang Akan Update -------");
                                    System.out.println();
                                    System.out.println("1. Kode barang");
                                    System.out.println("2. Nama Supplier");
                                    System.out.println("3. Tanggal Simpan");
                                    System.out.println("4. Nama Barang");
                                    System.out.println("5. Jenis Barang");
                                    System.out.println("6. Satuan Barang");
                                    System.out.println("7. Harga Satuan");
                                    System.out.println("8. Stok");
                                    System.out.println("9. Tampilkan Data Barang Data 1");
                                    System.out.println("10. Kembali Ke Halaman Menu 3");
                                    System.out.println();
                                    System.out.print("Pilih = ");
                                    pilih1 = input.nextInt();
                                    System.out.println();

                                    if (pilih1 == 1) {
                                        System.out.print("Kode Barang : ");
                                        String KBarang = input.next();
                                        System.out.println();
                                        Thing1.KodeBarang = KBarang;
                                        continue;
                                    }

                                    if (pilih1 == 2) {
                                        System.out.print("Nama Supplier : ");
                                        String NSupplier = input.next();
                                        System.out.println();
                                        Thing1.NamaSupplier = NSupplier;
                                        continue;
                                    }

                                    if (pilih1 == 3) {
                                        System.out.print("Tanggal Masuk (dd-mm-yyyy) : ");
                                        String TSimpan = input.next();
                                        System.out.println();
                                        Thing1.TanggalSimpan = TSimpan;
                                        continue;
                                    }

                                    if (pilih1 == 4) {
                                        System.out.print("Nama Barang : ");
                                        String NBarang = input.next();
                                        System.out.println();
                                        Thing1.NamaBarang = NBarang;
                                        continue;
                                    }

                                    if (pilih1 == 5) {
                                        System.out.print("Jenis Barang : ");
                                        String JBarang = input.next();
                                        System.out.println();
                                        Thing1.JenisBarang = JBarang;
                                        continue;
                                    }

                                    if (pilih1 == 6) {

                                        System.out.print("Satuan Barang : ");
                                        String SBarang = input.next();
                                        System.out.println();
                                        Thing1.SatuanBarang = SBarang;
                                        continue;
                                    }

                                    if (pilih1 == 7) {
                                        System.out.print("Harga Satuan : ");
                                        int HSatuan = input.nextInt();
                                        System.out.println();
                                        Thing1.HargaSatuan = HSatuan;
                                        continue;
                                    }

                                    if (pilih1 == 8) {
                                        System.out.print("Stok : ");
                                        int Stk = input.nextInt();
                                        System.out.println();
                                        Thing1.Stok = Stk;
                                        continue;
                                    }

                                    if (pilih1 == 9) {
                                        System.out.println("[      DATA BARANG 1      ]");
                                        System.out.println();
                                        Thing1.tampil();
                                        System.out.println();
                                        continue;
                                    }

                                    if (pilih1 > 10) {
                                        System.out.print("XXXXXX Mohon Maaf Tidak Ada Pilihan Pada Sistem XXXXXX");
                                        System.out.println();
                                    } else {
                                        System.out.println();
                                        System.out.print("****** Kembali Ke Halaman Menu 3 ******");
                                        System.out.println();
                                        System.out.println("======= Menu 3 =======");
                                        System.out.println();
                                        System.out.println("1. Update Data 1");
                                        System.out.println("2. Update Data 2");
                                        System.out.println("3. Update Data 3");
                                        System.out.println("4. Tampilkan Data Barang");
                                        System.out.println("5. Kembali Ke Halaman Menu Utama");
                                        System.out.println();
                                        break;
                                    }
                                }
                                continue;
                            }
                            if (pilih1 == 2) {
                                while (jawab) {
                                    System.out.println("------- Silahkan Pilih Data Barang 2 Yang Akan Update -------");
                                    System.out.println();
                                    System.out.println("1. Kode barang");
                                    System.out.println("2. Nama Supplier");
                                    System.out.println("3. Tanggal Simpan");
                                    System.out.println("4. Nama Barang");
                                    System.out.println("5. Jenis Barang");
                                    System.out.println("6. Satuan Barang");
                                    System.out.println("7. Harga Satuan");
                                    System.out.println("8. Stok");
                                    System.out.println("9. Tampilkan Data Barang Data 2");
                                    System.out.println("10. Kembali Ke Halaman Menu 3");
                                    System.out.println();
                                    System.out.print("Pilih = ");
                                    pilih1 = input.nextInt();
                                    System.out.println();

                                    if (pilih1 == 1) {
                                        System.out.print("Kode Barang : ");
                                        String KoeBarang = input.next();
                                        System.out.println();
                                        Thing2.KoBarang = KoeBarang;

                                        continue;
                                    }

                                    if (pilih1 == 2) {
                                        System.out.print("Nama Supplier : ");
                                        String NamSupplier = input.next();
                                        System.out.println();
                                        Thing2.NaSupplier = NamSupplier;
                                        continue;
                                    }

                                    if (pilih1 == 3) {
                                        System.out.print("Tanggal Masuk (dd-mm-yyyy) : ");
                                        String TanSimpan = input.next();
                                        System.out.println();
                                        Thing2.TaSimpan = TanSimpan;
                                        continue;
                                    }

                                    if (pilih1 == 4) {
                                        System.out.print("Nama Barang : ");
                                        String NammBarang = input.next();
                                        System.out.println();
                                        Thing2.NaBarang = NammBarang;
                                        continue;
                                    }

                                    if (pilih1 == 5) {
                                        System.out.print("Jenis Barang : ");
                                        String JenBarang = input.next();
                                        System.out.println();
                                        Thing2.JeBarang = JenBarang;
                                        continue;
                                    }

                                    if (pilih1 == 6) {

                                        System.out.print("Satuan Barang : ");
                                        String SatBarang = input.next();
                                        System.out.println();
                                        Thing2.SaBarang = SatBarang;
                                        continue;
                                    }

                                    if (pilih1 == 7) {
                                        System.out.print("Harga Satuan : ");
                                        int HarSatuan = input.nextInt();
                                        System.out.println();
                                        Thing2.HaSatuan = HarSatuan;
                                        continue;
                                    }

                                    if (pilih1 == 8) {
                                        System.out.print("Stok : ");
                                        int tk = input.nextInt();
                                        System.out.println();
                                        Thing2.Stk = tk;
                                        continue;
                                    }

                                    if (pilih1 == 9) {
                                        System.out.println("[      DATA BARANG 2      ]");
                                        System.out.println();
                                        Thing2.tampil();
                                        System.out.println();
                                        continue;
                                    }

                                    if (pilih1 > 10) {
                                        System.out.print("XXXXXX Mohon Maaf Tidak Ada Pilihan Pada Sistem XXXXXX");
                                        System.out.println();
                                    } else {
                                        System.out.print("****** Kembali Ke Halaman Menu 3 ******");
                                        System.out.println();
                                        System.out.println("======= Menu 3 =======");
                                        System.out.println();
                                        System.out.println("1. Update Data 1");
                                        System.out.println("2. Update Data 2");
                                        System.out.println("3. Update Data 3");
                                        System.out.println("4. Tampilkan Data Barang");
                                        System.out.println("5. Kembali Ke Halaman Menu Utama");
                                        System.out.println();
                                        break;
                                    }
                                }
                                continue;
                            }
                            if (pilih1 == 3) {
                                while (jawab) {
                                    System.out.println("------- Silahkan Pilih Data Barang 3 Yang Akan Update -------");
                                    System.out.println();
                                    System.out.println("1. Kode barang");
                                    System.out.println("2. Nama Supplier");
                                    System.out.println("3. Tanggal Simpan");
                                    System.out.println("4. Nama Barang");
                                    System.out.println("5. Jenis Barang");
                                    System.out.println("6. Satuan Barang");
                                    System.out.println("7. Harga Satuan");
                                    System.out.println("8. Stok");
                                    System.out.println("9. Tampilkan Data Barang Data 3");
                                    System.out.println("10. Kembali Ke Halaman Menu 3");
                                    System.out.println();
                                    System.out.print("Pilih = ");
                                    pilih1 = input.nextInt();
                                    System.out.println();

                                    if (pilih1 == 1) {
                                        System.out.print("Kode Barang : ");
                                        String kBarang = input.next();
                                        System.out.println();
                                        Thing3.KBarang = kBarang;

                                        continue;
                                    }

                                    if (pilih1 == 2) {
                                        System.out.print("Nama Supplier : ");
                                        String nSupplier = input.next();
                                        System.out.println();
                                        Thing3.NSupplier = nSupplier;
                                        continue;
                                    }

                                    if (pilih1 == 3) {
                                        System.out.print("Tanggal Masuk (dd-mm-yyyy) : ");
                                        String tSimpan = input.next();
                                        System.out.println();
                                        Thing3.TSimpan = tSimpan;
                                        continue;
                                    }

                                    if (pilih1 == 4) {
                                        System.out.print("Nama Barang : ");
                                        String nBarang = input.next();
                                        System.out.println();
                                        Thing3.NBarang = nBarang;
                                        continue;
                                    }

                                    if (pilih1 == 5) {
                                        System.out.print("Jenis Barang : ");
                                        String jBarang = input.next();
                                        System.out.println();
                                        Thing3.JBarang = jBarang;
                                        continue;
                                    }

                                    if (pilih1 == 6) {

                                        System.out.print("Satuan Barang : ");
                                        String sBarang = input.next();
                                        System.out.println();
                                        Thing3.SBarang = sBarang;
                                        continue;
                                    }

                                    if (pilih1 == 7) {
                                        System.out.print("Harga Satuan : ");
                                        int hSatuan = input.nextInt();
                                        System.out.println();
                                        Thing3.HSatuan = hSatuan;
                                        continue;
                                    }

                                    if (pilih1 == 8) {
                                        System.out.print("Stok : ");
                                        int stk = input.nextInt();
                                        System.out.println();
                                        Thing3.St = stk;
                                        continue;
                                    }

                                    if (pilih1 == 9) {
                                        System.out.println("[      DATA BARANG 3      ]");
                                        System.out.println();
                                        Thing3.tampil();
                                        System.out.println();
                                        continue;
                                    }

                                    if (pilih1 > 10) {
                                        System.out.print("XXXXXX Mohon Maaf Tidak Ada Pilihan Pada Sistem XXXXXX");
                                        System.out.println();
                                    } else {
                                        System.out.print("****** Kembali Ke Halaman Menu 3 ******");
                                        System.out.println();
                                        System.out.println("======= Menu 3 =======");
                                        System.out.println();
                                        System.out.println("1. Update Data 1");
                                        System.out.println("2. Update Data 2");
                                        System.out.println("3. Update Data 3");
                                        System.out.println("4. Tampilkan Data Barang");
                                        System.out.println("5. Kembali Ke Halaman Menu Utama");
                                        System.out.println();
                                        break;
                                    }
                                }
                                continue;
                            }

                            if (pilih1 == 4) {
                                System.out.println("--------- Tampil Data Yang Ada ---------");
                                System.out.println();
                                System.out.println("[      DATA BARANG 1      ]");
                                System.out.println();
                                Thing1.tampil();
                                System.out.println();
                                System.out.println("[      DATA BARANG 2      ]");
                                System.out.println();
                                Thing2.tampil();
                                System.out.println();
                                System.out.println("[      DATA BARANG 3      ]");
                                System.out.println();
                                Thing3.tampil();
                                System.out.println();
                                System.out.println("======= Menu 3 =======");
                                System.out.println();
                                System.out.println("1. Update Data 1");
                                System.out.println("2. Update Data 2");
                                System.out.println("3. Update Data 3");
                                System.out.println("4. Tampilkan Data Barang");
                                System.out.println("5. Kembali Ke Halaman Menu Utama");
                                System.out.println();
                                continue;
                            }
                            if (pilih1 > 5) {
                                System.out.println("XXXXXXX Mohon Maaf Tidak Ada Pilihan Pada Sistem XXXXXXX");
                                System.out.println();
                                System.out.print("------- Silahkan Pilih Menu -------");
                                System.out.println();
                                System.out.println();
                                System.out.print("======= Menu 3 =======");
                                System.out.println();
                                System.out.println("1. Update Data 1");
                                System.out.println("2. Update Data 2");
                                System.out.println("3. Update Data 3");
                                System.out.println("4. Tampilkan Data Barang");
                                System.out.println("5. Kembali Ke Halaman Menu Utama");
                                System.out.println();
                            } else {
                                System.out.print("******* Kembali Ke Halaman Menu Utama *******");
                                System.out.println();
                                System.out.print("======= Menu Utama =======");
                                System.out.println();
                                System.out.println("1. Input Data/Input Data Baru");
                                System.out.println("2. Tampilkan Data Barang");
                                System.out.println("3. Update Spesifik Data Barang");
                                System.out.println("4. Kembali Ke Halaman LOGIN");
                                System.out.println();
                                break;
                            }
                        }
                        continue;
                    }

                    if (pilih1 > 4) {
                        System.out.println("XXXXXXX Mohon Maaf Tidak Ada Pilihan Pada Sistem XXXXXXX");
                        System.out.println();
                        System.out.print("------- Silahkan Pilih Menu Yang Tersedia -------");
                        System.out.println();
                        System.out.print("======= Menu Utama =======");
                        System.out.println();
                        System.out.println("1. Input Data/Input Data Baru");
                        System.out.println("2. Tampilkan Data Barang");
                        System.out.println("3. Update Spesifik Data Barang");
                        System.out.println("4. Kembali Ke Halaman LOGIN");
                        System.out.println();
                    } else {
                        System.out.print("******* Kembali Ke Halaman LOGIN *******");
                        System.out.println();
                        System.out.println();
                        System.out.print("--------- Silahkan Pilih ---------");
                        System.out.println();
                        System.out.println();
                        System.out.println("1. LOGIN");
                        System.out.println("2. LOGOUT");
                        System.out.println();
                        break;
                    }
                }
                continue;
            }
            if (pilih > 2) {
                System.out.print("XXXXXXX Mohon Maaf Tidak Ada Pilihan Pada Sistem XXXXXXX");
                System.out.println();
                System.out.print("------- Silahkan Pilih Menu Yang Tersedia -------");
                System.out.println();
                System.out.println("1. LOGIN");
                System.out.println("2. LOGOUT");
                System.out.println();
            } else {
                System.out.println("OOOOOOO Anda Telah LOGOUT OOOOOOO");
                System.exit(0);
            }
        }
    }
}
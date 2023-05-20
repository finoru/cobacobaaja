import java.util.Scanner;

public class MoneyChanger_1402022070 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // MEMBUAT DEKLARASI UNTUK SCANNER
        String masukkanNama, masukkanUmur, masukkanGender, pilihUang;
        // MEMBUAT DEKLARASI UNTUK STRING
        int tukarUang;
        // MEMBUAT DEKLARASI UNTUK INT
        double punyaUang;
        // MEMBUAT DEKLARASI UNTUK DOUBLE

        System.out.println("--------------------------------------------------------");
        System.out.println("------PROGRAM MONEY CHANGER--------");
        System.out.println("-------------Dibuat oleh Ruffino Ahmad Noor/1402022070--------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("DATA DIRI");
        System.out.print("Masukkan nama Anda\t\t\t: ");
        masukkanNama = userInput.nextLine();
        // UNTUK MASUKAN USER
        System.out.print("Masukkan umur Anda\t\t\t: ");
        masukkanUmur = userInput.nextLine();
        // UNTUK MASUKAN USER
        System.out.print("Masukkan gender Anda(L/P)\t\t: ");
        masukkanGender = userInput.nextLine();
        // UNTUK MASUKAN USER

        String sebutanNama = "";
        switch (masukkanGender) { // UNTUK MEMBUAT PILIHAN TN ATAU NY
            case "L": case "l":
                sebutanNama = ("Tn. " + masukkanNama);
                break;
            case "P": case "p":
                sebutanNama = ("Ny. " + masukkanNama);
                break;
            default:
                sebutanNama = masukkanNama;
        }
        System.out.println("Selamat Datang " + sebutanNama);
        System.out.println("--------------------------------------------------------");

        if (Integer.parseInt(masukkanUmur) > 18) { // UNTUK KONDISI JIKA DIATAS 18 TAHUN
            System.out.println("List Mata Uang:");
            System.out.println("1. IDR");
            System.out.println("2. RM");
            System.out.println("3. USD");
            System.out.println("4. EURO");
            System.out.print("Pilih mata uang yang Anda miliki\t\t: ");
            pilihUang = userInput.nextLine();
            if (Integer.parseInt(pilihUang) == 1) { // UNTUK KONDISI JIKA MEMILIH PILIHAN 1
                System.out.print("Masukkan jumlah uang yang Anda tukar\t: Rp. ");
                punyaUang = userInput.nextDouble();
                // MASUKKAN USER
                System.out.println("==========IDR==========");
                System.out.println("List mata uang yang dapat ditukar:");
                System.out.println("1. IDR");
                System.out.println("2. RM");
                System.out.println("3. USD");
                System.out.println("4. EURO");
                System.out.print("Pilih mata uang yang ingin Anda tukar\t: ");
                tukarUang = userInput.nextInt();
                // MASUKKAN USER
                System.out.println("Uang Anda\t\t\t\t\t\t\t\t: Rp. " + punyaUang);
                System.out.println("=====Proses====");
                switch (tukarUang) { // UNTUK KONDISI JIKA MEMILIH PILIHAN 1 S.D 4
                    case 1:
                        punyaUang = punyaUang;
                        System.out.println("Hasil tukar uang dari IDR ke IDR adalah\t: " + "Rp. " + (float) punyaUang);
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                    case 2:
                        punyaUang = punyaUang * 0.0003;
                        System.out.println("Hasil tukar uang dari IDR ke RM adalah\t: " +  "RM " + (float) punyaUang );
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                    case 3:
                        punyaUang = punyaUang * 0.000064;
                        System.out.println("Hasil tukar uang dari IDR ke USD adalah\t: " + "$ " + (float) punyaUang);
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                    case 4:
                        punyaUang = punyaUang * 0.000065;
                        System.out.println("Hasil tukar uang dari IDR ke EURO adalah\t: " + (float) punyaUang + " EURO");
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                }
            } else if (Integer.parseInt(pilihUang) == 2) { // UNTUK KONDISI JIKA MEMILIH PILIHAN 2
                System.out.print("Masukkan jumlah uang yang Anda tukar\t: RM ");
                punyaUang = userInput.nextDouble();
                System.out.println("==========RM==========");
                System.out.println("List mata uang yang dapat ditukar:");
                System.out.println("1. IDR");
                System.out.println("2. RM");
                System.out.println("3. USD");
                System.out.println("4. EURO");
                System.out.print("Pilih mata uang yang ingin Anda tukar\t: ");
                tukarUang = userInput.nextInt();
                System.out.println("Uang Anda\t\t\t\t\t\t\t\t: RM " + punyaUang);
                System.out.println("=====Proses====");
                switch (tukarUang) { // UNTUK KONDISI JIKA MEMILIH PILIHAN 1 S.D 4
                    case 1:
                        punyaUang = punyaUang * 3306;
                        System.out.println("Hasil tukar uang dari RM ke IDR adalah\t: " + "Rp. " + (float) punyaUang);
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                    case 2:
                        punyaUang = punyaUang;
                        System.out.println("Hasil tukar uang dari RM ke RM adalah\t: " +  "RM " + (float) punyaUang );
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                    case 3:
                        punyaUang = punyaUang * 0.21;
                        System.out.println("Hasil tukar uang dari RM ke USD adalah\t: " + "$ " + (float) punyaUang);
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                    case 4:
                        punyaUang = punyaUang * 0.21;
                        System.out.println("Hasil tukar uang dari RM ke EURO adalah\t: " + (float) punyaUang + " EURO");
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                }
            } else if (Integer.parseInt(pilihUang) == 3) { // UNTUK KONDISI JIKA MEMILIH PILIHAN 1 S.D 4
                System.out.print("Masukkan jumlah uang yang Anda tukar\t: $ ");
                punyaUang = userInput.nextDouble();
                System.out.println("==========USD==========");
                System.out.println("List mata uang yang dapat ditukar:");
                System.out.println("1. IDR");
                System.out.println("2. RM");
                System.out.println("3. USD");
                System.out.println("4. EURO");
                System.out.print("Pilih mata uang yang ingin Anda tukar\t: ");
                tukarUang = userInput.nextInt();
                System.out.println("Uang Anda\t\t\t\t\t\t\t\t: $ " + punyaUang);
                System.out.println("=====Proses====");
                switch (tukarUang) { // UNTUK KONDISI JIKA MEMILIH PILIHAN 1 S.D 4
                    case 1:
                        punyaUang = punyaUang * 25698;
                        System.out.println("Hasil tukar uang dari USD ke IDR adalah\t: " + "Rp. " + (float) punyaUang);
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                    case 2:
                        punyaUang = punyaUang * 4.75;
                        System.out.println("Hasil tukar uang dari USD ke RM adalah\t: " +  "RM " + (float) punyaUang );
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                    case 3:
                        punyaUang = punyaUang;
                        System.out.println("Hasil tukar uang dari USD ke USD adalah\t: " + "$ " + (float) punyaUang);
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                    case 4:
                        punyaUang = punyaUang * 1.02;
                        System.out.println("Hasil tukar uang dari USD ke EURO adalah\t: " + (float) punyaUang + " EURO");
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                }
            } else if (Integer.parseInt(pilihUang) == 4) { // UNTUK KONDISI JIKA MEMILIH PILIHAN 1 S.D 4
                System.out.print("Masukkan jumlah uang yang Anda tukar\t: ");
                punyaUang = userInput.nextDouble();
                System.out.println("==========EURO==========");
                System.out.println("List mata uang yang dapat ditukar:");
                System.out.println("1. IDR");
                System.out.println("2. RM");
                System.out.println("3. USD");
                System.out.println("4. EURO");
                System.out.print("Pilih mata uang yang ingin Anda tukar\t: ");
                tukarUang = userInput.nextInt();
                System.out.println("Uang Anda\t\t\t\t\t\t\t\t: " + punyaUang + " EURO");
                System.out.println("=====Proses====");
                switch (tukarUang) { // UNTUK KONDISI JIKA MEMILIH PILIHAN 1 S.D 4
                    case 1:
                        punyaUang = punyaUang * 15416;
                        System.out.println("Hasil tukar uang dari EURO ke IDR adalah\t: " + "Rp. " + (float) punyaUang);
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                    case 2:
                        punyaUang = punyaUang * 1.02;
                        System.out.println("Hasil tukar uang dari EURO ke RM adalah\t: " +  "RM " + (float) punyaUang );
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                    case 3:
                        punyaUang = punyaUang * 4.66;
                        System.out.println("Hasil tukar uang dari EURO ke USD adalah\t: " + "$ " + (float) punyaUang);
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                    case 4:
                        punyaUang = punyaUang;
                        System.out.println("Hasil tukar uang dari EURO ke EURO adalah\t: " + (float) punyaUang + " EURO");
                        System.out.println("Terima Kasih Sudah Menggunakan Program Money Changer.");
                        break;
                }
            } else { // UNTUK KONDISI JIKA MEILIH PILIHAN DIATAS 4
                System.out.println("Maaf Mata Uang Yang Anda Pilih Belum Tersedia.");
            }
        } else { // KONDISI JIKA UMUR DIBAWAH 18
            System.out.println("Umur Anda Tidak Cukup Untuk Melanjutkan Program.");
        }
    }
}


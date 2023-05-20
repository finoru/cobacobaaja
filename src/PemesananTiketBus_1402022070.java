import  java.util.Arrays;
import java.util.Scanner;

public class PemesananTiketBus_1402022070 {
    public static void main(String[] args) {
        // Dibuat oleh Ruffino Ahmad Noor/1402022070
        Scanner userInput = new Scanner(System.in); // DEKLARASI SCANNER
        String[] tujuan = new String[3]; // ALASAN SAYA MEMAKAI STRING UNTUK MEMBUAT KALIMAT
        tujuan[0] = "Jakarta Brebes";
        tujuan[1] = "Wonosobo Yogyakarta";
        tujuan[2] = "Magelang Madiun";
        String[] jamKeberangkatan = new String[3]; // ALASAN SAYA MEMAKAI STRING UNTUK MEMBUAT KALIMAT
        jamKeberangkatan[0] = "0800";
        jamKeberangkatan[1] = "1230";
        jamKeberangkatan[2] = "0320";


        int pilihKelasTiket, pilihTujuan, jumlahPenumpang, pilihJamKeberangkatan; // ALASAN SAYA MEMAKAI INT KARENA MASUKKAN BERUPA ANGKA
        String namaPenumpang, kursiPenumpang; // ALASAN SAYA MEMAKAI STRING UNTUK MEMBUAT KALIMAT

        System.out.println("=================================================");
        System.out.println("   Selamat Datang di Program Pemesan tiket Bus");
        System.out.println("    Dibuat oleh Ruffino Ahmad Noor/1402022070");
        System.out.println("=================================================");
        System.out.println("Pilih kelas tiket Bus");
        System.out.println("1. Kelas Ekonomi");
        System.out.println("2. Kelas Ekspres");
        System.out.print("Pilih kelas tiket: ");
        pilihKelasTiket = userInput.nextInt();
        if (pilihKelasTiket <= 2) { // MEMILIH KELAS TIKET
            System.out.println(" ");
            System.out.println("Pilih tujuan keberangkatan");
            System.out.println("1. Jakarta - Brebes");
            System.out.println("2. Wonosobo - Yogyakarta");
            System.out.println("3. Magelang - Madiun");
            System.out.print("Pilih tujuan: ");
            pilihTujuan = userInput.nextInt();
            if (pilihTujuan <= 3) { // MEMILIH TUJUAN
                System.out.println(" ");
                System.out.print("Masukan jumlah Anggota penumpang: ");
                jumlahPenumpang = userInput.nextInt();
                userInput.nextLine();
                System.out.println("Anda memilih tujuan " + tujuan[pilihTujuan - 1]);
                String[] kumpulanNamaPenumpang = new String[jumlahPenumpang]; // ALASAN SAYA MEMAKAI STRING UNTUK MEMBUAT KALIMAT
                String[] kumpulanKursiPenumpang = new String[jumlahPenumpang]; // ALASAN SAYA MEMAKAI STRING UNTUK MEMBUAT KALIMAT
                String[] simpanJamKeberangkatan = new String[jumlahPenumpang]; // ALASAN SAYA MEMAKAI STRING UNTUK MEMBUAT KALIMAT
                String[] kodePenumpang = new String[jumlahPenumpang]; // ALASAN SAYA MEMAKAI STRING UNTUK MEMBUAT KALIMAT
                int loopingPenumpang = jumlahPenumpang;
                for (int i = 0; loopingPenumpang >= 1; i++) {
                    i++;
                    loopingPenumpang--;
                    System.out.println("Pendaftaran penumpang ke-" + i);
                    i--;
                    System.out.print("Masukan nama penumpang: ");
                    namaPenumpang = userInput.nextLine();
                    kumpulanNamaPenumpang[i] = namaPenumpang;
                    System.out.print("Masukan kursi Penumpang: ");
                    kursiPenumpang = userInput.next();
                    kumpulanKursiPenumpang[i] = kursiPenumpang;
                    kodePenumpang[i] = namaPenumpang.substring(0, 1).toUpperCase()
                            + namaPenumpang.substring(namaPenumpang.length() - 1).toUpperCase();
                    for (String jamB : jamKeberangkatan) {
                        System.out.print(" ");
                    }
                    System.out.println(" ");
                    System.out.println("Pilih jam keberangkatan:");
                    System.out.println("1. 08.00");
                    System.out.println("2. 12.30");
                    System.out.println("3. 03.20");
                    System.out.print("Pilih jam keberangkatan: ");
                    pilihJamKeberangkatan = userInput.nextInt();
                    userInput.nextLine();
                    if (pilihJamKeberangkatan == 1) {
                        simpanJamKeberangkatan[i] = jamKeberangkatan[0];
                    } else if (pilihJamKeberangkatan == 2) {
                        simpanJamKeberangkatan[i] = jamKeberangkatan[1];
                    } else if (pilihJamKeberangkatan == 3) {
                        simpanJamKeberangkatan[i] = jamKeberangkatan[2];
                    }
                    System.out.println(" ");
                }
                System.out.println("=====================================");
                System.out.println("Hasil Formulir Pendaftaran:");
                System.out.println("=====================================");
                System.out.println("|Nomor Kursi|\t\t" + "\t\t|Nama Penumpang|\t\t" + "\t\t|Kode Penumpang|\t\t" + "\t\t|Tujuan Penumpang|\t\t");
                for (int i = 0; i < jumlahPenumpang; i++) {
                    System.out.println(kumpulanKursiPenumpang[i].toUpperCase() + "\t\t\t\t\t" + kumpulanNamaPenumpang[i] + "\t\t\t\t\t\t" + kumpulanKursiPenumpang[i].toUpperCase() + "-" + tujuan[pilihTujuan-1].substring(0, 3).toUpperCase() + tujuan[pilihTujuan-1].substring(tujuan[pilihTujuan-1].indexOf(" ") + 1, tujuan[pilihTujuan-1].indexOf(" ") + 4).toUpperCase() + "-" + kodePenumpang[i] + "-" + simpanJamKeberangkatan[i] + "\t\t\t\t" + tujuan[pilihTujuan-1].replace(" ", "-"));
                }
                System.exit(0);
            } else {
                System.out.println("=============================================");
                System.out.println("Tidak ada pilihan tujuan tersebut diProgram ini.");
                System.exit(0);
            }
        } else {
            System.out.println("=============================================");
            System.out.println("Pilihan tiket tidak ada.");
        }
    }
}

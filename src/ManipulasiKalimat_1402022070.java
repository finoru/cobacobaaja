import java.util.Scanner;
import java.util.Arrays;

public class ManipulasiKalimat_1402022070 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // UNTUK DEKLRASI SCANNER
        String masukkanKalimat; // ALASAN SAYA MEMAKAI STRING KARENA INPUT BERUPA KALIMAT
        int menuPilihan; // ALASAN SAYA MEMAKAI INT UNTUK MEMBUAT PILIHAN 1 S.D 4
        boolean kondisi = true; // ALASAN SAYA MEMAKAI BOOLEAN UNTUK MENJALANKAN SYNTAX WHILE

        System.out.println("===============================================================================");
        System.out.println("-------------------------Program Manipulasi Kalimat----------------------------");
        System.out.println("-----------------Dibuat oleh Ruffino Ahmad Noor/1402022070---------------------");
        System.out.println("===============================================================================");
        System.out.println("Selamat datang diprogram Manipulasi Kalimat:");
        System.out.print("Silakan masukan Kalimat: ");
        masukkanKalimat = userInput.nextLine(); // INPUT BERUPA KALIMAT
        String[] simpanKalimat = new String[1]; // DEKLARASI ARRAY
        simpanKalimat[0] = masukkanKalimat; // MENYIMPAN INPUT DI ARRAY
        System.out.println("pilih menu manipulasi:");
        System.out.println("1. Urai kalimat menjadi kata");
        System.out.println("2. Hilangkan spasi");
        System.out.println("3. Membalikan kalimat");
        System.out.println("4. Urai kalimat menjadi huruf lalu diurutkan");
        while (kondisi) { // MEMBUAT PROSES LOOPING
            System.out.print("Menu pilihan: ");
            menuPilihan = userInput.nextInt();
            if (menuPilihan == 1) { // JIKA USER MEMILIH PILIHAN 1
                int hitungKata = 1; // ALASAN SAYA MENGGUNAKAN INT UNTUK OPERASI ARITMATIKA
                for (int i = 0; i < simpanKalimat[0].length()-1; i++) { // UNTUK MENGHITUNG KATA
                    if (simpanKalimat[0].charAt(i) == ' ' && simpanKalimat[0].charAt(i+1) != ' ') {
                        hitungKata++;
                    }
                } // AKHIR PROGRAM UNTUK MENGHITUNG JUMLAH KATA
                System.out.println("Kalimat " + "\"" + simpanKalimat[0] + "\" " + "mengandung " + hitungKata + " buah kata");
                String[] uraiKata = masukkanKalimat.split(" "); // ALASAN SAYA MENGGUNAKAN STING KARENA UNTUK MENYIMPAN KALIMAT
                System.out.println("Hasil Kalimat yang sudah diurai menjadi kata: " + Arrays.toString(uraiKata));
                System.out.print("Apakah anda ingin memilih menu lagi (Ya/Tidak) --> ");
                String stopMenu = userInput.next(); // ALASAN SAYA MENGGUNAKAN STRING KARENA INPUT BERUPA STRING
                if (stopMenu.equalsIgnoreCase("tidak")){ // JIKA USER MEMILIH TIDAK MELANJUTKAN PROGRAM
                    kondisi = false;
                }
            } else if (menuPilihan == 2) { // JIKA USER MEMILIH PILIHAN 2
                String tanpaSpasi = simpanKalimat[0].replaceAll(" ", ""); // ALASAN SAYA MENGGUNAKAN STRING KARENA UNTUK MENYIMPAN KALIMAT
                System.out.println("Hasil penghapusan spasi: " + tanpaSpasi);
                System.out.print("Apakah anda ingin memilih menu lagi (Ya/Tidak) --> ");
                String stopMenu = userInput.next(); // ALASAN SAYA MENGGUNAKAN STRING KARENA INPUT BERUPA STRING
                if (stopMenu.equalsIgnoreCase("tidak")){
                    kondisi = false;
                }
            } else if (menuPilihan == 3) { // JIKA USER MEMILIH PILIHAN 3
                String balikKalimat = ""; // ALASAN SAYA MENGGUNAKAN STRING KARENA UNTUK MENYIMPAN KALIMAT
                char balik;
                for (int i = 0;i < simpanKalimat[0].length();i++){ // PROGRAM MEMBALIKKAN KALIMAT
                    balik = simpanKalimat[0].charAt(i);
                    balikKalimat = balik + balikKalimat;
                } // AKHIR PROGRAM MEMBALIKKAN KALIMAT
                System.out.println("Kalimat sebelum dibalik: " + simpanKalimat[0]);
                System.out.println("Kalimat sesudah dibalik: " + balikKalimat);
                System.out.print("Apakah anda ingin memilih menu lagi (Ya/Tidak) --> ");
                String stopMenu = userInput.next(); // ALASAN SAYA MENGGUNAKAN STRING KARENA INPUT BERUPA STRING
                if (stopMenu.equalsIgnoreCase("tidak")){
                    kondisi = false;
                }
            } else if (menuPilihan == 4) { // JIKA MEMILIH PILIHAN 4
                int jumlahHuruf = simpanKalimat[0].replace(" ", "").length(); // ALASAN SAYA MENGGUNAKAN INT UNTUK OPERASI ARITMATIKA
                System.out.println("Kalimat " + "\"" + simpanKalimat[0] + "\" " + "mengandung " + jumlahHuruf + " buah huruf");
                String tanpaSpasi = simpanKalimat[0].replaceAll(" ", ""); // ALASAN SAYA MENGGUNAKA STRING KARENA MENYIMPAN KALIMAT
                char[] hurufKalimat = new char[tanpaSpasi.length()]; // ALASAN SAYA MENGGUNAKAN CHAR KARENA KELUARAN HARUS BERUPA HURUF SEPERTI YANG TERTERA DI PPT
                for (int i = 0; i < tanpaSpasi.length(); i++) {
                    hurufKalimat[i] = tanpaSpasi.charAt(i);
                }
                System.out.println("Hasil Kalimat yang sudah diurai menjadi huruf:");
                System.out.println("sebelum diurut:");
                System.out.println(Arrays.toString(hurufKalimat));
                System.out.println("sesudah diurut:");
                Arrays.sort(hurufKalimat);
                System.out.println(Arrays.toString(hurufKalimat));
                System.out.print("Apakah anda ingin memilih menu lagi (Ya/Tidak) --> ");
                String stopMenu = userInput.next(); // ALASAN SAYA MENGGUNAKAN STRING KARENA INPUT BERUPA STRING
                if (stopMenu.equalsIgnoreCase("tidak")){
                    kondisi = false;
                }
            } else { // JIKA TIDAK MEMILIH PILIHAN 1 S.D 4
                    System.out.println("Pilihan anda tidak tersedia");
                    System.out.println("silahkan pilih ulang!");
            } // AKHIR MENU PILIHAN
        } // AKHIR WHILE
        System.out.println("Terimakasih sudah menggunakan program ini");
        System.out.println("Sampai berjumpa kembali");
    }
}
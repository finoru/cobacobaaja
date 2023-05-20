import java.util.Scanner;
import java.util.Arrays;

public class OnlineShop_1402022070 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // DEKLARASI DAN INISIALISASI SCANNER;
        int pilihMenu, jumlahItem; // ALASAN SAYA MENGGUNAKAN INT KARENA INPUT BERUPA ANGKA
        boolean kondisiIsiKeranjang = true, kondisi = true; // ALASAN SAYA MENGGUNAKAN BOOLEAN KARENA UNTUK MEMBUAT KONDISI PADA WHILE
        String pilihUlang, namaItem; // ALASAN SAYA MENGGUNAKAN STRING KARENA INPUT BERUPA KALIMAT
        int harga, pilihEjaan; // ALASAN SAYA MENGGUNAKAN INT KARENA INPUT BERUPA ANGKA
        String[] item = new String[0]; // ALASAN SAYA MENGGUNAKAN STRING KARENA INPUT BERUPA KALIMAT DAN DIHARUSKAN DISIMPAN DI ARRAY
        int[] hargaItem = new int[0]; // ALASAN SAYA MENGGUNAKAN STRING KARENA INPUT BERUPA KALIMAT DAN DIHARUSKAN DISIMPAN DI ARRAY

        System.out.println("-----------------------------------------");
        System.out.println("            Program Online Shop          ");
        System.out.println("Dibuat oleh RUFFINO AHMAD NOOR/1402022070");
        System.out.println("-----------------------------------------");
        System.out.println("Pilihan:");
        System.out.println("1. Mengisi Keranjang");
        System.out.println("2. Filter mengeja item");
        System.out.println("3. Filter item sesuai Harga (Terendah - tertinggi)");
        System.out.println("4. Filter item sesuai Harga (Tertinggi - terendah)");
        while (kondisi) { // AWAL PROGRAM LOOPING MENU
            while (kondisiIsiKeranjang) { // AWAL PROGRAM UNTUK ISI KERANJANG
                System.out.print("Silahkan pilih menu: ");
                pilihMenu = userInput.nextInt();
                if (pilihMenu == 1) {
                    System.out.print("Jumlah item yang akan diCheckOut: ");
                    jumlahItem = userInput.nextInt();
                    item = new String[jumlahItem];
                    hargaItem = new int[jumlahItem];
                    System.out.println("-----------------------------------------");
                    System.out.println("Silahkan isi keranjang untuk diCheckOut");
                    System.out.println("-----------------------------------------");
                    int numberingPilihan1 = 1; // ALASAN SAYA MENGGUNAKAN INT UNTUK NUMBERING
                    for (int i = 0; i < jumlahItem; i++) {
                        System.out.print("Item " + numberingPilihan1 + ": ");
                        namaItem = userInput.next();
                        item[i] = namaItem;
                        System.out.print("Harga: ");
                        harga = userInput.nextInt();
                        hargaItem[i] = harga;
                        numberingPilihan1++;
                    }
                    System.out.println("Total Item: " + jumlahItem);
                    System.out.println("List Item:");
                    int numberingList = 1; // ALASAN SAYA MENGGUNAKAN INT UNTUK NUMBERING
                    for (int i = 0; i < jumlahItem; i++) {
                        System.out.println(numberingList + ". " + item[i] + " & " + hargaItem[i]);
                        numberingList++;
                    }
                    System.out.print("Apakah anda ingin melanjutkan (y/t)? ");
                    pilihUlang = userInput.next();
                    switch (pilihUlang) {
                        case "y":
                        case "Y":
                            kondisiIsiKeranjang = false;
                            break;
                        case "t":
                        case "T":
                            kondisiIsiKeranjang = false;
                            kondisi = false;
                            System.out.println("Terima kasih sudah menggunakan program ini");
                            System.exit(0);
                    }
                } else {
                    System.out.println("Anda Belum Mengisi Keranjang Segara Isi Keranjang Sekarang Juga");
                    System.out.print("Apakah anda ingin mengulang (y/t)? ");
                    pilihUlang = userInput.next();
                    switch (pilihUlang) {
                        case "y":
                        case "Y":
                            kondisiIsiKeranjang = true;
                            break;
                        case "t":
                        case "T":
                            kondisiIsiKeranjang = false;
                            kondisi = false;
                            System.out.println("Terima kasih sudah menggunakan program ini");
                            System.exit(0);
                    }
                }
            } // AKHIR PROGRAM UNTUK ISI KERANJANG
            System.out.println("Pilihan:");
            System.out.println("1. Mengisi Keranjang");
            System.out.println("2. Filter mengeja item");
            System.out.println("3. Filter item sesuai Harga (Terendah - tertinggi)");
            System.out.println("4. Filter item sesuai Harga (Tertinggi - terendah)");
            System.out.print("Silahkan pilih menu: ");
            pilihMenu = userInput.nextInt();
            if (pilihMenu == 2) {
                int numberingPilihan2 = 1; // ALASAN SAYA MENGGUNAKAN INT UNTUK NUMBERING
                for (String s: item) {
                    System.out.println(numberingPilihan2 + ". " + s);
                    numberingPilihan2++;
                }
                System.out.print("Pilih barang yang mau di eja? ");
                pilihEjaan = userInput.nextInt();
                char[] ejaan = item[pilihEjaan-1].toCharArray();
                System.out.println("List Mengeja Item:");
                int numberingPilihanEja = 1; // ALASAN SAYA MENGGUNAKAN INT UNTUK NUMBERING
                for (char susun : ejaan) {
                    System.out.println((numberingPilihanEja) + ". " + susun);
                    numberingPilihanEja++;
                }
            } else if (pilihMenu == 3) {
                for (int i = 0; i < hargaItem.length-1; i++) {
                    for (int j = 0; j < hargaItem.length-1; j++) {
                        if (hargaItem[j] > hargaItem[j + 1]) {
                            int ubahTempatHarga = hargaItem[j + 1];
                            hargaItem[j + 1] = hargaItem[j];
                            hargaItem[j] = ubahTempatHarga;
                            String ubahTempatItem = item[j + 1];
                            item[j + 1] = item[j];
                            item[j] = ubahTempatItem;
                        }
                    }
                }
                int numberingPilihan3 = 1; // ALASAN SAYA MENGGUNAKAN INT UNTUK NUMBERING
                for(int i = 0; i < hargaItem.length; i++) {
                    System.out.println(numberingPilihan3 + ". " + item[i] + " & " + hargaItem[i]);
                    numberingPilihan3++;
                }
            } else if (pilihMenu == 4) {
                for(int i = 0; i<hargaItem.length-1; i++){
                    for(int j=0; j<hargaItem.length-1; j++){
                        if (hargaItem[j] < hargaItem[j+1]){
                            int ubahTempatHarga = hargaItem[j+1];
                            hargaItem[j+1] = hargaItem[j];
                            hargaItem[j] = ubahTempatHarga;
                            String ubahTempatItem = item[j+1];
                            item[j+1] = item[j];
                            item[j] = ubahTempatItem;
                        }
                    }
                }
                int numberingPilihan4 = 1; // ALASAN SAYA MENGGUNAKAN INT UNTUK NUMBERING
                for(int i=0; i < hargaItem.length; i++){
                    System.out.println(numberingPilihan4 + ". " + item[i] + " & " + hargaItem[i]);
                    numberingPilihan4++;
                }
            }
            else {
                System.out.println("Maaf pilihan yang anda pilih belum tersedia");
            }
            System.out.print("Apakah anda ingin melanjutkan (y/t)? ");
            pilihUlang = userInput.next();
            switch (pilihUlang) {
                case "y":
                case "Y":
                    kondisi = true;
                    break;
                case "t":
                case "T":
                    System.out.println("Terima kasih sudah menggunakan program ini");
                    kondisi = false;
            }
        } // AKHIR PROGRAM LOOPING MENU
    }
}


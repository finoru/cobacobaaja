import java.util.Scanner;
public class RestoranYarsi_1402022070 {
    public static void main(String[] args) {
        ///////////////RUFFINO AHMAD NOOR/1402022070///////////////
        Scanner userInput = new Scanner(System.in);
        int dana = Integer.parseInt(args[0]);
        // Alasan saya menggunakan int karena untuk menyimpan nilai bilangan bulat untuk operasi selanjutnya

        String[] makanan = new String[4];
        // Alasan saya menggunakan String untuk menyimpan kalimat
        makanan[0] = "Soto Lamongan";
        makanan[1] = "Pempek Palembang";
        makanan[2] = "Kerang Hijau";
        makanan[3] = "Bubur Ayam Cirebon";

        int[] hargaMakanan = new int[4];
        // Alasan saya menggunakan int karena untuk menyimpan nilai bilangan bulat untuk operasi selanjutnya
        hargaMakanan[0] = 25000;
        hargaMakanan[1] = 48000;
        hargaMakanan[2] = 15000;
        hargaMakanan[3] = 15000;

        String[] minumanJus = new String[3];
        // Alasan saya menggunakan String untuk menyimpan kalimat
        minumanJus[0] = "Jeruk";
        minumanJus[1] = "Stroberi";
        minumanJus[2] = "Mangga";

        String[] minumanSoftdrink = new String[3];
        // Alasan saya menggunakan String untuk menyimpan kalimat
        minumanSoftdrink[0] = "Coca Cola";
        minumanSoftdrink[1] = "Fanta";
        minumanSoftdrink[2] = "Sprite";

        int[] hargaMinumanJus = new int[3];
        // Alasan saya menggunakan int karena untuk menyimpan nilai bilangan bulat untuk operasi selanjutnya
        hargaMinumanJus[0] = 12000;
        hargaMinumanJus[1] = 15000;
        hargaMinumanJus[2] = 16000;

        int[] hargaMinumanSofdrink = new int[3];
        // Alasan saya menggunakan int karena untuk menyimpan nilai bilangan bulat untuk operasi selanjutnya
        hargaMinumanSofdrink[0] = 10000;
        hargaMinumanSofdrink[1] = 11000;
        hargaMinumanSofdrink[2] = 9000;

        System.out.println("========================================");
        System.out.println("====Selamat Datang Di Restoran Yarsi====");
        System.out.println("=====Ruffino Ahmad Noor/1402022070======");
        System.out.println("========================================");
        ///////////////UNTUK MEMBUAT PILIHAN MENU///////////////
        if (dana >= 9000){
            System.out.println("Menu Kami Terdiri Dari:");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.print("Pilih menu: ");
            int pilihMenu = userInput.nextInt();
            System.out.println("========================================");

            if (pilihMenu == 1) { ///////////////UNTUK MEMILIH MENU 1///////////////
                System.out.println("Makanan:");
                System.out.println("1. " + makanan[0]);
                System.out.println("2. " + makanan[1]);
                System.out.println("3. " + makanan[2]);
                System.out.println("4. " + makanan[3]);
                System.out.print("Silahkan pilih pesanan: ");
                int pilihMakanan = userInput.nextInt();
                System.out.println("========================================");
                if (pilihMakanan <= 4) { ///////////////UNTUK MEMILIH MAKANAN///////////////
                    System.out.println("Anda memesan " + makanan[pilihMakanan - 1]);
                    System.out.print("Berapa jumlah yang ingin Anda pesan? ");
                    int jumlahMakanan = userInput.nextInt();
                    int totalHargaMakanan = hargaMakanan[pilihMakanan - 1] * jumlahMakanan;
                    System.out.println("Jumlah uang anda\t: " + dana);
                    System.out.println("Total harga yaitu\t: " + totalHargaMakanan);
                    if (dana >= totalHargaMakanan) {
                        System.out.println("Sisa uang Anda\t\t: " + (dana - totalHargaMakanan));
                    } else {
                        System.out.println("Maaf uang anda belum cukup");
                    }
                } else {
                    System.out.println("Maaf Menu Yang Anda Pilih Belum Tersedia");
                }
            } else if (pilihMenu == 2) { ///////////////UNTUK MEMILIH MENU 2///////////////
                System.out.println("Jenis Minuman:");
                System.out.println("1. Jus");
                System.out.println("2. Soft Drink");
                System.out.print("Silahkan Pilih Pesanan: ");
                int pilihMinuman = userInput.nextInt();
                System.out.println("========================================");
                if (pilihMinuman == 1) { ///////////////UNTUK MEMILIH MINUMAN///////////////
                    System.out.println("Jenis Jus:");
                    System.out.println("1. " + minumanJus[0]);
                    System.out.println("2. " + minumanJus[1]);
                    System.out.println("3. " + minumanJus[2]);
                    System.out.print("Silahkan Pilih Pesanan ");
                    int pilihJus = userInput.nextInt();
                    System.out.println("========================================");
                    if (pilihJus <= 3) {
                        System.out.println("Anda Memesan Jus " + minumanJus[pilihJus - 1]);
                        System.out.print("Berapa Jumlah Yang Ingin Anda Pesan? ");
                        int jumlahJus = userInput.nextInt();
                        int totalHargaJus = hargaMinumanJus[pilihJus - 1] * jumlahJus;
                        System.out.println("Jumlah Uang Anda\t: " + dana);
                        System.out.println("Total Harga Yaitu\t: " + totalHargaJus);
                        if (dana >= totalHargaJus) {
                            System.out.println("Sisa Uang Anda\t\t: " + (dana - totalHargaJus));
                        } else {
                            System.out.println("Maaf uang anda belum cukup");
                        }
                    } else {
                        System.out.println("Maaf Minuman Yang Anda Pilih Belum Tersedia");
                    }
                } else if (pilihMinuman == 2) {
                    System.out.println("Jenis Soft Drink:");
                    System.out.println("1. " + minumanSoftdrink[0]);
                    System.out.println("2. " + minumanSoftdrink[1]);
                    System.out.println("3. " + minumanSoftdrink[2]);
                    System.out.print("Silahkan Pilih Pesanan ");
                    int pilihSoftdrink = userInput.nextInt();
                    System.out.println("========================================");
                    if (pilihSoftdrink <= 3) {
                        System.out.println("Anda Memesan " + minumanSoftdrink[pilihSoftdrink - 1]);
                        System.out.print("Berapa Jumlah Yang Ingin Anda Pesan? ");
                        int jumlahSoftdrink = userInput.nextInt();
                        int totalHargaSoftdrink = hargaMinumanSofdrink[pilihSoftdrink - 1] * jumlahSoftdrink;
                        System.out.println("Jumlah Uang Anda\t: " + dana);
                        System.out.println("Total Harga yaitu\t: " + totalHargaSoftdrink);
                        if (dana >= totalHargaSoftdrink) {
                            System.out.println("Sisa Uang Anda\t\t: " + (dana - totalHargaSoftdrink));
                        } else {
                            System.out.println("Uang Anda belum Cukup");
                        }
                    } else {
                        System.out.println("Maaf Minuman Yang Anda Pilih Belum Tersedia");
                    }
                } else {
                    System.out.println("Maaf Jenis Minuman Yang Anda pilih Belum Tersedia");
                }
            } else {
                System.out.println("Maaf Menu Yang Anda Pilih Belum Tersedia");
            }

        } else {
            System.out.println("Maaf Uang Anda Belum Cukup");
        }

    }
}
import java.util.Scanner;
import java.lang.Math;

public class Spekulasi_1402022070 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // DEKLARASI SCANNER
        String masukkanNama; // ALASAN SAYA MENGGUNAKAN STRING UNTUK MENYIMPAN MASUKAN YANG BERUPA KALIMAT
        int masukkanAngka, pilihProgram; // ALASAN SAYA MENGGUNAKAN INT KARENA MASUKAN BERUPA ANGKA UNTUK DIGUNAKAN DI SWITCH
        int presentase, perkalian; // ALASAN SAYA MENGGUNAKAN INT KARENA UNTUK OPERASI ARITMATIKA

        System.out.println("==========================================");
        System.out.println("-------------Program Spekulasi------------");
        System.out.println("-----[RUFFINO AHMAD NOOR]/[1402022070-----");
        System.out.println("==========================================");
        System.out.print("Masukkan Nama: ");
        masukkanNama = userInput.nextLine();
        System.out.print("Masukkan Angka: ");
        masukkanAngka = userInput.nextInt();
        System.out.println("Selamat Datang " + masukkanNama);
        System.out.println("Pada Program Spekulasi");
        mencetakMenu();
        System.out.print("Pilih Program: ");
        pilihProgram = userInput.nextInt();
        switch (pilihProgram){
            case 1: // JIKA MEMILIH 1
                System.out.println("Program menghitung persentase masukan pengguna");
                System.out.println("Lalu mengkalikan masukan dengan angka kedua");
                System.out.println("Angka saat ini: " + masukkanAngka);
                System.out.print("Persentase yang diinginkan: ");
                presentase = userInput.nextInt();
                System.out.println("Angka setelah dipersentase: " + menghitungPresentase(masukkanAngka, presentase));
                System.out.print("Angka perkalian: ");
                perkalian = userInput.nextInt();
                System.out.println("Angka setelah dikalikan: " + menghitungPerkalian(masukkanAngka, presentase, perkalian));
                System.out.println("Program berhenti....");
                break;
            case 2: // JIKA MEMILIH 2
                System.out.println("Program mencari tahu apakah angka pengguna");
                System.out.println("Merupakan sebuah bilangan prima, lalu memodulo bilangannya");
                System.out.println("Dengan angka 2");
                System.out.println("Angka saat ini: " + masukkanAngka);
                System.out.println("Angka merupakan bilangan prima: " + mencariBilanganPrima(masukkanAngka));
                System.out.println("Angka dimodulo 2 adalah: " + menghitungModulo(masukkanAngka));
                System.out.println("Program berhenti....");
                break;
            default: // JIKA MEMILIH LEBIH DARI 2
                System.out.println("Tidak ada program tersebut");
                System.out.println("Program Berhenti.....");
        }


    }
    public static void mencetakMenu(){
        System.out.println("1. Menghitung Persentase Angka");
        System.out.println("2. Menyatakan Bilangan Prima");
    }
    public static int menghitungPresentase(double a, double b){
        System.out.println("Jalankan method");
        double angkaSetelahPersen = a * (b / 100);
        return (int) Math.round(angkaSetelahPersen);
    }

    public static int menghitungPerkalian(double a, double b, int c){
        System.out.println("Jalankan method");
        double angkaSetelahPersen = a * (b / 100);
        int hasil = (int) (Math.round(angkaSetelahPersen) * c);
        return hasil;
    }

    public static boolean mencariBilanganPrima(int a){
        System.out.println("Jalankan method");
        if (a < 2){
            return false;
        }
        for (int i = 2;i < a;){
            return a % i != 0;
        }
        return true;
    }

    public static int menghitungModulo(int a){
        int hasil = a % 2;
        return hasil;
    }
}

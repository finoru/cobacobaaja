import  java.util.Scanner;

public class UK_2_1402022070 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String masukkanPengguna = "";
        String hasilKondisiPersegi = "";
        String hasilKondisiPersegiPanjang = "";
        int sisi1, sisi2, hasilPersegi, panjang, lebar, hasilPersegiPanjang;
        System.out.println("====================================================================");
        System.out.println("----------------------Ruffino Ahmad Noor/2022070------------------- ");
        System.out.println("---------------------------Program Bangun datar----------------------------");
        System.out.println("====================================================================");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.print("Pilih Program: ");
        masukkanPengguna = userInput.nextLine();
        System.out.println("====================================================================");
        if (masukkanPengguna.equalsIgnoreCase("persegi")){
            System.out.print("Masukkan sisi1: ");
            sisi1 = userInput.nextInt();
            System.out.print("Masukkan sisi2: ");
            sisi2 = userInput.nextInt();
            int[] persegi = new int[2];
            persegi[0] = sisi1;
            persegi[1] = sisi2;
            hasilPersegi = persegi[0] * persegi[1];
            if (hasilPersegi < 100){
                hasilKondisiPersegi = "Hasil kurang dari 100";
            } else if (hasilPersegi > 100) {
                hasilKondisiPersegi = "Hasil lebih dari 100";
            } else if (hasilPersegi == 100) {
                hasilKondisiPersegi = "Hasil samadengan 100";
            }
            System.out.println("Hasil luas persegi adalah: " + hasilPersegi);
            System.out.println(hasilKondisiPersegi);
        } else if (masukkanPengguna.equalsIgnoreCase("persegi panjang")) {
            System.out.print("Masukkan panjang: ");
            panjang = userInput.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = userInput.nextInt();
            int[] persegiPanjang = new int[2];
            persegiPanjang[0] = panjang;
            persegiPanjang[1] = lebar;
            hasilPersegiPanjang = persegiPanjang[0] * persegiPanjang[1];
            if (hasilPersegiPanjang < 100){
                hasilKondisiPersegiPanjang = "Hasil kurang dari 100";
            } else if (hasilPersegiPanjang > 100) {
                hasilKondisiPersegiPanjang = "Hasil lebih dari 100";
            } else if (hasilPersegiPanjang == 100) {
                hasilKondisiPersegiPanjang = "Hasil samadengan 100";
            }
            System.out.println("Hasil luas persegi Panjang adalah: " + hasilPersegiPanjang);
            System.out.println(hasilKondisiPersegiPanjang);
        } else {
            System.out.println("Maaf program yang anda pilih tidak tersedia");
        }
    }
}

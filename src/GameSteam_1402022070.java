import java.util.Scanner;
import java.util.Arrays;

public class GameSteam_1402022070 {
    public static void main(String[] args) {
        //////////RUFFINO AHMAD NOOR/1402022070//////////
        Scanner userInput = new Scanner(System.in);
        // ALASAN SAYA MENGGUNAKAN SCANNER UNTUK MEMINTA INPUT USER.
        String elemen1, elemen2, elemen3, elemen4, elemen5, elemen6, elemen7, elemen8;
        // ALASAN SAYA MENGGUNAKAN STRING UNTUK MEYIMPAN NILAI YANG BERUPA KALIMAT.
        String namaAkun, genreGame, namaGame, usia, saldoAkun, hargaGame;
        // ALASAN SAYA MENGGUNAKAN STRING UNTUK MEYIMPAN NILAI YANG BERUPA KALIMAT.

        ////////// UNTUK GAME //////////
        System.out.println("=================================================");
        System.out.println("---------------Program Store Steam---------------");
        System.out.println("---------Ruffino Ahmad Noor/1402022b070----------");
        System.out.println("=================================================");
        System.out.println("List game yang kamu punya:");
        System.out.print("1. ");
        elemen1 = userInput.nextLine(); // INPUT UNTUK STRING
        System.out.print("2. ");
        elemen2 = userInput.nextLine(); // INPUT UNTUK STRING
        System.out.print("3. ");
        elemen3 = userInput.nextLine(); // INPUT UNTUK STRING
        System.out.print("4. ");
        elemen4 = userInput.nextLine(); // INPUT UNTUK STRING
        System.out.print("5. ");
        elemen5 = userInput.nextLine(); // INPUT UNTUK STRING
        System.out.print("6. ");
        elemen6 = userInput.nextLine(); // INPUT UNTUK STRING
        System.out.print("7. ");
        elemen7 = userInput.nextLine(); // INPUT UNTUK STRING
        System.out.print("8. ");
        elemen8 = userInput.nextLine(); // INPUT UNTUK STRING

        ////////// UNTUK DATADIRI //////////
        System.out.println("=================================================");
        System.out.println("====================List Data====================");
        System.out.println("=================================================");
        System.out.print("Masukan Nama\t\t: ");
        namaAkun = userInput.nextLine(); // INPUT UNTUK STRING
        System.out.print("Usia\t\t\t\t: ");
        usia = userInput.nextLine(); // INPUT UNTUK STRING
        System.out.print("Genre Game\t\t\t: ");
        genreGame = userInput.nextLine(); // INPUT UNTUK STRING
        System.out.print("Nama Game\t\t\t: ");
        namaGame = userInput.nextLine(); // INPUT UNTUK STRING
        System.out.print("Saldo Steam\t\t\t: ");
        saldoAkun = userInput.nextLine(); // INPUT UNTUK STRING
        System.out.print("Harga Game\t\t\t: ");
        hargaGame = userInput.nextLine(); // INPUT UNTUK STRING

        String hurufPertama = String.valueOf(namaAkun.charAt(0));
        // ALASAN SAYA MENGGUNAKAN STRING UNTUK MEYIMPAN NILAI YANG BERUPA KALIMAT.
        String hurufKedua = String.valueOf(namaAkun.charAt(namaAkun.length() / 2));
        // ALASAN SAYA MENGGUNAKAN STRING UNTUK MEYIMPAN NILAI YANG BERUPA KALIMAT.
        String hurufKetiga = usia;
        // ALASAN SAYA MENGGUNAKAN STRING UNTUK MEYIMPAN NILAI YANG BERUPA KALIMAT.
        String hurufKeempat = String.valueOf(namaGame.charAt(0));
        // ALASAN SAYA MENGGUNAKAN STRING UNTUK MEYIMPAN NILAI YANG BERUPA KALIMAT.
        String hurufKelima = String.valueOf(namaGame.charAt(namaGame.length() - 1));
        // ALASAN SAYA MENGGUNAKAN STRING UNTUK MEYIMPAN NILAI YANG BERUPA KALIMAT.

        ////////// MENCETAK KODE PEMBAYARAN //////////
        System.out.println("===================================");
        System.out.println("Kode Pembayaran: " + hurufPertama.toUpperCase() + hurufKedua.toUpperCase() + hurufKetiga + hurufKeempat.toUpperCase() + hurufKelima.toUpperCase());
        System.out.println("===================================");
        System.out.println("Game yang dipilih\t: " + namaGame);
        System.out.println("Genre Game\t\t\t: " + genreGame);

        ////////// BUAT ARRAY KUMPULAN GAME //////////
        String[] kumpulanGame = new String[10];
        kumpulanGame[0] = elemen1;
        kumpulanGame[1] = elemen2;
        kumpulanGame[2] = elemen3;
        kumpulanGame[3] = elemen4;
        kumpulanGame[4] = elemen5;
        kumpulanGame[5] = elemen6;
        kumpulanGame[6] = elemen7;
        kumpulanGame[7] = elemen8;

        ////////////////// MENCETAK FOLDER GAME /////////////////
        System.out.println("===================================");
        System.out.println("Folder game saat ini:");
        System.out.println(Arrays.toString(kumpulanGame));
        System.out.println(" ");

        int pilihFolder;
        // ALASAN SAYA MENGGUNAKAN INT KARENA MASUKAN BERUPA BILANGAN.
        System.out.print("Pilih folder untuk game baru berupa angka: ");
        pilihFolder = userInput.nextInt();  // INPUT UNTUK INT
        kumpulanGame[pilihFolder - 1] = namaGame;
        System.out.println(" ");
        System.out.println("List game: ");
        System.out.println(Arrays.toString(kumpulanGame));

        boolean kebenaranFolder = pilihFolder >= 9;
        // ALASAN SAYA MENGGUNAKAN BOOLEAN KARENA DI PPT KELUARAN HARUS BERUPA TRUE/FALSE
        boolean saldoCukup = Integer.parseInt(saldoAkun) >= Integer.parseInt(hargaGame);
        // ALASAN SAYA MENGGUNAKAN BOOLEAN KARENA DI PPT KELUARAN HARUS BERUPA TRUE/FALSE
        boolean usiaCukup = Integer.parseInt(usia) > 18;
        // ALASAN SAYA MENGGUNAKAN BOOLEAN KARENA DI PPT KELUARAN HARUS BERUPA TRUE/FALSE

        ////////// MENCETAK KRITERIA SYARAT //////////
        System.out.println("Sudah memasukan game ke folder yang benar? " + kebenaranFolder);
        System.out.println("Saldo sudah mencukupi: " + saldoCukup);
        System.out.println("Usia sudah mencukupi: " + usiaCukup);
        System.out.println(" ");

        boolean[] hasilPengecekan = new boolean[3];
        hasilPengecekan[0] = kebenaranFolder;
        hasilPengecekan[1] = saldoCukup;
        hasilPengecekan[2] = usiaCukup;
        boolean syaratCukup = hasilPengecekan[0] && hasilPengecekan[1] && hasilPengecekan[2];

        ////////// MENCETAK SYARAT CUKUP //////////
        System.out.print("Berikut hasil pengecekan: ");
        System.out.println(Arrays.toString(hasilPengecekan));
        System.out.println("Sudah memenuhi syarat? " + syaratCukup);
    }
}

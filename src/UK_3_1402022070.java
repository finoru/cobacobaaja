import java.util.Scanner;

public class UK3_1402022070 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String pesan;
        String tempel = "";

        System.out.print("Masukkan pesan: ");
        pesan = userInput.nextLine();
        for (int i = 0;i < pesan.length();i++){
            char simpan = pesan.charAt(i);
            switch (simpan){
                case ' ':
                    tempel += simpan;
                    break;
                default:
                    int tambah = simpan + 3;
                    if (tambah > 122){
                        tambah = 96 + (tambah-122);
                    }
                    tempel += (char)tambah;
            }
        }
        System.out.println("=================================");
        System.out.println("Hasil Enkripsi:");
        System.out.println("-> " + tempel + " <-");
        System.out.println("=========END OF PROGRAM==========");
    }
}

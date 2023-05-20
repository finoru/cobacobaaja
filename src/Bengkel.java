
public class Bengkel {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Ruffino Ahmad Noor";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 3.9;
        mahasiswa1.umur = 23;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Ahmad Taka";
        mahasiswa2.jurusan = "Teknik Informatika";
        mahasiswa2.IPK = 3.7;
        mahasiswa2.umur = 23;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);

    }

}

class Mahasiswa{
    String nama;
    double IPK;
    String jurusan;
    int umur;
}

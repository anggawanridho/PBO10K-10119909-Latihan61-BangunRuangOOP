package bangun_ruang;

public class PBO10K10119909Latihan61 {

    public static void main(String[] args) {
        Bola bola = new Bola(7);
        System.out.printf("Volume bola\t\t= %.1f%n", bola.hitungVolume());

        Tabung tabung = new Tabung(10,21);
        System.out.printf("Volume tabung\t= %.1f%n", tabung.hitungVolume());

        Kerucut kerucut = new Kerucut(14,9);
        System.out.printf("Volume kerucut\t= %.0f%n", kerucut.hitungVolume());
    }
}

package bangun_ruang;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Bola extends BangunRuang {
    private final float r;

    public Bola(int r){
        this.r = r;
    }

    @Override
    public float hitungVolume() {
        double volume = (1.33333333333*Math.PI*Math.pow(r,3));
        return (float) volume;
    }
}

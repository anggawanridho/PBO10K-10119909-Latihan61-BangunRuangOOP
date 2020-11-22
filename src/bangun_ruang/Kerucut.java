package bangun_ruang;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Kerucut extends BangunRuang {
    private final float r;
    private final float t;

    public Kerucut(int r, int t){
        this.r = r;
        this.t = t;
    }

    @Override
    public float hitungVolume() {
        double volume = (0.33333333333*Math.PI*Math.pow(r,2)*t);
        return (float) volume;
    }
}

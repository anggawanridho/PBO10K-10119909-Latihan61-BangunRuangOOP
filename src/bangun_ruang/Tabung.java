package bangun_ruang;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Tabung extends BangunRuang {
    private final float r;
    private final float h;

    public Tabung(int r, int h){
        this.r = r;
        this.h = h;
    }

    @Override
    public float hitungVolume(){
        double volume = (Math.PI*Math.pow(r,2)*h);
        return (float) volume;
    }
}

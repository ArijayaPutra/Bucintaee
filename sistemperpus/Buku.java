package quiz;

public class Buku {

    private String judul;
    private String sinopsis;
    private Penulis[] penulis;
    private int stok;

    public Buku(String judul, String sinopsis, Penulis[] penulis, int stok) {
        this.judul = judul;
        this.sinopsis = sinopsis;
        this.penulis = penulis;
        this.stok = stok;
    }

    public String getJudul() {
        return judul;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public Penulis[] getPenulis() {
        return penulis;
    }

    public int getStok() {
        return stok;
    }

    public void tampilInfoPenulis() {
        System.out.println("Penulis Buku " + getJudul() + " :");
        for (Penulis pnls : getPenulis()) {
            System.out.println("Nama\t\t: " + pnls.getNama());
            System.out.println("Motivasi\t: " + pnls.getMotivasi());
            System.out.println("Umur\t\t: " + pnls.getUmur());
        }
        System.out.println("");
    }

    public boolean kurangiStok() {
        if (stok == 0) {
            return false;
        } else {
            stok--;
            return true;
        }
    }
}

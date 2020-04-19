package quiz;

public class Penulis {

    private String nama;
    private String motivasi;
    private String umur;

    public Penulis(String nama, String motivasi, String umur) {
        this.nama = nama;
        this.motivasi = motivasi;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getMotivasi() {
        return motivasi;
    }

    public String getUmur() {
        return umur;
    }

    public void tampilInfoBuku(Buku[] bukus) {
        System.out.println("Buku yang ditulis oleh penulis " + getNama() + ":");
        for (Buku bk : bukus) {
            Penulis[] penulis = bk.getPenulis();
            for (Penulis pnls : penulis) {
                if (pnls.equals(this)) {
                    System.out.println("Judul     : " + bk.getJudul());
                    System.out.println("Sinopsis  : " + bk.getSinopsis());
                    System.out.println("Jumlah\t  : " +bk.getStok());
                    System.out.print("Penulis   : ");
                    for (Penulis pnls2 : penulis) {
                        System.out.print(pnls2.getNama() + ", ");
                    }
                    System.out.println("\b\b\n");
                    break;
                }
            }
        }
        System.out.println("");
    }

}

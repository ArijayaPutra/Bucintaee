package quiz;

public class User {

    private String nama;
    private String nomor;
    private int jumlahPinjam;

    public User(String nama, String nomor) {
        this.nama = nama;
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    public void pinjamBuku(String[] mauPinjam, Buku[] dataBuku) {
        String error = "";
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Nomor Pelanggan\t: " + getNomor());
        System.out.print("List buku\t: ");
        int pernahKetemu = 0;
        for (String judulBook : mauPinjam) {
            int ketemu = 0;
            for (Buku dataBook : dataBuku) {
                if (judulBook.equals(dataBook.getJudul())) {
                    ketemu = 1;
                    if (dataBook.kurangiStok()) {
                        pernahKetemu = 1;
                        System.out.print(dataBook.getJudul() + ", ");
                        jumlahPinjam++;
                        break;
                    } else {
                        error += "Maaf, stok buku " + dataBook.getJudul() + " habis.\n";
                    }
                }
            }
            if (ketemu == 0) {
                error += "Maaf, buku (" + judulBook + ") tidak ditemukan.\n";
            }
        }
        if (pernahKetemu == 1) {
            System.out.print("\b\b\n");
        }
        System.out.println("Total bayar\t: Rp " + hargaPinjam() + ",-");
        if (!error.equals("")) {
            System.out.println();
            System.out.println("Note:");
            System.out.println(error);
        }
        System.out.println("");
    }

    public int hargaPinjam() {
        if (jumlahPinjam <= 3) {
            return 1000 * jumlahPinjam;
        } else {
            return 1000 * 3 + 1100 * (jumlahPinjam - 3);
        }
    }
}

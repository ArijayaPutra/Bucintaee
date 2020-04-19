package quiz;

public class Main {

    public static void main(String[] args) {
        Penulis pA = new Penulis("A", "Buatlah permasalahanmu menjadi kekuatanmu", "19");
        Penulis pB = new Penulis("B", "Kepercayaan, kesetiaan, dan kasih sayang", "9");
        Penulis pC = new Penulis("C", "Jangan main moba mulu", "80");
        Penulis pD = new Penulis("D", "Ingat tujuan hidup kita apa", "25");
        Penulis pE = new Penulis("E", "Andai bisa memilih, aku tidak ingin apa wess", "21");

        Buku bA = new Buku("A", "Bukunya Graita tentang Coding", new Penulis[]{pA, pB}, 3);
        Buku bD = new Buku("D", "Bukunya Sukma tentang Cinta", new Penulis[]{pC}, 3);
        Buku bE = new Buku("E", "Bukunya Febriansyah tentang Sekolah", new Penulis[]{pC}, 3);
        Buku bF = new Buku("F", "Bukunya Triwildan tentang Kuliah", new Penulis[]{pC}, 3);
        Buku bI = new Buku("I", "Bukunya Azmi tentang Masalah", new Penulis[]{pD}, 2);
        Buku bJ = new Buku("J", "Bukunya Graita tentang Filkom", new Penulis[]{pE}, 2);
        Buku bK = new Buku("K", "Bukunya Sukma tentang Brawijaya", new Penulis[]{pA}, 2);
        Buku bL = new Buku("L", "Bukunya Febriansyah tentang BCC", new Penulis[]{pB}, 2);
        Buku bM = new Buku("M", "Bukunya Triwildan tentang Gatau Ah", new Penulis[]{pB}, 2);
        Buku bO = new Buku("O", "Bukunya Azmi tentang Pusing Kuisnya", new Penulis[]{pC, pD}, 1);
        Buku[] buku = new Buku[]{bA, bD, bE, bF, bI, bJ, bK, bL, bM, bO};
        
        User u1 = new User("Graita", "0000001");
        User u2 = new User("Sukmaa", "0000002");
        User u3 = new User("Wildan", "0000003");
        
        System.out.println("Menampilkan informasi buku yang ditulis oleh penulis A, B, dan D. ");
        pA.tampilInfoBuku(buku);
        pB.tampilInfoBuku(buku);
        pD.tampilInfoBuku(buku);
        
        System.out.println("Menampilkan informasi penulis yang menulis buku A, D, dan K.");
        bA.tampilInfoPenulis();
        bD.tampilInfoPenulis();
        bK.tampilInfoPenulis();
        
        System.out.println("Menampilkan informasi list buku yang dipinjam oleh masing masing user.");
        u1.pinjamBuku(new String[] {"A", "F", "K"}, buku);
        u2.pinjamBuku(new String[] {"D", "I", "K", "L", "O", "M"}, buku);
        u3.pinjamBuku(new String[] {"E", "D", "F", "K"}, buku);
    }

}

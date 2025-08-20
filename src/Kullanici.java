abstract class Kullanici {


    protected String isim;
    protected String kullaniciAdi;
    protected String sifre;



    public Kullanici( String isim, String kullaniciAdi, String sifre) {

        this.isim = isim;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public abstract void menu();


}

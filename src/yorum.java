public class yorum {

    private String kullaniciAdi;
    private String text;

    public yorum(String kullaniciAdi, String text) {
        this.kullaniciAdi = kullaniciAdi;
        this.text = text;
    }

    public void show() {
        System.out.println(kullaniciAdi + ": " + text);
    }
}

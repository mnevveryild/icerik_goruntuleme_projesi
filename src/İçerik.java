public class İçerik {

    protected String içerik;
    protected String tür;
    protected String isim;
    protected String yazar;
    protected double ratingSum = 0;
    protected int ratingCount = 0;

    public İçerik(String içerik, String tür, String isim, String yazar) {
        this.içerik = içerik;
        this.tür = tür;
        this.isim = isim;
        this.yazar = yazar;
    }

    public void oyEkle(int oy){

        ratingSum += oy;
        ratingCount++;

    }


    public double getAverageRating() {
        return ratingCount == 0 ? 0 : ratingSum / ratingCount;
    } //count sıfırsa 0 olarak devam eğer değilse ortalama hesaplar


    public String getTitle() { return isim; }

    public void display() {}


}

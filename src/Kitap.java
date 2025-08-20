public class Kitap extends  İçerik{


    public Kitap(String isim, String yazar, String tür, String içerik) {
        super(içerik, tür, isim, yazar);
    }

    @Override
    public void display() {
        System.out.println("Kitap: " + isim + " - " + yazar +"Tür: " +tür+ " - "+
                "|Puan: " + getAverageRating());
        System.out.println("                                                                                ");

        System.out.println(içerik);
        System.out.println("-----------------------------------------------------------------");
    }
}

public class siir extends İçerik{

    public siir(String isim, String yazar, String tür, String içerik) {
        super(içerik, tür, isim, yazar);
    }

    public void display() {
        System.out.println("Şiir: " + isim + " - " + yazar +"Tür: "+ tür + " - "+
                "|Puan: " + getAverageRating());

        System.out.println("                                                                     ");

        System.out.println(içerik);
        System.out.println("-----------------------------------------------------------------");
    }

}

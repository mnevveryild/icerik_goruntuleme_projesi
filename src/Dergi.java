public class Dergi extends İçerik{

    public Dergi(String isim, String yazar, String tür, String içerik) {
        super(içerik, tür, isim, yazar);
    }


    public void display() {
        System.out.println("Dergi: " + isim + " - " + yazar + "Tür: "+ tür +" - "+
                "|Puan: " + getAverageRating());
        System.out.println("                                                                    ");

        System.out.println(içerik);
        System.out.println("-----------------------------------------------------------------");
    }
}

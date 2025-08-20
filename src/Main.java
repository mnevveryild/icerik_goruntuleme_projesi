import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Admin admin = new Admin("Münevver Yıldırım", "muni", "1234");    // database olmadığı için sabit bir admin kullanıcısı ekledim
        KütüphaneSistemi.addUser(admin);

        while (true) {
            Kullanici user = null;

            // giriş
            while (user == null) {
                System.out.println("\nKÜTÜPHANE SİSTEMİNE HOŞGELDİNİZ");
                System.out.print("Kullanıcı Adı: ");
                String kullaniciAdi = sc.nextLine();
                System.out.print("Şifre: ");
                String sifre = sc.nextLine();

                user = login(kullaniciAdi, sifre);
                if (user == null) {
                    System.out.println("Kullanıcı adı veya şifre hatalı!");
                }
            }

            System.out.println("\n Giriş başarılı.Hoşgeldin" + user.getKullaniciAdi());


            if (user instanceof Admin) {
                adminMenu((Admin) user);
            } else if (user instanceof Normal) {
                userMenu((Normal) user);
            }

        }
    }



    private static Kullanici login(String kullaniciAdi, String sifre) {
        for (Kullanici u : KütüphaneSistemi.getUsers()) {
            if (u.getKullaniciAdi().equals(kullaniciAdi) && u.getSifre().equals(sifre)) {
                return u;
            }
        }
        return null;
    }

    // admin menüsü açılır
    private static void adminMenu(Admin admin) {
        while (true) {
            System.out.println("\n------------ ADMIN MENÜ ------------");
            System.out.println("1- Kitap Ekle");
            System.out.println("2- Dergi Ekle");
            System.out.println("3- Şiir Ekle");
            System.out.println("4- Yeni Kullanıcı Oluştur");
            System.out.println("0- Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = Integer.parseInt(sc.nextLine());

            if (secim == 0) break;

            switch (secim) {
                case 1 -> {

                    System.out.print("Kitap adı: ");
                    String kitap = sc.nextLine();


                    System.out.print("Yazar: ");
                    String yazar = sc.nextLine();

                    System.out.print("Kitap türü: ");
                    String tur = sc.nextLine();

                    System.out.print("İçerik: ");
                    String içerik = sc.nextLine();

                    KütüphaneSistemi.addContent(new Kitap(kitap,yazar, tur, içerik));
                    System.out.println("Kitap eklendi");
                }
                case 2 -> {
                    System.out.print("Dergi adı: ");
                    String dergi = sc.nextLine();

                    System.out.print("Yazar: ");
                    String yazar = sc.nextLine();

                    System.out.print("Dergi türü: ");
                    String tur = sc.nextLine();

                    System.out.print("İçerik: ");
                    String içerik = sc.nextLine();

                    KütüphaneSistemi.addContent(new Dergi(dergi, yazar, tur,içerik));
                    System.out.println("Dergi eklendi");
                }
                case 3 -> {
                    System.out.print("Şiir adı: ");
                    String siir = sc.nextLine();

                    System.out.print("Yazar: ");
                    String yazar = sc.nextLine();

                    System.out.print("Şiir türü: ");
                    String tur = sc.nextLine();


                    System.out.print("İçerik: ");
                    String içerik = sc.nextLine();


                    KütüphaneSistemi.addContent(new siir(siir,yazar, tur, içerik));
                    System.out.println("Şiir eklendi");
                }
                case 4 -> {
                    System.out.print("Kullanıcı İsmi: ");
                    String isim = sc.nextLine();

                    System.out.print("Kullanıcı adı: ");
                    String uname = sc.nextLine();

                    System.out.print("Şifre: ");
                    String pass = sc.nextLine();

                    KütüphaneSistemi.addUser(new Normal(isim,uname, pass));
                    System.out.println("Yeni kullanıcı oluşturuldu");
                }
                default -> System.out.println("Geçersiz seçim!");
            }
        }
    }


    //normal kullanıcı menüsü

    private static void userMenu(Normal user) {
        while (true) {
            System.out.println("\n------------ KULLANICI MENÜ ------------");
            System.out.println("1- İçerikleri Listele");
            System.out.println("2- İçeriğe Puan Ver");
            System.out.println("3- Yorum Yap");
            System.out.println("0- Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = Integer.parseInt(sc.nextLine());

            if (secim == 0) break;

            switch (secim) {
                case 1 -> {
                    for (İçerik c : KütüphaneSistemi.getContents()) {
                        c.display();
                    }
                }
                case 2 -> {
                    System.out.print("Puan vermek istediğiniz içerik adı: ");
                    String name = sc.nextLine();
                    for (İçerik c : KütüphaneSistemi.getContents()) {
                        if (c.getTitle().equalsIgnoreCase(name)) {
                            System.out.print("Puan (1-5 arasında değer giriniz) : ");
                            int puan = Integer.parseInt(sc.nextLine());
                            c.oyEkle(puan);
                            System.out.println("Puan eklendi");
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Yorum yapmak istediğiniz içerik adı: ");
                    String name = sc.nextLine();
                    for (İçerik c : KütüphaneSistemi.getContents()) {
                        if (c.getTitle().equalsIgnoreCase(name)) {
                            System.out.print("Yorumunuz: ");
                            String yorum = sc.nextLine();
                            System.out.println("Yorum kaydedildi");
                        }
                    }
                }
                default -> System.out.println("Geçersiz seçim!");
            }
        }
    }
}


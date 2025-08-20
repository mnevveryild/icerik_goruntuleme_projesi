import java.util.ArrayList;
import java.util.List;

public class KütüphaneSistemi {

    private static List<Kullanici> users = new ArrayList<>();
    private static List<İçerik> contents = new ArrayList<>();

    public static void addUser(Kullanici u) { users.add(u); }
    public static void addContent(İçerik c) { contents.add(c); }

    public static List<İçerik> getContents() { return contents; }
    public static List<Kullanici> getUsers() { return users; }







}

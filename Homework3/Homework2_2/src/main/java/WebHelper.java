import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebHelper {
    private static WebHelper instance;

    private Document document;
    private WebHelper() {
        System.out.println("Loading WebPage");
        try {
            document = Jsoup.connect("https://www.digisport.ro").get();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static WebHelper getInstance() {
        if (instance == null) {
            instance = new WebHelper();
        }
        return instance;
    }

    public Document getDocument() {
        return document;
    }
}

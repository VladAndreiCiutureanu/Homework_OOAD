import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Application {
    public static void main(String[] args) {
        WebHelper webHelper1 = WebHelper.getInstance();
        getFirstTitle(webHelper1.getDocument());

        WebHelper webHelper2 = WebHelper.getInstance();
        getFirstTitle(webHelper2.getDocument());
    }
    public static void getFirstTitle(Document document) {
        Element title = document.getElementsByClass("article-title").first();
        System.out.println(title.text());
    }
}

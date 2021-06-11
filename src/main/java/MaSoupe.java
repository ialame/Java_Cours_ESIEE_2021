import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MaSoupe {
    public static void main(String[] str) throws IOException {
        String url = "http://www.changemagenta.fr";
        Document doc = Jsoup.connect(url).get();
        Elements links = doc.select(".tableauItem em.hidden-xs");
        for(Element e : links) {
            String[] T = e.text().split(" ");
            String s = T[3].replace(",",".");
            double x = Double.parseDouble(s);
            System.out.println(T[1]+": "+x);
        }
    }
}
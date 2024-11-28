import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Article> articles = new ArrayList<Article>();
        articles.add(new Article("Wood", "Wood1 Inc.", 1000, 100, 120, 10.2));
        articles.add(new Article("Metal", "Metal1 Inc.", 1000, 100, 120, 1.4));
        articles.add(new Article("Wood", "Wood2 Inc.", 1000, 100, 120, 1.0));
        articles.add(new Article("Metal", "Metal2 Inc.", 1000, 100, 120, 1.5));
        articles.add(new Article("Wood", "Wood Inc.", 1000, 100, -120, 1.2));
        articles.add(new Article("Wood", "Wood Inc.", -1000, 100, 120, 1.2));
        articles.add(new Article("Wood", "Wood Inc.", 1000, -100, 120, 1.2));

        ArticleCollection articleCollection = new ArticleCollection();

        for(Article article : articles) {
            try {
                articleCollection.add(article);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        articleCollection.show();

        System.out.println(articleCollection.getLowestWarrantyTerm());

        System.out.println(articleCollection.getLowestAverageWarrantyTerm());
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArticleCollection {

    private List<Article> articles = new ArrayList<>();

    public ArticleCollection() {}

    public ArticleCollection(List<Article> articles) {
        this.articles = articles;
    }

    public void add(Article article) {
        if(article.getQuantity() < 1) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
        if(article.getRetailPrice() <= 0 || article.getWholesalePrice() <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
        articles.add(article);
        System.out.println("Added article: " + article);
    }

    public void show() {
        for (Article article : articles) {
            System.out.println(article);
        }
    }

    public String getLowestWarrantyTerm() {
        Article result = articles.getFirst();
        double lowestWarrantyTerm = articles.getFirst().getWarrantyTerm();
        for (Article article : articles) {
            if (article.getWarrantyTerm() < lowestWarrantyTerm) {
                result = article;
                lowestWarrantyTerm = article.getWarrantyTerm();
            }
        }
        return result.getName() + " " + result.getManufacturer();
    }

    public String getLowestAverageWarrantyTerm() {
        Article result = articles.getFirst();
        double lowestAverageWarrantyTerm = result.getWarrantyTerm();
        for (Article article : articles) {
            double lowestAverageWarrantyTerm1 = result.getWarrantyTerm();
            int quantity = 0;
            for (Article article1 : articles) {
                if (article.getWarrantyTerm() < lowestAverageWarrantyTerm && Objects.equals(article.getName(), article1.getName())) {
                    quantity++;
                    lowestAverageWarrantyTerm1 += article1.getWarrantyTerm();
                }
            }
            lowestAverageWarrantyTerm1 = lowestAverageWarrantyTerm1 / quantity;
            if (lowestAverageWarrantyTerm > lowestAverageWarrantyTerm1) {
                result = article;
                lowestAverageWarrantyTerm = lowestAverageWarrantyTerm1;
            }
        }
        return result.getName();
    }

    @Override
    public String toString() {
        return "ArticleCollection{" +
                "articles=" + articles +
                '}';
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}

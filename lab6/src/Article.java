
public class Article {

    private String name;
    private String manufacturer;
    private int quantity;
    private int wholesalePrice;
    private int retailPrice;
    private double warrantyTerm;

    public Article(String name, String manufacturer, int quantity, int wholesalePrice, int retailPrice, double warrantyTerm) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.warrantyTerm = warrantyTerm;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", quantity=" + quantity +
                ", wholesalePrice=" + wholesalePrice +
                ", retailPrice=" + retailPrice +
                ", warrantyTerm=" + warrantyTerm +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(int wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public double getWarrantyTerm() {
        return warrantyTerm;
    }

    public void setWarrantyTerm(double warrantyTerm) {
        this.warrantyTerm = warrantyTerm;
    }
}

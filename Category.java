import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<String> products;


    public Category() {
        this.name = "Główna kategoria";
        this.products = new ArrayList<>();
    }

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public Category(String name, List<String> products) {
        this.name = name;
        this.products = new ArrayList<>(products);
    }

    public void addProduct(String product) {
        products.add(product);
    }

    public void removeProduct(String product) {
        products.remove(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public static void main(String[] args) {

        Category category1 = new Category();
        category1.addProduct("Produkt1");

        Category category2 = new Category("Kategoria2");
        category2.addProduct("Produkt2");

        List<String> products = new ArrayList<>();
        products.add("Produkt3");
        Category category3 = new Category("Kategoria3", products);

        System.out.println("Kategoria 1: " + category1.getName() + ", Produkty: " + category1.getProducts());
        System.out.println("Kategoria 2: " + category2.getName() + ", Produkty: " + category2.getProducts());
        System.out.println("Kategoria 3: " + category3.getName() + ", Produkty: " + category3.getProducts());
    }
}

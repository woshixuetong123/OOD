public class Catalog implements Search {
    HashMap<String, List<Product>> productName;
    HashMap<String, List<Product>> productCategories;

    public List<Product> searchProductsByName(String name) {
        return productNames.get(name);
    }
    public List<Product> searchProductByCategory(String category) {
        return productCategories.get(category);
    }
}
public interface Search {
    public List<Product> searchProductsByName(String name);
    public List<Product> searchProductByCategory(String category);
}
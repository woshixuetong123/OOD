public class ShoppingCart {
    private List<Items> items;

    public boolean addItem(Item item);
    public boolean removeItem(Item item);
    public boolean updateItemQuantity(Item item, int quantity);
    public List<Item> getItems();
    public boolean checkout();
}
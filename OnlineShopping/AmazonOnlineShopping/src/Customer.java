public abstract class Customer {
    private ShoppingCart cart;
    private Order order;

    public ShoppingCart getShoppingCard();
    public boolean addItemToCart(Item item);
    public boolean removeItemfromCart(Item item);
}
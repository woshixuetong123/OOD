class Meal {
	private float price;

	public void setPrice(float price) {
		this price = price;
	}

	public float getPrice() {
		return this.price;
	}
}

class Order {

	private List<Meal> meals;

	public Order() {
		meals = new ArrayList<Mean>();
	}

	public List<Meal> getMeals() {
		return this.meals;
	}

	public void mergeOrder(Order o) {
		if (meals == null) {
			meals = o.getMeals();
		}
		else {
			if (o.getMeals() != null) {
				for (Meal m : o.getMeals()) {
					this.meals.add(m);
				}
			}
		}
	}

	public float getBill() {
		float bill = 0;
		for (Meal m : this.meals) {
			bill += m.getPrice();
		}
		return bill;
	}


}

class Party {
	private int size;

	public int getSize() {
		return this.size;
	}
}

class Table {

	private int capacity;
	private Order order;
	private boolean available;

	public int getCapacity() {
		return this.capacity;
	}

	public boolean isAvailable() {
		return this.available;
	}

	public Order getCurrentOrder() {
		return this.order;
	}

	public void setOrder(Order o) {

		if (order == null) {
			order = o;
		}
		else {
			if (o != null) {
				order.mergeOrder(o);
			}
			else {
				this.order = o;
			}
		}

	}

	public void markAvailable() {
		this.available = true;
	}

	public void markUnavailable() {
		this.available = false;
	}


}

public class Restaurant {

	private List<Table> tables;
	private List<Meal> menu;

	public Restaurant() {
		tables = new ArrayList<Table>();
		menu = new ArrayList<Meal>();
	}

	public List<tables> getTable() {
		return this.tables;
	}

	public List<meal> getMenu() {
		return this.menu;
	}

	public void serve(Party p, Order o) throw NoTableException{
		for (Table table : tables) {
			if (table.getCapacity() >= p.getSize() && table.isAvailable()) {
				table.setOrder(o);
				t.markUnavailable();
				return;
			}
		}
		throw new NoTableException();
	}

	public float checkOut(Table t) {

		float bill = 0;
		Order o = t.getCurrentOrder();
		if (o != null) {
			bill = o.getBill();
		}
		t.markAvailable();
		return bill;
		

	}



}

class NoTableException extends Exception {
	public NoTableException(Party p) {
		super("No table for this party size as" + p.size());
	}
}


























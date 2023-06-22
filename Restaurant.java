package orderingsystem;
public class Restaurant {
	 private int id;
	 private String name;
	 private String address;
	 
	 int stock;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getStock() {
		return stock;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Restaurant(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Menu[] getMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMenu(Menu[] tempMenu) {
		// TODO Auto-generated method stub
		
	}
}

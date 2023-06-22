package orderingsystem;
import java.time.LocalDate;
import java.time.LocalTime;
public class OrderDetails {
	private int orderId;
	private String customerName;
	private String custAddress;
	private double totalAmount;
	private String menuName;
	private double menuPrice;
	private int quantity;
	private LocalTime orderTime;
	private LocalDate orderDate;
	private boolean deliveryStatus=false;
	private LocalTime approxDeliveryTime;
	private int restaurantId;
	
	public OrderDetails(int orderId,String customername,String custAddress,double totalAmount,String menuName,double menuPrice,int quantity,LocalTime orderTime,LocalDate orderDate,LocalTime approxDeliveryTime,int restaurantId) {
		super();
		this.orderId=orderId;
		this.customerName=customername;
		this.custAddress=custAddress;
		this.totalAmount=totalAmount;
		this.menuName=menuName;
		this.menuPrice=menuPrice;
		this.quantity=quantity;
		this.orderTime=orderTime;
		this.orderDate=orderDate;
		this.approxDeliveryTime=approxDeliveryTime;
		this.restaurantId=restaurantId;
		
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public double getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(double menuPrice) {
		this.menuPrice = menuPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalTime orderTime) {
		this.orderTime = orderTime;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public boolean isDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(boolean deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public LocalTime getApproxDeliveryTime() {
		return approxDeliveryTime;
	}

	public void setApproxDeliveryTime(LocalTime approxDeliveryTime) {
		this.approxDeliveryTime = approxDeliveryTime;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	
}

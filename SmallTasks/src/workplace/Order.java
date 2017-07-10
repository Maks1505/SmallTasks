package workplace;

public class Order {
	private static int orderIdCounter = 9999;
	private int orderId;
	private int workplaceCount = 1;
	private Workplace workplace;
	private int clientId;
	private String client;
	private boolean shippingIncluded = false;
	private final int SHIPPINGPRICE = 10;
	private final static int CLIENT_NAME_MIN_LENGTH = 5;
	private final static int CLIENT_NAME_MAX_LENGTH = 20;
	
	public Order(int clientId, String client, int workplaceCount, boolean shippingIncluded) {
		if (orderIdCounter++ > 100000) {
			orderIdCounter = 9999;
		};
		this.orderId = orderIdCounter;
		this.clientId = clientId;
		this.client = (client.length() >= CLIENT_NAME_MIN_LENGTH && client.length() <= CLIENT_NAME_MAX_LENGTH) ? client : "Клиент №" + orderId;
		this.workplaceCount = workplaceCount;
		this.shippingIncluded = shippingIncluded;
	}
	
	public int getOrderTotalAmount(){
		return workplace.getWorkplaceCost() * workplaceCount + ((shippingIncluded) ? SHIPPINGPRICE : 0); 
	}

	@Override
	public String toString() {
		return String.format("[%d : %d : %s : %d]", orderId, clientId, client, workplaceCount);
	}

	public int getWorkplaceCount() {
		return workplaceCount;
	}

	public void setWorkplaceCount(int workplaceCount) {
		this.workplaceCount = (workplaceCount < 1) ? 1 : workplaceCount;
	}

	public Workplace getWorkplace() {
		return workplace;
	}

	public void setWorkplace(Workplace workplace) {
		this.workplace = workplace;
	}

	public int getOrderId() {
		return orderId;
	}

	public String getClient() {
		return client;
	}

	public boolean isShippingIncluded() {
		return shippingIncluded;
	}

	public void setShippingIncluded(boolean shippingIncluded) {
		this.shippingIncluded = shippingIncluded;
	}

	public int getSHIPPINGPRICE() {
		return SHIPPINGPRICE;
	}

	public int getClientId() {
		return clientId;
	}

	public static int getOrderIdCounter() {
		return orderIdCounter;
	}

	

}

package workplace;

public class Printer {

	public static void printOrder(Order order){
		System.out.println("Заказ " + order.toString());
	}
	

	public static void printCheck(Order... orders) {
		int len;
		for (Order o : orders){
			System.out.println("**********************************");
			System.out.println("Заказ: "+o.getOrderId());
			System.out.println("Клиент: "+o.getClientId());
			System.out.println("Название: "+o.getClient());
			System.out.println("----------------------------------");
			Workplace wp = o.getWorkplace();
			for (EnumWorkplaceComponent item : wp.getComponents()){
				len = 20 - item.name().length();
				System.out.printf(item.name()+"%"+len+"s %10d \u20ac \n","",item.getPrice());
			}
			System.out.println("----------------------------------");
			String text = "Всего:";
			len = 20 - text.length();
			System.out.printf(text+"%"+len+"s %10d \u20ac \n","",o.getWorkplace().getWorkplaceCost());
			text = "Кол-во:";
			len = 20 - text.length();
			System.out.printf(text+"%"+len+"s %10d \n","",o.getWorkplaceCount());
			System.out.println("----------------------------------");
			text = "Общая сумма:";
			len = 20 - text.length();
			System.out.printf(text+"%"+len+"s %10d \u20ac \n","",o.getOrderTotalAmount());
			System.out.println("**********************************\n\n");
		}
	}

}

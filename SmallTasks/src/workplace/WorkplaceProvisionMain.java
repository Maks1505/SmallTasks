package workplace;

public class WorkplaceProvisionMain {
	public static void main (String[] args){
		//Задание 3
		Order or1 = new Order(5438, "Tester 2", 2, false);
		Printer.printOrder(or1);
		System.out.printf("Отдел с номером %d хочет заказать %d комплектации рабочего места с названием '%s'.\n", or1.getClientId(), or1.getWorkplaceCount(), or1.getClient());

		
		Order or2 = new Order(1275, "Assistant", 4, true);
		Printer.printOrder(or2);
		System.out.printf("Другой отдел (Номер %d) хочет доставки %d комплектов сотрудника с наименованием '%s'.\n", or2.getClientId(), or2.getWorkplaceCount(), or2.getClient());
		
		//Задание 4
		System.out.println();
		Workplace wp1 = new Workplace();
		wp1.newComponent(EnumWorkplaceComponent.CHAIR);
		wp1.newComponent(EnumWorkplaceComponent.COMPUTER);
		wp1.newComponent(EnumWorkplaceComponent.SCREEN);
		wp1.newComponent(EnumWorkplaceComponent.MOUSE);
		wp1.newComponent(EnumWorkplaceComponent.CHANCELLERY);
		or1.setWorkplace(wp1);
		
		Workplace wp2 = new Workplace();
		wp2.newComponent(EnumWorkplaceComponent.CHAIR);
		wp2.newComponent(EnumWorkplaceComponent.CHANCELLERY);
		or2.setWorkplace(wp2);
		
		//Задание 5
		System.out.println();
		Printer.printCheck(or1, or2);
		
	}
	
}

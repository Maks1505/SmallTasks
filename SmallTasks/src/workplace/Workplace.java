package workplace;

import java.util.ArrayList;

public class Workplace {
	private ArrayList<EnumWorkplaceComponent> components = new ArrayList<>();
	
	public Workplace() {
		components.add(EnumWorkplaceComponent.TABLE);
		components.add(EnumWorkplaceComponent.CHAIR);
	}

	public void newComponent(EnumWorkplaceComponent cmp){
		if (!components.contains(cmp)) {
			components.add(cmp);
		}
		else {
			System.out.printf("Компонент %s уже был добавлен в рабочее место ранее. \n", cmp);
		}
	}
	
	public int getWorkplaceCost(){
		int cost = 0;
		for (EnumWorkplaceComponent item : components){
			cost += item.getPrice();
		};
		return cost;
	}

	public ArrayList<EnumWorkplaceComponent> getComponents() {
		return components;
	}
	
	
}

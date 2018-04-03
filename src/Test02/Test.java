package Test02;

public class Test {

	public static void main(String[] args) {
		Water water = new Water();
		WaterPool waterpool = new WaterPool();
		waterpool.water = water;
		
		WaterOut wo = new WaterOut(waterpool);
		WaterIn wi = new WaterIn(waterpool);
		
		wo.start();
		wi.start();
	}

}

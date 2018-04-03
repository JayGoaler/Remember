package Test02;

public class Water {
	private int water = 50;

	public int getWater() {
		return water;
	}

	public void setWater(int a) {
		this.water = a + this.water;
	}

	@Override
	public String toString() {
		return "现有水量"+water;
	}
	
	
}

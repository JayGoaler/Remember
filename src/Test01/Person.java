package Test01;

public class Person {
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "第"+count+"号";
	}
	
	
}

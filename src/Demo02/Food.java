package Demo02;
/**
 * 食物
 * @author hly
 *
 */
public class Food {
	
	private  int  i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "这是第"+i+"份";
	}
	

}

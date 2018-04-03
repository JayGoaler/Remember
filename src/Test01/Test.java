package Test01;

public class Test {

	public static void main(String[] args) {
		Room room = new Room();
		
		Vip vip = new Vip(room);
		
		Common common = new Common(room);
		common.t = vip;
		
		common.start();
		vip.start();

	}

}

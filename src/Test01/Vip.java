package Test01;

public class Vip extends Thread{
	private Room room;

	public Vip(Room room) {
		this.room = room;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			Person person = new Person();
			person.setCount(i);
			
			room.vipIn(person);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

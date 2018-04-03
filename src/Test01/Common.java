package Test01;

public class Common extends Thread{
	private Room room;
	public Thread t;
	
	public Common(Room room) {
		this.room = room;
	}


	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			if(i == 11){
				try {
					t.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			yield();
			Person person = new Person();
			person.setCount(i);
			room.commonIn(person);
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

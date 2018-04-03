package Test02;

public class WaterIn extends Thread{
	private WaterPool waterpool;

	public WaterIn(WaterPool waterpool) {
		this.waterpool = waterpool;
	}
	
	@Override
	public void run() {
		while(true){
			waterpool.waterIn();
//			try {
//				sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
}

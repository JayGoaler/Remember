package Test02;

public class WaterOut extends Thread{
	private WaterPool waterpool;
	
	public WaterOut(WaterPool waterpool) {
		this.waterpool = waterpool;
	}
	
	@Override
	public void run() {
		while(true){
			waterpool.waterOut();
//			try {
//				sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}

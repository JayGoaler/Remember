package Test02;

public class WaterPool {
	public Water water;
	public int i = 0;
	
	synchronized public void waterIn(){
		if(water.getWater() == 50){
			this.notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		water.setWater(1);
		i++;
		System.out.println("第"+i+"次,注水1L,"+water+"L.");
		try {
			Thread.currentThread().sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized public void waterOut(){
		if(water.getWater() == 0){
			this.notify();
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		water.setWater(-1);
		i++;
		System.out.println("第"+i+"次,放水1L,"+water+"L.");
		try {
			Thread.currentThread().sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

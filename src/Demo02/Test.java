package Demo02;

public class Test {

	public static void main(String[] args) {
		// 容器
		Box  box=new  Box();
		//消费者
		Eater   eater=new  Eater(box);
		//生产者
		Waiter   waiter=new  Waiter(box);
		
		eater.start();
		waiter.start();
		
				
	}

}

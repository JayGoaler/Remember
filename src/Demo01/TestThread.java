package Demo01;

public class TestThread {

	public static void main(String[] args) {
		Bank bank =new  Bank();
		Card  card=new  Card();
		card.setMoney(400);
		//存钱线程
		 SaveThread   save=new  SaveThread(bank, card);
		//取钱的线程
		 DriwThread   driw=new  DriwThread(bank, card);
		 
		 //启动线程
		 save.start();
		 driw.start();
		 
		
	}

}

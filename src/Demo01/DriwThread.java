package Demo01;

public class DriwThread  extends  Thread{
	private   Bank  bank;
	private  Card  card;
	public  DriwThread(Bank bank,Card  card){
		this.bank=bank;
		this.card=card;
	}
	@Override
	public void run() {
		int  i=1;
		while(i<10){
			  try {
				  //
				bank.draw(card, i*200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}

}

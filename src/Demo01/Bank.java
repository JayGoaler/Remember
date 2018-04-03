package Demo01;

public class Bank {
	/**
	 * 存钱
	 * @param card
	 * @param moeny
	 * 2017年12月13日 上午10:11:37  hly
	 * @throws InterruptedException 
	 */
synchronized	public  void save(Card card,double moeny) throws InterruptedException{//this
		if(moeny>0){
			//mysql  查询  余额  ..  操作步骤   休眠模拟
			Thread.currentThread().sleep(1000);
			//真的存入
			card.setMoney(card.getMoney()+moeny);
			System.out.println("当前用户存入"+moeny+"元,余额为:"+card.getMoney());
			
		}else{
			System.out.println("数据不正确.............");
		}
	}
	/**
	 * 取钱
	 * @param card
	 * @param moeny
	 * 2017年12月13日 上午10:13:30  hly
	 * @throws InterruptedException 
	 */
synchronized	public  void draw(Card card,double moeny) throws InterruptedException{

		if(moeny<=card.getMoney() ){//-100
			//mysql  查询  余额  ..  操作步骤   休眠模拟
			Thread.currentThread().sleep(1000);
			//真的存入
			card.setMoney(card.getMoney()-moeny);
			System.out.println("当前用户取出"+moeny+"元,余额为:"+card.getMoney());
			
		}else{
			System.out.println("余额不足.............");
		}
	}
	
}

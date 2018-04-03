package Demo02;
/**
 * 小贩
 * @author hly
 *
 */
public class Waiter  extends  Thread{
	
private  Box  box;
	
public   Waiter(Box  box){
	this.box=box;
}
	@Override
	public void run() {
	  for(int i=1;i<=5;i++){
		  //不停的制作 食物
		  Food  food=new  Food();
		   food.setI(i);
		   
		   //把食物放入容器
		   box.setFood(food);
		   
		   
	  }
	}

}

package Demo02;
/**
 * 容器
 * @author hly
 *
 */
public class Box {
	
 private  Food  food;
 
 //装入食物
 
synchronized  public  void setFood(Food  food){
	  //判断  袋子里面没有食物  说明  炒栗子  有食物不炒
	  if(this.food != null){
		  //有食物
		  try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  //放入食物  
	  this.food=food;
	  //叫醒 顾客
	  System.out.println("请享用您的苹果:"+food+".");
	  this.notify();
	  
  }
 
  
synchronized  public  void eatFood(){
	  if(food==null){
		  try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  //唤醒小贩
	  System.out.print("我吃完了"+food+"");
	  //把食物赋null 值
	  this.food=null;
	  System.out.println(",再放一个.");
	  this.notify();
  }
 //取食物
 
}

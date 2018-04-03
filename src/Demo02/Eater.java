package Demo02;
/**
 *   食客
 * @author hly
 *
 */
public class Eater  extends  Thread{
	private  Box  box;
	
	public   Eater(Box  box){
		this.box=box;
	}
		@Override
		public void run() {
		  for(int i=1;i<=5;i++){
			
			   //食客  消耗 食物
			   box.eatFood();
			   
			   
		  }
		}
}

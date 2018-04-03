package Test01;

public class Room {
	private Person p;

	synchronized public void commonIn(Person per) {
		// 判断person是否为空
		if (this.p != null) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.p = per;
		System.out.println("普通号：当前" + per + ".");
		this.p = null;
		System.out.println("下一位！");
		this.notify();
	}

	synchronized public void vipIn(Person per) {
		if (this.p != null) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.p = per;
		System.out.println("特需号：当前" + per + ".");
		this.p = null;
		System.out.println("下一位！");
		this.notify();
	}
}

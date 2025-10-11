package observer2;

public class Test {

	public static void main(String[] args){

		System.out.println("**********************************************");		
		System.out.println("《大话设计模式》代码样例");
		System.out.println();		

        //前台小姐童子喆
        Secretary secretary1 = new Secretary("童子喆");

        //看股票的同事
        Observer employee1 = new StockObserver("魏关姹",secretary1);
        Observer employee2 = new StockObserver("易管查",secretary1);
        //看NBA的同事
        Observer employee3 = new NBAObserver("兰秋幂",secretary1);

        //前台登记下三个同事
        secretary1.attach(employee1);
        secretary1.attach(employee2);
        secretary1.attach(employee3);

        //当发现老板回来了时
        secretary1.setAction("老板回来了");
        //通知三个同事
        secretary1.notifyEmployee();

		System.out.println();
		System.out.println("**********************************************");

	}
}

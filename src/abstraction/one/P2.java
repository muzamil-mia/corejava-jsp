package abstraction.one;

public class P2 extends P1{
	public P2(int j) {
		super(j);
		System.out.println("from constructor of P2");
	}
	public void run() {
		System.out.println("from run method of P2 Inherited from P1");
	}
	
	public void sum() {
		System.out.println("from sum method of P2 inherited from p1");
	}
}

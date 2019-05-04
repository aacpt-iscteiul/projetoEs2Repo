package GrupoDeTrabalho.ProjetoDeTeste;

public class MegaClass {

	private int a;
	private int b;

	public MegaClass(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int sum() {
		int res = a + b;
		System.out.println("the sum of " + a + " + " + b + " is = " + res);
		return res;
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		MegaClass mega = new MegaClass(a, b);
		mega.sum();
	}

}

package ornek5;

public class Calistir {
	public static void main(String[] args) throws InterruptedException {
		Sayac sayac1 = new Sayac("sayac1");
		Sayac sayac2 = new Sayac("sayac2");
		Thread t1 = new Thread(sayac1);
		Thread t2 = new Thread(sayac2);
		t1.start();
		t2.start();
		// new Thread(sayac2).start();
	}
}

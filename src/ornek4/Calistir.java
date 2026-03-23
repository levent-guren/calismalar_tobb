package ornek4;

public class Calistir {
	public static void main(String[] args) throws InterruptedException {
		Sayac sayac1 = new Sayac();
		Sayac sayac2 = new Sayac();
		Thread t1 = new Thread(sayac1);
		t1.start();

		new Thread(sayac2).start();
		t1.join(); // thread'in bitmesini bekleriz.
		// t1.wait(); wait komudu notify komudunun çağırılmasını bekler
		// t1.notify();
		System.out.println("Program bitti");
	}
}

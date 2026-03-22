package ornek4;

public class Calistir {
	public static void main(String[] args) {
		Sayac sayac1 = new Sayac();
		Sayac sayac2 = new Sayac();
		new Thread(sayac1).start();
		new Thread(sayac2).start();
		System.out.println("Program bitti");
	}
}

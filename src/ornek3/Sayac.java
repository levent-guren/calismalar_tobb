package ornek3;

public class Sayac extends Thread {
	private int sayi = 10;

	@Override
	public void run() {
		while (sayi > 0) {
			System.out.println(sayi--);
			bekle(500);
		}
	}

	private void bekle(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

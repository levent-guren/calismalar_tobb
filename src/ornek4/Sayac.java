package ornek4;

public class Sayac implements Runnable {
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

package ornek5;

public class Sayac implements Runnable {
	private static int sayi = 10;
	private String name;

	public Sayac(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		sayiyiAzalt(name);
	}

	private synchronized static void sayiyiAzalt(String name) {
		for (int i = 0; i < 5; i++) {
			int t = sayi;
			bekle(500);
			sayi = t - 1;
			System.out.println(name + ": " + sayi);
		}
	}

	private static void bekle(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

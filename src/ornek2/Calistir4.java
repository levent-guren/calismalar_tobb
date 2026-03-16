package ornek2;

public class Calistir4 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			test(-5);
		} catch (Hata e) {
			System.out.println(5);
			System.out.println(e.getHataKodu());
			System.out.println(e.getMessage());
		}
		System.out.println(2);
	}

	public static int test(int sayi) throws Hata {
		if (sayi < 0) {
			throw new Hata("Sayı sıfırdan küçük olamaz", 103);
		}
		return sayi * 2;
	}
}

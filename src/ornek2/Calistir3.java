package ornek2;

public class Calistir3 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			test();
		} catch (Exception e) {
			System.out.println(5);
			try {
				int b = 3 / 0;
			} catch (Exception e2) {

			}
		}
		System.out.println(2);
	}

	public static void test() {
		try {
			System.out.println(3);
			int a = 3 / 0;
			System.out.println(4);
		} finally {
			System.out.println(8);
		}
	}
}

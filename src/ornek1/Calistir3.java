package ornek1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Calistir3 {
	public static void main(String[] args) {
		File dosya = new File("dosyaScanner.txt");
		try {
			dosyayaYaz(dosya);
			dosyadanOku(dosya);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("bitti");
	}

	private static void dosyayaYaz(File dosya) throws Exception {
		try (FileWriter fw = new FileWriter(dosya)) {
			fw.append("a 123 ali 52");
		}
	}

	private static void dosyadanOku(File dosya) throws Exception {
		try (Scanner s = new Scanner(dosya)) {
			while (s.hasNext()) {
				String str = s.next();
				System.out.println(str);
				int a = s.nextInt();
				System.out.println(a * 2);
			}
		}

	}

}

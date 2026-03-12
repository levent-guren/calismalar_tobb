package ornek1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

@SuppressWarnings("unused")
public class Calistir2 {
	public static void main(String[] args) {
		File dosya = new File("dosya.bin");
		try {
			// dosyayaYaz(dosya);
			// dosyadanOku(dosya);
			dosyadanOku2(dosya);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("bitti");
	}

	private static void dosyayaYaz(File dosya) throws Exception {
		try (FileOutputStream fos = new FileOutputStream(dosya, false)) {
			fos.write(12);
			fos.write(240);
			fos.write(5);
			fos.write(127);
		}
	}

	private static void dosyadanOku(File dosya) throws Exception {
		try (FileInputStream fis = new FileInputStream(dosya)) {
			while (fis.available() > 0) {
				int a = fis.read();
				System.out.println(a);
			}
		}

	}

	private static void dosyadanOku2(File dosya) throws Exception {
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(dosya))) {
			while (bis.available() > 0) {
				int a = bis.read();
				System.out.println(a);
			}
		}

	}

}

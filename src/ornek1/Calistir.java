package ornek1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

@SuppressWarnings("unused")
public class Calistir {
	public static void main(String[] args) {
		File dosya = new File("dosya.txt");
		// dosyaya karakter yazma
		try {
			// dosyayaYaz(dosya);
			// dosyadanOku(dosya);
			dosyadanOku2(dosya);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("devam");
	}

	private static void dosyadanOku2(File dosya) throws Exception {
		try (FileReader fr = new FileReader(dosya)) {
			int c;
			do {
				c = fr.read();
				if (c != -1) {
					System.out.print((char) c);
				}
			} while (c != -1);
			System.out.println();
		}

	}

	private static void dosyadanOku(File dosya) throws Exception {
		FileInputStream fis = new FileInputStream(dosya);
		InputStreamReader isr = new InputStreamReader(fis);
		int c;
		do {
			c = isr.read();
			if (c != -1) {
				System.out.print((char) c);
			}
		} while (c != -1);

		isr.close();
		fis.close();
	}

	private static void dosyayaYaz(File dosya) throws Exception {
		FileOutputStream fos = new FileOutputStream(dosya, false);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.append("Levent");
		osw.close();
		fos.close();
		System.out.println("bitti");
	}

	private static void dosyayaYaz2(File dosya) throws Exception {
		try (FileWriter fw = new FileWriter(dosya)) {
			fw.append("Levent");
		}
		System.out.println("bitti");

	}

}

package ornek2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Calistir {
	public static void main(String[] args) {
		// List
		List<String> liste = new ArrayList<String>();
		liste.add("Ankara");
		liste.add("İstanbul");
		String x = liste.get(0);
		System.out.println(x.length());

		// Set
		Set<Integer> sayilar = new HashSet<>();
		sayilar.add(Integer.valueOf(3));
		sayilar.add(5);
		sayilar.add(3);
		sayilar.add(2);

		System.out.println(sayilar.size());

		Iterator<Integer> itr = sayilar.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----");
		for (int s : sayilar) {
			System.out.println(s);
		}

		// Map
		System.out.println("---- MAP ---");
		Map<Integer, String> sehirler = new HashMap<>();
		sehirler.put(6, "Ankara");
		sehirler.put(1, "Adana");
		sehirler.put(34, "İstanbul");
		sehirler.put(7, "Antalya");

		System.out.println(sehirler.get(6));
		System.out.println(sehirler.get(7));

		for (int plakaKodu : sehirler.keySet()) {
			System.out.println(plakaKodu);
		}
		System.out.println(sehirler.values());

		// Queue
		Queue<String> kuyruk = new LinkedList<String>();
		kuyruk.add("Ali");
		kuyruk.add("Zeynep");
		kuyruk.add("Veli");
		kuyruk.add("Hasan");

		System.out.println(kuyruk.poll());
		System.out.println(kuyruk.size());

	}
}

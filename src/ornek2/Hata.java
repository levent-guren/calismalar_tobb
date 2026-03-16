package ornek2;

public class Hata extends Exception {
	private static final long serialVersionUID = -8703022824396048949L;
	private int hataKodu;

	public Hata(String message, int kod) {
		super(message);
		this.hataKodu = kod;
	}

	public int getHataKodu() {
		return hataKodu;
	}

}

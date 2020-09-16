
public class AcAdapter extends Dengen {

	private int adaptee;

	public int kyuuden() {
		adaptee = (int) (JapaneseConsent.specificRequest() * 1.6 / 10);
		return adaptee;
	}

}

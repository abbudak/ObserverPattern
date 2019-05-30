
public class IftarVaktiObserverDemo {

	public static void main(String[] args) {
		IftarVakti iftarvakti = new IftarVakti();

		new IstanbulCamiObserver(iftarvakti);
		new AnkaraCamiObserver(iftarvakti);
		new TrabzonCamiObserver(iftarvakti);

		System.out.println("Saat 15, iftara kaç saat kaldi?");
		iftarvakti.setIftarVakti(15);
	}
}
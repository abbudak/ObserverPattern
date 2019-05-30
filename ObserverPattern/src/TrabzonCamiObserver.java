public class TrabzonCamiObserver extends Observer {

	public TrabzonCamiObserver(IftarVakti iftarvakti) {
		this.iftarvakti = iftarvakti;
		this.iftarvakti.attach(this);
	}

	@Override
	public void update() {
		int _iftarvakti = iftarvakti.getIftarVakti();
		_iftarvakti = _iftarvakti + 3;
		System.out.println("Trabzon için iftar vakti: " + _iftarvakti);
	}
}
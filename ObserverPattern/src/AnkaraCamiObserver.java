public class AnkaraCamiObserver extends Observer {

	public AnkaraCamiObserver(IftarVakti iftarvakti) {
		this.iftarvakti = iftarvakti;
		this.iftarvakti.attach(this);
	}

	@Override
	public void update() {
		int _iftarvakti = iftarvakti.getIftarVakti();
		_iftarvakti = _iftarvakti + 4;
		System.out.println("Ankara için iftar vakti: " + _iftarvakti);
	}
}
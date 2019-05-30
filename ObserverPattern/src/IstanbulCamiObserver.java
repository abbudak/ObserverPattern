public class IstanbulCamiObserver extends Observer {

	public IstanbulCamiObserver(IftarVakti iftarvakti) {
		this.iftarvakti = iftarvakti;
		this.iftarvakti.attach(this);
	}

	@Override
	public void update() {
		int _iftarvakti = iftarvakti.getIftarVakti();
		_iftarvakti = _iftarvakti + 5;
		System.out.println("Istanbul için iftar vakti: " + _iftarvakti);
	}
}
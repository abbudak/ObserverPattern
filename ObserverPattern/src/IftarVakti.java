import java.util.ArrayList;
import java.util.List;

public class IftarVakti {

	private List<Observer> observers = new ArrayList<Observer>();
	private int iftarvakti;

	public int getIftarVakti() {
		return iftarvakti;
	}

	public void setIftarVakti(int iftarvakti) {
		this.iftarvakti = iftarvakti;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
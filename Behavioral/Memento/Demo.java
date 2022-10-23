import java.util.List;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		List<Originator.Memento> savedState = new ArrayList<Originator.Memento>();

		Originator originator = new Originator();
		originator.set("State1");
		originator.set("State2");
		savedState.add(originator.saveToMemeto());
		originator.set("State3");
		savedState.add(originator.saveToMemeto());
		originator.set("State4");
		originator.restoreFromMemento(savedState.get(1));
		System.out.println(originator.getState());
		originator.restoreFromMemento(savedState.get(0));
		System.out.println(originator.getState());
	}
}
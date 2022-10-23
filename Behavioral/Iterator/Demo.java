import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		Iterator<Integer> iterator = RangeIterator.range(3, 7);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
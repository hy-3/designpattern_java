import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangeIterator {
	public static Iterator<Integer> range(int start, int end) {
		return new Iterator<Integer>() {
			private int index = start;

			@Override
			public boolean hasNext() {
				return index < end;
			}

			@Override
			public Integer next() {
				if (!hasNext()) {
					throw new NoSuchElementException();
				}
				return index++;
			}
		};
	}
}

package java17_collection;

public class UserList {
	private Object[] sale = new Object[3];
	private int pointer = 0;

	public UserList() {

	}

	public void add(Object element) {
		if (sale.length == pointer) {
			Object[] arr = new Object[sale.length * 2];
			System.arraycopy(sale, 0, arr, 0, sale.length);
			sale = arr;
		}
		sale[pointer++] = element;
	}

	public Object get(int index) {
		if (index < pointer)
			return sale[index];
		else
			throw new ArrayIndexOutOfBoundsException(index);
	}

	// 요소 개수
	public int size() {
		return pointer;
		// return sale.length;
	}

	public Object remove(int index) {
		Object obj = sale[index];
		for (int i = 0; i < pointer; i++) {
			sale[i] = sale[i + 1];
		}
		pointer--;
		return obj;
	}

}

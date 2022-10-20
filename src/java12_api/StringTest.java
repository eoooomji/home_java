package java12_api;

public class StringTest {
	private char[] arr;
	
	public StringTest() {
		
	}
	
	public StringTest(char[] arr) {
		this.arr = arr;
	}
	
	public int length() {
		return arr.length;
	}
	
	public boolean isUpperCase(int index) {
		if(arr[index]>='A'&&arr[index]<='Z')
			return true;
		else
			return false;
	}
	
	public boolean isLowerCase(int index) {
		if(arr[index] >= 'a' && arr[index]<='z')
			return true;
		else
			return false;
	}
	
	public char charAt(int index) {
		return arr[index];
	}
	
	@Override
	public String toString() {
		String sn = "";
		for(char cn : arr)
			sn += cn;
		return sn;
	}
}

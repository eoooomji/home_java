package java16_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Phone implements Serializable {
	String name;
	transient int price; // 특정 멤버변수만 직렬화를 안시키게끔 하는 기능

	public Phone() {

	}

	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%s %d \n", name, price);
	}

}

public class Java136 {

	public static void main(String[] args) {
		File file = new File("src/java16_stream/phone.dat");

		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		FileInputStream fi = null;
		ObjectInputStream oi = null;

		try {
			fs = new FileOutputStream(file);
			os = new ObjectOutputStream(fs);

			// 객체에 직렬화가 안되어 있으면 Exception이 발생한다.

			Phone p = new Phone("android", 5000);
			os.writeObject(p);
			os.writeObject(new String("java"));
			System.out.println("객체 저장");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
				fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		//////////////////////////////////////////////

		try {
			fi = new FileInputStream(file);
			oi = new ObjectInputStream(fi);
			Phone p = (Phone) oi.readObject();
			System.out.println(p.toString());

			String sn = (String) oi.readObject();
			System.out.println(sn.toString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
				oi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end main()

} // end class

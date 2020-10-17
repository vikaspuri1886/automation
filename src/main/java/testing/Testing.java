package testing;

import java.util.Random;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		String s = String.valueOf(random.nextInt()).concat("@gmail.com");
		System.out.println(s);
	}

}

package pro_1;

import java.util.stream.Stream;

public class OneB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"Bill","Thomas","Marry"};
		Stream.of("Bill","Thomas","Marry").forEach(System.out::println);
	}

}

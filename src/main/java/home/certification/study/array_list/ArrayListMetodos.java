package home.certification.study.array_list;

import java.util.ArrayList;
import java.util.List;

enum Suit{ CLUBS, DIAMONDS, HEARTS, SPADES}
public class ArrayListMetodos {

	public static void main(String[] args) {
		List<String> array = new ArrayList<>();
		System.out.println(array.add("Valor"));
		System.out.println(Suit.CLUBS);
	}

}

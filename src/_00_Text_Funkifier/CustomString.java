package _00_Text_Funkifier;

import java.util.ArrayList;
import java.util.Random;

public class CustomString extends SpecialString {

	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String scramble = "";
		Random random = new Random();
		ArrayList<Character> notUsed = new ArrayList<Character>();
		for(int i = 0; i <= notUsed.size(); i++) {
			notUsed.add(s.charAt(i));
		}
		while(notUsed.size() > 0) {
			int place = random.nextInt(notUsed.size());
			char c = notUsed.get(place);
			notUsed.remove(place);
			System.out.println("c " + c);
			if(place % 2 == 0) {
				c = Character.toLowerCase(c);
			}
			else {
				c = Character.toUpperCase(c);
			}
			scramble = scramble + c;
		}
		return scramble;
	}

}

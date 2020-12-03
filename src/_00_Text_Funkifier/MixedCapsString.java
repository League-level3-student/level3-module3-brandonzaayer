package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String mixed = "";
		for(int i = 0; i < s.length(); i++) {
			String lower = s.toLowerCase();
			String upper = s.toUpperCase();
			if(i % 2 == 0) {
				mixed += lower.charAt(i);
			}
			else {
				mixed += upper.charAt(i);
			}
			}
		return mixed;
	}
}

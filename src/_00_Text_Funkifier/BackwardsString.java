package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String backwards = "";
		for(int i = 0; i <= s.length(); i++) {
			backwards = backwards + s.charAt(s.length() - i);
			}
		return backwards;
	}

}

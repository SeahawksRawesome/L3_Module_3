package interfaces;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String string) {
		String x = "";
		for(int i = string.length()-1; i >= 0; i--) {
			x += string.charAt(i);
		}
		return x;
	}

}

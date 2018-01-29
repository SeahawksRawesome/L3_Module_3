package interfaces;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String string) {
		char y;
		String q = "";
		for(int i = 0; i < string.length(); i++) {
			if(i%2 == 1) {
				//Even will make it caps
				 y = string.charAt(i);
				y = Character.toUpperCase(y);
				
			}
			else {
				//Odd will make it UNCAPS
				 y = string.charAt(i);
				y= Character.toLowerCase(y);
			}
			q += y;
		}
		return q;
	}

}

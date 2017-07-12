package locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class MainLocale {
	public static void main(String[] args){
		Locale locale = new Locale("en", "EN");
		ResourceBundle rb = ResourceBundle.getBundle("text", locale);
		String s = rb.getString("greating");
		System.out.println(s);

		locale = new Locale("ru", "RU");
		rb = ResourceBundle.getBundle("text", locale);
		s = rb.getString("greating");
		System.out.println(s);
		
	}
}

package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {

	public static void main(String[] arg){
		//21. В заданном тексте найти сумму всех встречающихся цифр.
		
		String text = "EPAM Systems, Inc. (the “Company�?) held its Annual Meeting of Stockholders on June 6, 2017 (the “2017 Annual Meeting�?). A total of 51,732,451 shares of the Company’s common stock were entitled to vote on matters presented to stockholders at the 2017 Annual Meeting as of April 10, 2017.";
		Matcher matcher = Pattern.compile("\\d").matcher(text);
		double sum = 0;
		while (matcher.find()) {
			sum += Integer.parseInt(matcher.group());
		}
		System.out.println(sum);
	}
}

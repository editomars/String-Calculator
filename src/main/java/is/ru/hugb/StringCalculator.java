package is.ru.hugb;

import java.lang.IllegalArgumentException;

public class StringCalculator {
	
	public static int add(String text){
		if(text.equals(""))
			return 0;
		else {
			if(text.contains(",")){
				String numbers[] = text.split(",|\n");
				return sum(numbers);
		}
			return 1;
		}
	}
	
	private static int toInt(String number){
		return Integer.parseInt(number);
	}
	
	private static int sum(String [] numbers){
		int total = 0;
		for(String number : numbers){
			total += toInt(number);
		}
		return total;
	}
	
	private static void throwNegatives(String [] numbers) {
		String messages = "Negatives not allowed: ";
		String negatives = "";
		int n = 0;
		for(String number: numbers) {
			n = toInt(number);
			if(n < 0) {
				if(negatives.equals("")) {
					negatives = "" + n;
				}
				else {
					negatives = negatives + "," + n;
				}
			}
		}
		
		messages += negatives;
		throw new RuntimeException(messages);
	}
}
package is.ru.hugb;

public class StringCalculator{
	
	public static int add(String text){
		if(text.equals(""))
			return 0;
		else{
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
	
	private static int bigNumbers(String [] numbers) {
    	int total = 0;
		for(String number : numbers) {
			int n = toInt(number);
			if(n < 0)
				return n;
			else if(n > 1000)
				continue;
			else
				total += toInt(number);
		}
		return total;
    }

}

public class GuessingGame {

	public static void main(String[] args) {
		
		String argLow = args[0];
		int lowInt = Integer.parseInt(argLow);
		String argHigh = args[1];
		int highInt = Integer.parseInt(argHigh);
		
		if(isNumeric(argLow) || isNumeric(argHigh)) {
			Guesser guesser = new Guesser(lowInt, highInt);	
			guesser.start();
		}
	}
	
	public static boolean isNumeric(String strNum) {
		try {
			Integer.parseInt(strNum);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}


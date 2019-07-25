
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class AS {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(AS.class);
		
		if (args.length == 2) {
			try {
				int a = Integer.parseInt(args[0]);
				int b = Integer.parseInt(args[1]);
				System.out.println("a + b = " + a + " + " + b + " = " + (a + b));
			} catch (NumberFormatException e) {
				System.err.println("Invalid Input: Please enter numbers.");
			}
		} else {
			System.err.println("Missing Input: Please enter TWO numbers.");
			// logger.info("This is an exception message");
		}
	}

}

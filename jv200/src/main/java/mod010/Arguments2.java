package mod010;

public class Arguments2 {
	public static void main(String[] args) {
		try {
			int sum = 0;
			for (String arg : args) {
				sum += Integer.parseInt(arg);
			}
			System.out.println("Sum = " + sum);
		}catch (NumberFormatException nfe) {
			System.err.println("One of the command-line" + "argment is not integer.");
		}
	}
}

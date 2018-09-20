import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] argumentos = input.split(" ");
		int tentativas = Integer.parseInt(argumentos[2]);
		MonteCarloSolver ms = new MonteCarloSolver(tentativas);
		System.out.println("Total number of points :  " + ms.tries);
		System.out.println("Points within circle:  " + ms.inner);
		System.out.println("Pi estimation:  " + ms.PI);

	}

}

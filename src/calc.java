import java.util.Locale;
import java.util.Scanner;

public class calc {

	public static void main(String args[]) {
			
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int A, B, resultado;
		String op;

		while (sc.hasNext()) {
			A = sc.nextInt();
			op = sc.next();
			B = sc.nextInt();
			if (op.equals("+")) {
				resultado = A + B;
			}
			else if (op.equals("-")) {
				resultado = A - B;
			}
			else if (op.equals("x")) {
				resultado = A * B;
			}
			else {
				resultado = A / B;
			}
			System.out.println(resultado);
		}		
		
		sc.close();
	}
}

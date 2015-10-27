
public class ErgaenzungPQFormel {

	public static void main(String[] args) {
		double p = 8;
		double q = 15;

		double unterderwurzel = ((p / 2) * (p / 2) - q);
		double vorderwurzel = -1 * (p / 2);

		if (unterderwurzel < 0) {
			System.out.println("Keine reele Lösung.");
		} else {
			if (unterderwurzel == 0) {
				System.out.println("Nur eine Lösung, Lösung ist = "
						+ vorderwurzel);
			} else {

				double loesung1 = vorderwurzel + Math.sqrt(unterderwurzel);
				double loesung2 = vorderwurzel - Math.sqrt(unterderwurzel);

				System.out.println("x1 =" + loesung1);
				System.out.println("x2 =" + loesung2);

			}

		}

	}
}

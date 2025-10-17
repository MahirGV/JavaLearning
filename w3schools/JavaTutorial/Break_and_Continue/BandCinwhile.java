package Break_and_Continue;

public class BandCinwhile {
	public static void main(String[] args) {

		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
			if (i == 4) {
				continue;//break;

			}
		}

	}
}

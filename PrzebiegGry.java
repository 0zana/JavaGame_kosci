import java.util.Scanner;

public class PrzebiegGry {
	
	public static void start() {
		Scanner scanner = new Scanner(System.in);
		int punkty = 0;
		do {
			int liczba1=InterfejsUzytkownika.losowanie();
			int liczba2=InterfejsUzytkownika.losowanie();
			int suma = Integer.sum(liczba1, liczba2);
			System.out.println(liczba1 + " " + liczba2 + ", których suma = " + suma);
			System.out.println("Chcesz zagrać? (True/False)" );
			boolean odpowiedz = scanner.nextBoolean();
			if (odpowiedz) {
				int twojaLiczba1=InterfejsUzytkownika.losowanie();
				int twojaLiczba2=InterfejsUzytkownika.losowanie();
				int twojaSuma = Integer.sum(twojaLiczba1, twojaLiczba2);
				System.out.println(twojaLiczba1 + " " + twojaLiczba2 + ", których suma = " + twojaSuma);
				if (twojaSuma>=suma) {
					System.out.println("Brawo! Udało ci się!");
					punkty+=2;
				}else {
					System.out.println("Niestety! Twoja liczba jest mnniejsza");
					punkty+=-2;
				}
			}else {
				System.out.println("Pass");
				punkty+=-1;
			}
			System.out.println("Punkty: " + punkty);
		
		}while (punkty<5&&punkty>-5);
		if (punkty>5) {
			System.out.println("Brawo! Jesteś zwycięzcą!");
		}else {
			System.out.println("Niestety Ci się nie udało. Przegrałeś/Przegrałaś");
		}
	}
}

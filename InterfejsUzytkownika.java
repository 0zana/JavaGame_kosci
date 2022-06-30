import java.util.Random;

public class InterfejsUzytkownika {
	
	public static int losowanie() {
		Random random = new Random();
		int liczba = random.nextInt(7);
		return liczba;
	}
}

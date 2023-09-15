import java.util.Random;
import java.util.Scanner;

public class UserCreator {
  public static User createUser() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Masukkan Nama: ");
    String name = scanner.nextLine();

    System.out.println("Masukkan Tanggal Lahir (dd-mm-yyyy): ");
    String birthDate = scanner.nextLine();

    System.out.println("Masukkan Asal Daerah: ");
    String origin = scanner.nextLine();

    int randomNumber = random.nextInt(10000);

    return new User(name, birthDate, origin, randomNumber);
  }
}

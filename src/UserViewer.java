import java.util.ArrayList;

public class UserViewer {
  public static void viewUsers(ArrayList<User> users) {
    for (User user : users) {
      System.out.println("Nama: " + user.name);
      System.out.println("Tanggal Lahir: " + user.birthDate);
      System.out.println("Nama: " + user.origin);
      System.out.println("Nama: " + user.randomNumber);
    }
  }
}

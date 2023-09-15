import java.util.ArrayList;
import java.util.Scanner;

public class ATMProject {
  public static void main(String[] args) {
    ArrayList<User> users = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Selamat Datang Di ATM");
      System.out.println("1. Buat Akun");
      System.out.println("2. Tampilkan Semua Akun");
      System.out.println("3. Keluar");
      System.out.print("Pilih opsi: ");
      int choice = scanner.nextInt();
      // scanner.nextInt(); // newLine yang tersisa

      if (choice == 1) {
        users.add(UserCreator.createUser());
        System.out.println("Akun Baru Berhasil Dibuat.");
      } else if (choice == 2) {
        UserViewer.viewUsers(users);
      } else if (choice == 3) {
        break;
      } else {
        System.out.println("Pilihan tidak tersedia di Menu. Silahkan coba lagi.");
      }
    }
    scanner.close();
  }
}

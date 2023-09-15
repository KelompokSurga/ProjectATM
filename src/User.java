public class User {
  String name;
  String birthDate;
  String origin;
  int randomNumber;

  User(String name, String birthDate, String origin, int randomNumber) {
    this.name = name;
    this.birthDate = birthDate;
    this.origin = origin;
    this.randomNumber = randomNumber;
  }

  // @Override
  // public String toString() {
  // return "Nama: " + name + "\n, Tanggal Lahir: " + birthDate + "\n, Asal
  // Daerah: " + origin + "\n, Nomor Random: "
  // + randomNumber;
  // }
}

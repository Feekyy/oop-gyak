package onnallo;
import java.util.Scanner;

public class runner
{

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args)
  {
    person person = new person();
    System.out.print("Adj meg egy személy nevét: ");
    person.setName(sc.nextLine());
    System.out.print("Adj meg egy személy tömegét: ");
    person.setSuly((Integer.parseInt(sc.nextLine())));
    System.out.print("Adj meg egy személy magasságát: ");
    person.setMgssg(Double.parseDouble(sc.nextLine()));
    System.out.println(person.osszefuz());
    sc.close();
  }
}

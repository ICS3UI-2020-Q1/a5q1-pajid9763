import java.util.Scanner;

/**
 * program for a 1-12 multiplication table
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask the user for an integer
  System.out.println("Please enter an integer to create a multiplication table for");
  int num = input.nextInt();

  // create the multiplication table
  for (int i = 1; i <= 12; i++){
    int sum = i * num;
    System.out.println(i + " x " + num + " = " + sum);
  }
    
  }
}

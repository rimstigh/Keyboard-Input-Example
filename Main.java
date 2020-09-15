import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String name;
    int num;
    double gasPrice;
    boolean sunny;

    System.out.println("What's your name? Type your name, then press enter: ");
    name = s.nextLine();
    System.out.println("Hi there, " + name + ". What's your favorite number? Type a whole number, then press enter: ");
    num = s.nextInt();
    System.out.println(name + ", " + num + " is my favorite number too. \n What is the gas price in your neighborhood? Type a decimal number, then press enter: ");
    gasPrice = s.nextDouble();
    System.out.println("Wow, $"+ gasPrice + " isn't too bad.");
    System.out.println("Is it sunny for you today? Type the word true for yes, or false for no, then press enter: ");
    sunny = s.nextBoolean();
    if (sunny == true) 
      System.out.println(name + ", that's great! I love sunny weather.");
    
    else 
      System.out.println("Too bad, " + name + ", hopefully the sun will come out tomorrow");
  
  }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
            /*   System.out.println("Podaj swoje imię");
            Scanner scanner = new Scanner(System.in); 
            String firstName = scanner.nextLine();
                
            System.out.println("Twoje imię to " + firstName);
            scanner.close();
            */
             /*
                Scanner scanner = new Scanner(System.in); 
            
                System.out.println("Podaj pierwszą liczbe");
                int a = scanner.nextInt();
            
                System.out.println("Podaj drugą liczbe");
                int b = scanner.nextInt();
                
                System.out.println("Podaj trzecią liczbe");
                int c = scanner.nextInt();
                
                System.out.println("Wynik: " + (a + b + c));
             scanner.close();
              */
   
            
              Scanner scanner = new Scanner(System.in); 
            
              System.out.println("Podaj pierwszą liczbe");
              int a = scanner.nextInt();
            
            
              System.out.println("Podaj + lub -");
              scanner.nextLine();
              String o = scanner.nextLine();
            
            
              System.out.println("Podaj drugą liczbe");
              int b = scanner.nextInt();
              

            if(o.equals("+")){
            System.out.println("Wynik to "+ (a+b));
            }else if(o.equals("-")){
            System.out.println("Wynik to "+ (a-b));
            }else{
            System.out.println("Złe dane");
            }
            scanner.close();
    }
}

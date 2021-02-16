import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
              /* //Przykład wprowadzania danych  
             System.out.println("Podaj swoje imię");
             Scanner scanner = new Scanner(System.in); 
             String firstName = scanner.nextLine();
                
             System.out.println("Twoje imię to " + firstName);
             scanner.close();
             */
                 /* //Przykład wpisywania informacje oraz dodawanie 
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
              /* //Prosty kalkulator (dodawanie i odejmowanie)
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
            */
            
            Scanner scanner = new Scanner(System.in); 
            
            System.out.println("Podaj pierwszą liczbe");
            int a = scanner.nextInt();
          
            System.out.println("Podaj + lub - lub * lub /");
            scanner.nextLine();
            String o = scanner.nextLine();
          
            System.out.println("Podaj drugą liczbe");
            int b = scanner.nextInt();
           
            scanner.close();
            
            switch(o){
                case "+":
                 System.out.println("Wynik dodawania to "+(a+b));
                 break;
            case "-":
                 System.out.println("Wynik odejmowania to "+(a-b));
                 break;
            case "*":
                 System.out.println("Wynik mnożenia to "+(a*b));
                 break;
            case "/": 
                 System.out.println("Wynik dzielenia to "+(a/b)+" reszty "+(a%b));
                 break;
            default:
                  System.out.println("Złe dane");
                  break;
         
        }
    
    }
}

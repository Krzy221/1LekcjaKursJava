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
/* //Kalkulator Switch
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
            */
           


/*  //Familiada
int wynik = 0;
Scanner scanner = new Scanner(System.in);
        
String[][] dane = {
   {"Więcej niż jedno zwierzę","stado","klucz","dwa","owca","lama"},
   {"Sporty na S","sztafeta","skok o tyczce", "skoki narciarskie", "sumo", "szachy"}
      };
        
for(int i = 0; i < dane.length; i++){
    System.out.println(dane[i][0]); 
    String odp = scanner.nextLine(); 
    boolean OK = false;                               //boolean  Fałsz.
              
for(int it = 1; it < dane[i].length; it++){     
   if(odp.equals(dane[i][it])){
   OK = true;                                  // Prawda
   System.out.println( "BRZDĘK" );
   wynik += it*10;
    }
}
if(!OK){                                               //Fałsz
 System.out.println("X");
}
    }      
            
System.out.println("Twój wynik to "+wynik);
scanner.close();
*/   
   }
}

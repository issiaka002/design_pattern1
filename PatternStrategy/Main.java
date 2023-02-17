
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) throws Exception{
	    boolean fin=false;
		
		Context client = new Context();
		client.process();
		
		////changement d'etat
		//client.setStrategy(new ImplStrategy1());
		//client.process();
		
		////changement d'etat
		//client.setStrategy(new ImplStrategy2());
		//client.process();
		
		
		Scanner clavier = new Scanner(System.in);
		//Changement dynamique 
		while(!fin){
		    System.out.println("Quelle strategy voulez-vous utiliser ? ..");
		    String rep = clavier.nextLine();
		    
		    //on charge la classe dynamiquement et on l'instancie
		    Strategy strategy = (Strategy)Class.forName(rep).newInstance();
		    client.setStrategy(strategy);
		    client.process();
		    
		}
	}
}

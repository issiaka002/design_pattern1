
import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    Personne reine = new Reine();
	    reine.combattre();
	    
	    System.out.println("**********************************");
	    Personne chevalier = new Chevalier();
	    chevalier.setArme(new Lance());
	    chevalier.combattre();
	    
	    System.out.println("**********************************");
	    Personne roi = new Roi();
	    roi.combattre();
	    roi.getScore();
	    roi.combattre();
	    roi.combattre();
	    roi.combattre();
	    roi.combattre();
	    roi.combattre();
	    roi.getScore();
	   
	    
	   
		
	}
}

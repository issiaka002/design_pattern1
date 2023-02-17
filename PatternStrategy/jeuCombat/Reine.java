public class Reine extends Personne{
    
    public Reine(){
        this.arme = new Epe();
    }
    
    public void combattre(){
        System.out.println("Je suis la Reine !!");
        this.arme.utiliserArme();
    }
}
public class Chevalier extends Personne{
    
    public Chevalier(){
        this.arme = new Epe();
    }
    
    public void combattre(){
        System.out.println("Je suis le Chevalier");
        this.arme.utiliserArme();
    }
}
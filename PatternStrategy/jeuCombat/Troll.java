public class Troll extends Personne{
    
    public Troll(){
        this.arme = new Epe();
    }
    
    public void combattre(){
        System.out.println("Je suis le Troll");
        this.arme.utiliserArme();
    }
}
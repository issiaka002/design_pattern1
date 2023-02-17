public class Roi extends Personne{
    
    public Roi(){
        this.arme = new Epe();
    }
    public void combattre(){
        score++;
        System.out.println("Je suis le Roi ");
        this.arme.utiliserArme();
        if(score>3){
            //si le score est >5 on change d'arme
            this.setArme(new Hache());
        }
    }
}
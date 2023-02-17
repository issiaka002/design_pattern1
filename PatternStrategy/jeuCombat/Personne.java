public abstract class Personne{
    protected TypeArme arme;
    protected int score=0;
    
    public void setArme(TypeArme arme){
        this.arme = arme;
    }
    
    public abstract void combattre();
    
    public void getScore(){
        System.out.println("Score="+this.score);
    }
}
public class Creme extends IngrediantBoisson{
    
    public Creme(Boisson boisson){
        super(boisson);
    }
    
    public double cout(){
        return boisson.cout() + 0.9;
    }
    
    public String getDesp(){
        return boisson.getDesp()+ " + Creme";
    }
    
}
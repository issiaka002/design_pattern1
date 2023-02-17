public class Chocolat extends IngrediantBoisson{
    
    public Chocolat(Boisson boisson){
        super(boisson);
    }
    
    public double cout(){
        return boisson.cout() + 8.9;
    }
    
    public String getDesp(){
        return boisson.getDesp()+ " + Chocolat";
    }
    
}
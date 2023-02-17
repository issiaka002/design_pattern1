public class Vanille extends IngrediantBoisson{
    
    public Vanille(Boisson boisson){
        super(boisson);
    }
    
    public double cout(){
        return boisson.cout() + 2.9;
    }
    
    public String getDesp(){
        return boisson.getDesp()+ " + Vanille";
    }
    
}
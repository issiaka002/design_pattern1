public abstract class IngrediantBoisson extends Boisson{
    
    protected Boisson boisson;
    
    public IngrediantBoisson(Boisson boisson){
        this.boisson = boisson;
    }
    
    public abstract String getDesp();
    
    
}
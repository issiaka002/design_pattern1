public abstract class Composant{
    
    protected String name;
    protected int level;
    
    public Composant(String name){
        this.name= name;
    }
    
    public abstract void afficher();
    
    public String indentation(){
        String str="";
        for (int i=0;i<level ;i++ ){
            str += "\t";
        } 
        return str;
    }
    
    
    
}
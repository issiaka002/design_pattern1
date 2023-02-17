public class File extends Composant{
    
    public File(String name){
        super(name);
    }
    
    public void afficher(){
        String tab = indentation();
        System.out.println(tab+"File: "+ name);
    }
    
    
    
}
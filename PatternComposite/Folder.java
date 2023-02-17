import java.util.List;
import java.util.ArrayList;

public class Folder extends Composant{
    
    private List<Composant> composants = new ArrayList<>();
    
    public Folder(String name){
        super(name);
    }
    public void afficher(){
        //on affiche d'abord le nom du dossier...
        String tab = indentation();
        System.out.println(tab+"Folder: "+name);
        
        //ensuite on affiche le contenu du dossier...
        for (Composant cp: composants){
           cp.afficher();
        }  
    }
    public Composant add(Composant cp){
        
        //on definir le niveau du nouvaeau composant egal niveauParent+1...
        cp.level = this.level +1;
        this.composants.add(cp);
        return cp;
    }
    public void remove(Composant cp){
        this.composants.remove(cp);
    }
    
    public String getChilds(){
        String list = ""; 
        for(Composant c: composants){
            list+=c.name;
        }
        return list;
    }
    
    //methode pour rechercher un composant
    public Composant getComposant(String name){
        for (Composant cp: composants){
            if (cp.name.equalsIgnoreCase(name)) return cp;
        }
        return null;
    }
}
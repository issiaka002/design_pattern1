import java.util.ArrayList;
import java.util.List;


public class ObservableImpl1 implements Observable {
    
    //Etant donne qu'on a une relation one to many, on defini une liste (d'observer)
    private List<Observer> observers = new ArrayList<>();
    
    int state=10;
    
    public void addObserver(Observer ob){
        this.observers.add(ob);
    }
    public void removeObserver(Observer ob){
        this.observers.remove(ob);
    }
    public void notifyObserver(){
        for(Observer ob: observers){
            //pour la methode pop
            ob.update(this);
            
            ////pour la methode pop
            //ob.update(this.state);
        }
    }
    
    public int getState(){
        return this.state;
    }
    public void setState(int state){
        this.state=state;
        //lorsque l'etat change on notifi les observers
        this.notifyObserver();
    }
}
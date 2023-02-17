
import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    
        ObservableImpl1 observable = new ObservableImpl1();
        
        Observer ob1 = new ObserverImpl1();
        Observer ob2 = new ObserverImpl2();
        Observer ob3 = new ObserverImpl2();
        Observer ob4 = new ObserverImpl1();
        
        observable.addObserver(ob1);
        observable.addObserver(ob2);
        observable.addObserver(ob3);
        observable.addObserver(ob4);
        
        observable.setState(20);
        System.out.println("*****************************************");
        observable.removeObserver(ob1);
        observable.setState(5);
        
        
		
	}
}

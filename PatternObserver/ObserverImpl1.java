public class ObserverImpl1 implements Observer
{

  //utilisation de la methode pop
  public void update (Observable obs)
  {
    //vu que l'interface Observable n'a pas de methode getState, on va faire un caste vers la class
    int state = ((ObservableImpl1) obs).getState();
    int result = state + 10;
    System.out.println("Le resultat de <<ObserverImpl1>> est: "+result);
  }
  
  ////utilisation de la methode push. on recoit une valeur ou un evenement
    // public void update(int state);
}

public class Context{
    
    private Strategy strategy;
    public Context(){
        this.strategy = new DefaultStrategyImple();;
        
    }
    
    public void process(){
        strategy.applyStrategy();
    }
    
    //methode qui permettra de changer de strategy
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
}
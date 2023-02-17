
public class Main
{
	public static void main(String[] args) {
		Boisson bs = new Expresso();
		System.out.println(bs.getDesp());
		System.out.println("prix= "+bs.cout());
		
		System.out.println("********************************");
		bs = new Vanille(bs);
		System.out.println(bs.getDesp());
		System.out.println("prix= "+bs.cout());
		System.out.println("********************************");
		
		System.out.println("********************************");
		bs = new Chocolat(bs);
		System.out.println(bs.getDesp());
		System.out.println("prix= "+bs.cout());
		System.out.println("******************");
		
		//EXERCICE: faire un interface graphique...
	}
}

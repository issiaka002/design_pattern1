
public class Main
{
  public static void main (String[]args)
  {
    Folder racine = new Folder("Root");
    Folder dos1 = new Folder ("dos1");
    Folder dos2 = new Folder ("dos2");
    Folder dos3 = new Folder ("dos3");
    Folder dos4 = new Folder ("dos4");
    
    Composant f1 = new File("file1");
    Composant f2 = new File("file2");
    Composant f3 = new File("file3");
    Composant f4 = new File("file4");
    
    racine.add(dos1);racine.add(dos2);racine.add(dos3);racine.add(dos4);
    dos1.add(dos2);
    dos1.add(dos3);
    dos2.add(f1);
    dos2.add(f2);
    dos4.add(f4);
    racine.afficher();
    
    System.out.println("+++++++++++++++++++++++++++++++++++++");
    System.out.println(dos1.getChilds());
    

  }
}

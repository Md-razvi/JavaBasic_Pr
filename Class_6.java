 class Main
 {
    static void Name()
    {
        System.out.println("Mudabir Raza");
    }
    void name()
    {
        System.out.println("mudabir raza");
    } 
 }
public class Class_6 {
    public static void main(String[] args)
    {
        //Calling a method directly with the help of static keyword 
        Main.Name();
        // Object calling method 
        Main obj1=new Main();
        obj1.name();

    }   
    
}

// java program cannot be run without Main class 
//  A Main class should always has same name of file
// Class can be simply created by declaring class  and its name
 
//Creating class
 class MyFirstClass{
     String name="Mudabir Raza";
     // Creating Method
     static void FirstMethod()
         {
             System.out.println("Method Calling");
        
         }
     static void FirstMethod(int b)
        {
            System.out.println(b);
        }

}
//Main Class 
public class Class_1 
{
    public static void main(String[] args)  //This should be always present in main class  
 {
     // Creating or calling  object of other class
     MyFirstClass obj1=new MyFirstClass();
     System.out.println(obj1.name);
     MyFirstClass.FirstMethod();// Since I used Static  keyword  I can call through class name to which it belongs
     MyFirstClass.FirstMethod(56);
 }
    
}

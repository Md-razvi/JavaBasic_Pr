//Local And Global variables
// Java laguage does not support global and local variable
// However Java supports block scope
// variables defined in block'{}' will be limited to that block {} only
// However  it can be accessed using static keyword hence making it global or Technically similar 
class VariableAccess
{
      static int b=23;
     static String n="This is my age";
    // Here d is a local variable for VariableAccess block  
    float d=34.456f;
}
public class Class_5 {
    public static void main(String[] args) 
    {
        // They can only accessed if we use the static keyword 
        System.out.println(VariableAccess.b);
        System.out.println(VariableAccess.n);
        //here float d can not be accessed due being in VaraibleAccess block

   } 
}

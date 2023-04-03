
package calculate;
import math.Add;

/**
 *
 * @author gub
 */
public class Calculate {
    public static void main(String[] args){
        Add a = new Add();
        System.out.println("Addition");
        a.Addition(10, 15);
        
        Add b = new Add();
        System.out.println("Substraction");
        b.Substract(10, 15);
        
    }
    
}

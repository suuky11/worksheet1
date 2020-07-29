/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;
import java.util.Scanner;

/**
 *
 * @author Vignesha Masanan
 */
public class calculator {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the a value");
        int a=obj.nextInt();
        System.out.println("enter the b value");
        int b=obj.nextInt();
        System.out.println("enter the operation");
        char c=obj.next().charAt(0);
        switch(c)
        {
            case '+':
                System.out.println("add"+(a+b));
                break;
            case '-':
                System.out.println("sub"+(a-b));
                break;
            case '*':
                System.out.println("mul"+(a*b));
                break;
            case '/':
                System.out.println("div"+(a/b));
                break;
            default:
                System.out.println("cannot perform");
                break;
                
                
        }
    }
    
    
}

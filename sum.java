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
public class sum {
    public static void main(String[] args){
        int n,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the limit");
        n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            sum=sum+obj.nextInt();
        }
        System.out.println("the sum of numbers"+sum);
        
    }
    
}

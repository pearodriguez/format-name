/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


 */
package format.name;

import java.util.Scanner;
/* 
 * @author Peter Rodriguez
 */
public class FormatName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        String line = ""; 
        
        System.out.print("Please enter your full name (firstname middlename lastname): "); 
        line = input.nextLine();

        int pos = line.indexOf(" "); 
        String subStr = line.substring(0, pos); 
        String rep = " "; 
        
        if(pos >= 0){
            rep = line.replaceAll(subStr, " ");           
        }
        
        char fName = subStr.charAt(0); 
        System.out.println(rep.trim() + ", " + fName + "." ); 
    }
    
}

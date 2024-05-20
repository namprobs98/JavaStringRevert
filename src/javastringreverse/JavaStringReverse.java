/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javastringreverse;

import java.util.Scanner;

/**
 *
 * @author Slime nightmare
 */
public class JavaStringReverse {

    /**
     * @param args the command line arguments
     */
    public static boolean isAPalindrome(String s) {
        for (int i = 0; 2 * i <= s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if (isAPalindrome(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}

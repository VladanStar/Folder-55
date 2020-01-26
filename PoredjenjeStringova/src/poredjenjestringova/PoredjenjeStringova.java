/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poredjenjestringova;

/**
 *
 * @author PC
 */
public class PoredjenjeStringova {

   public static void main(String[] args) {
        // Poredjenje
        String s = "objektno programiranje u javi";
        System.out.println("s = " + s);
        
        String t = "Objektno Programiranje u Javi";
        System.out.println("t = " + t);

        System.out.println("s.equals(t) = " + s.equals(t));
        System.out.println("s.equalsIgnoreCase(t) = " + s.equalsIgnoreCase(t));
        System.out.println("s==t = " + (s==t));
        System.out.println("s.compareTo(t) = " + s.compareTo(t));

        // Podstring
        s = "\t" + s;
        System.out.println("s = " + s);
        System.out.println("s.contains(\"program\") = " + s.contains("program"));;
        System.out.println("s.substring(10) = " + s.substring(10));
        System.out.println("s.substring() = " + s.substring(10, 23));
        System.out.println("s.startsWith(\"objektno\") = " + s.startsWith("objektno"));
        System.out.println("s.trim().startsWith(\"objektno\") = " + s.trim().startsWith("objektno"));
        System.out.println("s.endsWith(\"javi\") = " + s.endsWith("javi"));
    }
    
}

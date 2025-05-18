/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.console;

/**
 *
 * @author germanromort
 */
public class NewClass {
    public static void main(String[] args) {
        //1,1,2,3,5,8,13
        
        int[] numeros  = new int[10];
        numeros[0] = 0;
        numeros[1] = 1;
        for (int i = 2; i < numeros.length; i++) {
            numeros[i] = numeros[i-1] + numeros[i-2];
            System.out.println(numeros[i]);
        }
    }
}

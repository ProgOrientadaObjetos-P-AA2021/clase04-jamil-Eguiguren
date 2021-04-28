/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
      String numero = "099460123";
      double minutos = 60;
      double valorMinutos = 0.5;
      Hospital ob = new Hospital(numero, minutos, valorMinutos);
        System.out.printf("%s\n", ob);
        
    }
}


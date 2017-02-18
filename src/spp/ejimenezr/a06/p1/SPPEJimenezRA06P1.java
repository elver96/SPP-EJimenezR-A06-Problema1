/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ejimenezr.a06.p1;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPPEJimenezRA06P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opEntrada;
        Scanner kb = new Scanner(System.in);
        System.out.println("Desea realizar una sumatoria de numeros positivos? 1=Si, 2=No");
        opEntrada=kb.nextInt();
        if(opEntrada==1){
        solicitarDatos();
        }
        else
            System.out.println("Hasta la vista baby!");
    }
    static void solicitarDatos(){
        int num, suma;
        suma=0;
        Scanner kb=new Scanner(System.in);
        do{
            System.out.println("Introducir un número");
            num=kb.nextInt();
            if(num<0){
                System.out.println("La suma de los números es "+suma);
            }else{
                suma=suma+num;
            }
        }while(num>=0);
        System.out.println("Nos vemos luego");
    }
}
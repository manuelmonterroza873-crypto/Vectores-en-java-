package com.mycompany.arreglos_java;

public class Arreglos_java {
    
    public static void main(String[] args){
        int[] edades = {18, 22, 25, 30, 45};
        
        System.out.println("El arreglo tiene " + edades.length + "Elementos.");
        System.out.println("Primer valor: " + edades[4]);
        System.out.println("Valor en la posicion 3:" + edades[3]);
        
        for (int i = 0; i < edades.length; i++){
            System.out.println("Posicion" + i + ":" + edades[1]);            
        }
        
        System.out.println("\nRecorrido con for-each:");
        for (int edad : edades) {
            System.out.println(edad);
        }
        
        
        int [][] matriz = {
            
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        for (int fila = 0; fila < matriz [fila].length; fila++){
            int sumaFila = 0;
            
            for (int columna = 0; columna < matriz[fila].length;columna ++ ){
                sumaFila += matriz[fila][columna];
            }
            System.out.println(" suma fila" + fila + ":" + sumaFila);   
        }
        
        for (int columna = 0 ; columna < matriz.length;columna ++){
            int sumaColumna = 0;
            
            for (int fila = 0; fila < matriz.length; fila++){
                sumaColumna += matriz[fila][columna];
            }
            System.out.println(" suma columna " + columna + " :" + sumaColumna);
        }
        int sumaDiagonal = 0 ;
        for (int i = 0; i< matriz.length; i++ ){
            sumaDiagonal += matriz[i][i];
        }
         System.out.println( " Suma Diagonal principal " + " :" + sumaDiagonal);
    }
}


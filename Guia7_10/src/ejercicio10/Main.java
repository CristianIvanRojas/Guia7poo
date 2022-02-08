
package ejercicio10;

import java.util.Arrays;

/**
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
public class Main {

  

    public static void main(String[] args) {
        
        double []arregloA = new double [50];
        double []arregloB = new double [20];
        
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (double) Math.round(((Math.random() * -21)+10) * 100) / 100;
        }
        System.out.println(Arrays.toString(arregloA));
        Arrays.sort(arregloA);
        
        System.out.println(Arrays.toString(arregloA));
        
        
        arregloB = Arrays.copyOfRange(arregloA, 0, 20);                     //copa los primeros 20 valores del array1 en el array 2
        System.out.println("Arreglo 2 combinado :");
        Arrays.fill(arregloB, 10, 20, 0.5);                               //llena el array1 con 0.5 con el rango definido
        System.out.println(Arrays.toString(arregloB));
    }
    
}

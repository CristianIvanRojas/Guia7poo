package Ejercicio8;

/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cadena cadena=new Cadena();
        char opc;
        String caracter;
        System.out.println("Ingrese cadena");
        cadena.setFrase(read.next());
        cadena.setLongitud(cadena.getFrase().length());
        do {
            System.out.println("-------------------------MENU-----------------------------");
            System.out.println("|  1-Mostrar Cantidad de vocales en la frase              |");
            System.out.println("|  2-Invertir la frase ingresada                          |");
            System.out.println("|  3-Cantidad de veces que se repite un caracter ingresado|");
            System.out.println("|  4-Comaprar longitud con otra cadena ingresada          |");
            System.out.println("|  5-Unir frase con otra ingresada por teclado            |");
            System.out.println("|  6-Reemplazar letra a con otro caracter ingresado       |");
            System.out.println("|  7-Encontrar caracter especifico dentro de la cadena    |");
            System.out.println("|  8-Salir                                                |");
            System.out.println("|---------------------------------------------------------|");
            opc=read.next().toLowerCase().charAt(0);
            
            switch(opc){
                case '1':
                    cadena.mostrarVocales();
                    break;
                case '2':
                    cadena.invertirFrase();
                    break;
                case '3':
                    System.out.println("Ingrese caracter a buscar");
                    caracter=read.next();
                    while(caracter.length()>1){
                        System.out.println("ERROR! ingrese un solo caracter");
                         caracter=read.next();
                    }
                    cadena.vecesRepetido(caracter);
                    break;
                case '4':
                    System.out.println("Ingrese cadena para comparar longitud");
                    cadena.compararLongitud(read.next());
                    break;
                case '5':
                    System.out.println("Ingrese cadena para unir");
                    cadena.unirFrase(read.next());
                    break;
                case '6':
                    System.out.println("Ingrese caracter para reemplazar por la a");
                     caracter=read.next();
                    while(caracter.length()>1){
                        System.out.println("ERROR! ingrese un solo caracter");
                         caracter=read.next();
                    }
                    cadena.reemplazarCaracter(caracter);
                    break;
                case '7':
                    System.out.println("Ingrese cracater a encontrar");
                     caracter=read.next();
                    while(caracter.length()>1){
                        System.out.println("ERROR! ingrese un solo caracter");
                         caracter=read.next();
                    }
                    boolean encontrado=cadena.contieneCaracter(caracter);
                    if (encontrado) {
                        System.out.println("El caracter se encuentra en la cadena");
                    }else{
                        System.out.println("EL caracter no se encuentra en la cadena");
                    }
                    break;
                case '8':
                    System.out.println("SALIENDO");
                    break;
                default:
                    System.out.println("Error! opcion incorrecta");
            }
            
        } while (opc!='8');
        
    }
    
}

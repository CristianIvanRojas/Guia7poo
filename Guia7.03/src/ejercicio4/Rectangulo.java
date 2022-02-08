
package ejercicio4;

import java.util.Locale;
import java.util.Scanner;


public class Rectangulo {
    private int base;
    private int altura;
    
    public Rectangulo(){
        
    }
    
    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner Entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese la base del rectangulo: ");
        //this.setBase(Entrada.nextInt());
        base=Entrada.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        altura=Entrada.nextInt();
    }
    
    public void perimetro(){
        System.out.printf("El perimetro del rectangulo es: %d\n" ,(base+altura)*2);
    }
    public void superficie(){
        System.out.printf("La superficie del rectangulo es : %d\n",(base*altura));
    }
    
    public void dibujarRectangulo(){
        for(int i=0; i<base;i++){
            for(int j=0; j<altura; j++){
                System.out.print("* ");
            }
           System.out.println(); 
        }
        
    }
}

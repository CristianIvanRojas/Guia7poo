
package ejercicio_6;


public class Cafetera {

    private int cantidadActual;
    private int capacidadMaxima;

    public Cafetera() {

    }

    public Cafetera(int cantidadActual, int capacidadMaxima) {
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadAtual() {
        return cantidadActual;
    }

    public void setCantidadAtual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;

    }

    public void servirTaza(int servir) {
        if (servir > this.cantidadActual) {
            servir = this.cantidadActual;
            System.out.println("La taza solo se lleno con " + servir + " cc");
            this.cantidadActual = 0;
        } else {
            this.cantidadActual -= servir;    //this.cantidadActual=this.cantidadActual-servir;
            System.out.println("La taza se lleno por completo con " + servir + " cc");
        }

    }

    public void vaciarCafetera() {
        System.out.println("Se vacio la cafetera");
        this.cantidadActual = 0;
    }

    public void agregarCafe(int cafe) {
        if (cafe + this.cantidadActual > this.capacidadMaxima) {

            System.out.printf("La cafetera se lleno por completo y sobro %d \n", (cafe + this.cantidadActual) - this.capacidadMaxima);
            this.cantidadActual = this.capacidadMaxima;
        } else {
            this.cantidadActual += cafe;
            System.out.println("Se agrego el cafe y hay " + this.cantidadActual + " cc");
        }

    }

    public void mostrarCantidadDeCafe() {
        System.out.println("la cantidad de cafe que hay es " + this.cantidadActual+ " cc");

    }

}

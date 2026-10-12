/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gabby
 */
public class Rectangulo extends FiguraGeometrica {

    private Punto vertice1;
    private Punto vertice2;

    public Rectangulo(Punto vertice1, Punto vertice2) {
        super("Rectángulo");
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
    }

    public Punto getVertice1() { return vertice1; }
    public Punto getVertice2() { return vertice2; }
public double calcularBase() {
        double base = vertice2.getX() - vertice1.getX();
        if (base < 0) {
            base = base * -1;
        }
        return base;
    }


    public double calcularAltura() {
        double altura = vertice2.getY() - vertice1.getY();
        if (altura < 0) {
            altura = altura * -1;
        }
        return altura;
    }
    
     @Override
    public double calcularArea() {
        return calcularBase() * calcularAltura();
    }

    public double calcularPerimetro() {
        return 2 * (calcularBase() + calcularAltura());
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Vértice 1: " + vertice1
                + " | Vértice 2: " + vertice2
                + " | Base: " + calcularBase()
                + " | Altura: " + calcularAltura();
    }
    @Override
    public void mover(double dx, double dy) {
        vertice1.setX(vertice1.getX() + dx);
        vertice1.setY(vertice1.getY() + dy);
        vertice2.setX(vertice2.getX() + dx);
        vertice2.setY(vertice2.getY() + dy);
    }


    public void escalar(double factor) {
        double nuevoX = vertice1.getX() + (vertice2.getX() - vertice1.getX()) * factor;
        double nuevoY = vertice1.getY() + (vertice2.getY() - vertice1.getY()) * factor;
        vertice2.setX(nuevoX);
        vertice2.setY(nuevoY);
    }
}

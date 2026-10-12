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

}

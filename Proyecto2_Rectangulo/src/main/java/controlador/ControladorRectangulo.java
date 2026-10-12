/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Punto;
import modelo.Rectangulo;

/**
 *
 * @author gabby
 */
public class ControladorRectangulo {
    
    private Rectangulo rectangulo;

    public ControladorRectangulo() {
        rectangulo = null;     // al inicio no hay rectángulo creado
    }

    public String crearRectangulo(double x1, double y1, double x2, double y2) {
        Punto vertice1 = new Punto(x1, y1);
        Punto vertice2 = new Punto(x2, y2);
        rectangulo = new Rectangulo(vertice1, vertice2);
        return "Rectángulo creado:\n" + rectangulo;
    }

    public String verDatos() {
        if (rectangulo == null) {
            return "Primero debe crear el rectángulo.";
        }
        return rectangulo + "\nÁrea: " + rectangulo.calcularArea()
                + "\nPerímetro: " + rectangulo.calcularPerimetro();
    }
    
 public String mover(double dx, double dy) {
        if (rectangulo == null) {
            return "Primero debe crear el rectángulo.";
        }
        rectangulo.mover(dx, dy);
        return "Rectángulo movido:\n" + rectangulo;
    }

    public String escalar() {
        if (rectangulo == null) {
            return "Primero debe crear el rectángulo.";
        }
        rectangulo.escalar();
        return "Rectángulo escalado al doble:\n" + rectangulo + "\nNueva área: " + rectangulo.calcularArea();
    }

    public String verificarPunto(double x, double y) {
        if (rectangulo == null) {
            return "Primero debe crear el rectángulo.";
        }
        Punto punto = new Punto(x, y);
        if (rectangulo.contienePunto(punto)) {
            return "El punto " + punto + " SÍ está dentro del rectángulo.";
        } else {
            return "El punto " + punto + " NO está dentro del rectángulo.";
        }
    }
}

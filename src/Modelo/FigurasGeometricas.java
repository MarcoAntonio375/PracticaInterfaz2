/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author CASA PC
 */
public abstract class FigurasGeometricas {
    private String nombre;
    private double area;
    private double perimetro;
    private final double PI=3.1416;
    
    //METODO CONSTRUCTOR

    public FigurasGeometricas() {
    }

    public FigurasGeometricas(String nombre, double area, double perimetro) {
        this.nombre = nombre;
        this.area = area;
        this.perimetro = perimetro;
    }
    
    //METODO ENCAPSULAMIENTO

    public String getNombre() {
        return nombre;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getPI() {
        return PI;
    }
    //METODOS IMPLEMENTADOS

    @Override
    public String toString() {
        return "DATOS DE LA FIGURA GEOMÉTRICA:\n"+
                "Nombre de la figura: "+getNombre()+"\n"+
                "Área: "+getArea()+"\n"+
                "Perímetro: "+getPerimetro();
 
    }
    //METODOS ABSTRACTOS 
    abstract double calcularArea();
    abstract double calcularPerimetro();
}

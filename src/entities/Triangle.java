package entities;

public class Triangle {
    public float ladoA;
    public float ladoB;
    public float ladoC;

    public Triangle() {
        // Contrutor de classe feita como em C# ASP.NET FRAMEWORK
    }

    public Triangle(float ladoA, float ladoB, float ladoC) {
        // Contrutor como sobrecarga
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double area(){
        double p = (ladoA + ladoB + ladoC) / 2.0;
        return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    }
}

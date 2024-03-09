package entities;

public class Product {
    public String nm;
    public float vl;
    public int qt;

    public Product(String nm, float vl, int qt) {
        this.nm = nm;
        this.vl = vl;
        this.qt = qt;
    }

    public Product() {

    }

    public float totalValueInStock() {
        return (vl * qt);
    }

    public void updateQtInStock(int qt) {
        this.qt += qt;
        System.out.println("Updated data: " + this);
    }

    public String toString() {
        return nm + ", $ " + String.format("%.2f", vl) + ", " + qt + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }

    /*
     * public void present(){
     * System.out.printf("%s, $%.2f, qt. %d, in stock $%.2f\n", nm, vl, qt,
     * totalValueInStock());
     * }
     */
}

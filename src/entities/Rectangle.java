package entities;

public class Rectangle {
    public float perimeter;
    public float diagonal;
    public float height;
    public float width;
    public float area;

    public Rectangle(float width, float height) {
        this.height = height;
        this.width = width;
        updateProperties();
    }

    public void setArea() {
        area = height * width;
    }

    public void setPerimeter() {
        perimeter = width * 2 + height * 2;
    }

    public void setDiagonal() {
        diagonal = (float) Math.sqrt((width * width + height * height));
    }

    private void updateProperties() {
        setArea();
        setPerimeter();
        setDiagonal();
    }
}

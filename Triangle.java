public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double calculateArea() {
        return (base*height)/2;

    }

    @Override
    public double calculateCircumference() {
        if ( base != height){
            double side = Math.sqrt(height * height + base * base / 4);
            return side;
        }else {
            return 3 * base;

        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}

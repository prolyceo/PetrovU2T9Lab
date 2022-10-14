public class RightTriangle {
    private double base;
    private double height;
    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double hypothenuse() {
        double c = Math.sqrt(Math.pow(base,2) + Math.pow(height,2));
        return c;
    }
}
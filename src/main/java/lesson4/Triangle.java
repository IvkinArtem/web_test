package lesson4;

public class Triangle {
    public double s;
    public double calculateSquare(int a, int b, int c) throws TriangleException {
        if ((a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a)) {
            throw new TriangleException("Это не треугольник!");
        }
        double p = (double) (a + b + c) / 2;
        s = Math.sqrt (p * (p - a) * (p - b) * (p - c));
        System.out.printf("%.1f", s);
        return s;
    }
}

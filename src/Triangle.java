public class Triangle {
    double a;
    double b;
    double c;

    void triangleAreaMethod () {
        double area = (a + b + c)/2;
        System.out.println("Area of the triangle is: " + Math.sqrt(
                area * (area - a) * (area - b) * (area - c)));
    }
}

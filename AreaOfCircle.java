public class AreaOfCircle {

    public static float circle(float red) {
        float area = 3.14f * red * red;
        return area;
    }

    public static void main(String[] args) {
        float red = 10;
        System.out.println(circle(red));
    }
}

public class Main {
    public static void main(String[] args) {
        Sc2D sc2D = new Sc2D(1.5f,3.5f);
        sc2D.setX(1.6f);
        System.out.println(sc2D.getX());
        sc2D.setY(3.6f);
        System.out.println(sc2D.getY());
        sc2D.setXY(5.5f,8.8f);
        float[] arr = sc2D.getXY();
        for (float a: arr
        ) {
            System.out.println(a + "\t");
        }
    }

}



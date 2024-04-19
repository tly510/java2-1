package chapter5;

/**
 * Ex5_01
 */



public class Ex5_01 {
    public static void main(String[] args) {
        Point p = new Point();
        p.set(x:1, y:2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(x:3, y:4);
        cp.setColor(color:"red");
        cp.showColorPoint();
    }
}
    class Point {
        private int x,y;
        public void set(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void showPoint() {
            System.out.println("(" + x + "," + y +")");
        }
}

 class ColorPoint extends Point {
    private String Color;
    public void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint() {
        System.out.println(color);
        showPoint();
    }
 }
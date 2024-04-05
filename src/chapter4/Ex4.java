import java.util.Scanner;

public class Ex4-02 {
    int width;
    int height;

    public int getArea() {
        return width*height;
    }

    public static void main(String[] args) {
        Rectangle rect = new Retangle(); //객체생성

        Scanner scanner = new Scanner(System.in);
        System.out.print(s:">>");
        rect.width = scanner.nextInt();
        rect.height = scanner.nextInt();
        System.out.println("사각형의 면적은" + rect.getArea());

        scanner.close();
    }
    
}

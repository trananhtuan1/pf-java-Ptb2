import java.util.Scanner;

public class Ptb2 {
    public static void main(String[] args) {

        System.out.println("ta có phương trình a*x*x + b*x+ c =0");

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("a =");
        a = scanner.nextDouble();
        System.out.println("b=");
        b = scanner.nextDouble();
        System.out.println("c=");
        c = scanner.nextDouble();


        if (a == 0) {
            if (b == 0) {
                System.out.println("phương trình vô nghiệm!");
            } else {
                double ketqua = -c / b;
                System.out.println("kết quả =" + ketqua);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {

                double nghiem1 = (-b - Math.sqrt(delta)) / 2 * a;
                double nghiem2 = (-b + Math.sqrt(delta)) / 2 * a;

                System.out.println("kết quả" + nghiem1 + '\t' + nghiem2);

            } else {
                if (delta < 0) {
                    System.out.println("phương trình vô nghiệm");
                } else {
                    double nghiem = -b / 2 * a;
                    System.out.println("phương trình có nghiệm duy nhất" + nghiem);
                }
            }
        }
    }
}




public class Greeting {

    public static void main(String[] args) {
        System.out.println("Hello World я ${username}");
        System.out.println("Площадь квадрата со стороной 2,5 равна "+ squareOfSquareVersion_1(2.5));
        squareOfSquareVersion_2(2.5);
        squareOfSquareVersion_3(2.5);
        circleArea(10);
        triangleArea(3,4,5);
        triangleArea(1,2,5);
    }

    //Создать метод который будет считать площадь квадрата с произвольными (установленными вами) сторонами:
    public static double squareOfSquareVersion_1(double a){
        double squareOfSquare = a*a;
        return squareOfSquare;
    }


    public static void squareOfSquareVersion_2(double a){
        double  squareOfSquare = a*a;
        System.out.println("Площадь квадрата со стороной "+ a +" равна " +  squareOfSquare);
    }

    public static void squareOfSquareVersion_3(double a){

        System.out.println("Площадь квадрата со стороной "+ a +" равна " + squareOfSquareVersion_1(a));
    }

    //Создать метод который будет считать площадь круга c произвольным радиусом:
    public static double circleArea(double r){
        double squareCircle = Math.PI * r * r;
        System.out.println("Площадь круга с радиусом " + r + " равна " + squareCircle);
        return squareCircle;
    }
    //Создать метод который будет считать площадь треугольника произвольными (установленными вами) сторонами
    public static void triangleArea(double a, double b, double c){
        if ((a + b > c) && (c + b > a) && (a + c > b)){
            double p = (a + b + c)/2;
            double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Площадь треугольника со сторонами " + a + " , " + b + " , " + c + " равна " + s);
        } else System.out.println("Некорректные входные данные");

    }
}

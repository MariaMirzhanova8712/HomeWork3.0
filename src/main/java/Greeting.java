public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello World я ${username}");
        System.out.println("Площадь квадрата со стороной 2,5 равна "+squareArea(2.5));
        square(2.5);
        square2(2.5);
        circleArea(10);
        triangleArea(3,4,5);
        triangleArea(1,2,5);
    }

    //Создать метод который будет считать площадь квадрата с произвольными (установленными вами) сторонами:
    public static double squareArea(double a){
        double plosadSquare = a*a;
        return plosadSquare;
    }

    public static void square(double a){
        double plosadSquare = a*a;
        System.out.println("Площадь квадрата со стороной "+ a +" равна " + plosadSquare);
    }

    public static void square2(double a){

        System.out.println("Площадь квадрата со стороной "+ a +" равна " + squareArea(a));
    }

    //Создать метод который будет считать площадь круга c произвольным радиусом:
    public static double circleArea(double r){
        double plosadCircle = Math.PI * r * r;
        System.out.println("Площадь круга с радиусом " + r + " равна " + plosadCircle);
        return plosadCircle;
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

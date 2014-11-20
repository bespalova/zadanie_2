import java.util.Scanner;

/**
 * Created by Yuliya on 19.11.2014.
 */
/*Решение квадратного уравнения.
Для уравнения ax2+bx+c=0 вывести либо 2 корня, либо 1,
либо сообщение об отсутствии вещественных корней.
 */

public class VetvlenieIF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Для решения уравнения ax2+bx+c=0 вам необходимо ввести " +
                "числа а, b и с. Введите а: ");
        int a = in.nextInt();
        System.out.println("Введите b: ");
        int b = in.nextInt();
        System.out.println("Введите c: ");
        int c = in.nextInt();

    int d=0;
    d=(b*b)-4*a*c;

    if (d>0) {
        double x1=(-b)-Math.sqrt(d)/2*a;
        double x2=(-b)+Math.sqrt(d)/2*a;
        System.out.println("С данными значениями у уравнения есть 2 корня:" + x1 + " и " + x2);
    }
    else if(d==0) {
        double x3=(-b)/2*a;
        System.out.println("С данными значениями у уравнения есть лишь 1 корень:" + x3);
    }

    else {
    System.out.println("С данными значениями у уравнения нет действительных корней");}
    }
}

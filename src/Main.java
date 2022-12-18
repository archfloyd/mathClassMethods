import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
double x;
double y;
double z;

System.out.println("enter side x:");
x=scanner.nextDouble();

System.out.println("enter side y:");
y=scanner.nextDouble();

z = Math.sqrt((x*x)+(y*y));
System.out.println("hypotenus =" +z);

scanner.close();





    }
}
import java.util.Scanner;
public class mainTriangulo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un valor para el lado 1 del Triangulo: ");
    float lado1=sc.nextFloat();
    System.out.println("Introduce un valor para el lado 2 del Triangulo: ");
    float lado2=sc.nextFloat();
    System.out.println("Introduce un valor para la base del Triangulo: ");
    float base=sc.nextFloat();
    System.out.println("Introduce un valor para la altura del Triangulo: ");
    float altura=sc.nextFloat();
    System.out.println("Proporciona un color para el Triangulo: ");
    String color=sc.next();
    Triangulo c1 = new Triangulo();
    c1.setcolor(color);
    c1.setlado1((float)lado1);
    c1.setlado2((float)lado2);
    c1.setbase((float)base);
    c1.setaltura((float)altura);

    System.out.println("El color del triangulo es: " + c1.getcolor());
    System.out.println("El lado 1 del triangulo es: " + c1.getlado1());
    System.out.println("El lado 2 del triangulo es: " + c1.getlado2());
    System.out.println("La base del triangulo es: " + c1.getbase());
    System.out.println("La altura del triangulo es: " + c1.getaltura());
    System.out.println("El perimetro es: "+ c1.getperimetro());
    System.out.println("El area es: " + c1.getarea());

}

}
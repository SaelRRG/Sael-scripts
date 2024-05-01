import java.util.Scanner;
public class mainHexagono {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un valor para los lados del Hexagono: ");
    float lado=sc.nextFloat();
    System.out.println("Introduce un valor para apotema del Hexagono: ");
    float apotema=sc.nextFloat();
    System.out.println("Proporciona un color para el Hexagono: ");
    String color=sc.next();
    Hexagono c1 = new Hexagono();
    c1.setcolor(color);
    c1.setlado((float)lado);
    c1.setapotema((float)apotema);

    System.out.println("El color del Hexagono es: " + c1.getcolor());
    System.out.println("El lado del Hexagono es: " + c1.getlado());
    System.out.println("El apotema es: " + c1.getapotema());
    System.out.println("El perimetro es: "+ c1.getperimetro());
    System.out.println("El area es: " + c1.getarea());

}

}


import java.util.Scanner;
public class mainRombo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un valor para el lado del Rombo: ");
    float lado=sc.nextFloat();
    System.out.println("Introduce un valor para la diagonal mayor del rombo: ");
    float diagonalM=sc.nextFloat();
    System.out.println("Introduce un valor para la diagonal menor del rombo: ");
    float diagonalm=sc.nextFloat();
    System.out.println("Proporciona un color para el Rombo: ");
    String color=sc.next();
    Rombo c1 = new Rombo();
    c1.setcolor(color);
    c1.setlado((float)lado);
    c1.setdiagonalM((float)diagonalM);
    c1.setdiagonalm((float)diagonalm);

    System.out.println("El color del Rombo es: " + c1.getcolor());
    System.out.println("El lado del Rombo es: " + c1.getlado());
    System.out.println("La diagonal mayor es: " + c1.getdiagonalM());
    System.out.println("La diagonal menor es: " + c1.getdiagonalm());
    System.out.println("El perimetro es: "+ c1.getperimetro());
    System.out.println("El area es: " + c1.getarea());

}

}

import java.util.Scanner;
public class mainTrapecio {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un valor para los lado 1 del Trapecio: ");
    float lado1=sc.nextFloat();
    System.out.println("Introduce un valor para los lado 2 del Trapecio: ");
    float lado2=sc.nextFloat();
    System.out.println("Introduce un valor para la base mayor del Trapecio: ");
    float base_mayor=sc.nextFloat();
    System.out.println("Introduce un valor para la base menor del Trapecio: ");
    float base_menor=sc.nextFloat();
    System.out.println("Introduce un valor para la altura del Trapecio: ");
    float altura=sc.nextFloat();
    System.out.println("Proporciona un color para el Trapecio: ");
    String color=sc.next();
    Trapecio c1 = new Trapecio();
    c1.setcolor(color);
    c1.setlado1((float)lado1);
    c1.setlado2((float)lado2);
    c1.setaltura((float)altura);
    c1.setbase_mayor((float)base_mayor);
    c1.setbase_menor((float)base_menor);

    System.out.println("El color del Trapecio es: " + c1.getcolor());
    System.out.println("El lado 1 del Trapecio es: " + c1.getlado1());
    System.out.println("El lado 2 del Trapecio es: " + c1.getlado2());
    System.out.println("La altura del Trapecio es: " + c1.getaltura());
    System.out.println("La base mayor del Trapecio es: " + c1.getbase_mayor());
    System.out.println("La base menor del Trapecio es: " + c1.getbase_menor());
    System.out.println("El perimetro es: "+ c1.getperimetro());
    System.out.println("El area es: " + c1.getarea());

}

}
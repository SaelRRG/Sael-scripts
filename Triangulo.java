
public class Triangulo{
    private String color;
    private float lado1;
    private float lado2;
    private float base;
    private float altura;
    
    //Constructor//
    public Triangulo(){
    }
    //Metodos Get y Set//

    public String getcolor(){
        return color;
    }

    public float getlado1(){
        return lado1;
    }

    public float getlado2(){
        return lado2;
    }

    public float getbase(){
        return base;
    }

    public float getaltura(){
        return altura;
    }
    
    public void setcolor(String color){
        this.color = color;
    }

    public void setlado1(float lado1){
        this.lado1 = lado1;
    }

    public void setlado2(float lado2){
        this.lado2 = lado2;
    }

    public void setbase(float base){
        this.base = base;
    }

    public void setaltura(float altura){
        this.altura = altura;
    }

    public float getperimetro(){
        return perimetro(lado1,lado2,base);
    }

    public float getarea(){
        return area(base,altura);
    }

    //Metodos par aobtener el Area y Perimetro//

    private float perimetro(float lado1, float lado2, float base){
        return (lado1+lado2+base);
    }

    private float area(float base, float altura){
        return (altura*base) / 2;
    }


}



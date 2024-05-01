public class Trapecio {
    private String color;
    private float base_menor;
    private float base_mayor;
    private float lado1;
    private float lado2;
    private float altura;
    
    //Constructor//
    public Trapecio(){
    }
    //Metodos Get y Set//

    public String getcolor(){
        return color;
    }

    public float getbase_menor(){
        return base_menor;
    }

    public float getbase_mayor(){
        return base_mayor;
    }
    public float getlado1(){
        return lado1;
    }

    public float getlado2(){
        return lado2;
    }

    public float getaltura(){
        return altura;
    }

    public void setcolor(String color){
        this.color = color;
    }

    public void setbase_menor(float base_menor){
        this.base_menor = base_menor;
    }

    public void setbase_mayor(float base_mayor){
        this.base_mayor = base_mayor;
    }

    public void setlado1(float lado1){
        this.lado1 = lado1;
    }

    public void setlado2(float lado2){
        this.lado2 = lado2;
    }

    public void setaltura(float altura){
        this.altura = altura;
    }

    public float getperimetro(){
        return perimetro(lado1, lado2, base_mayor, base_menor);
    }

    public float getarea(){
        return area(base_mayor, base_menor, altura);
    }

    //Metodos par aobtener el Area y Perimetro//

    private float perimetro(float lado1, float lado2, float base_mayor, float base_menor){
        return (lado1 + lado2 + base_mayor + base_menor);
    }

    private float area(float base_mayor, float base_menor, float altura){
        return ((base_mayor+base_menor)*altura)/ 2;
    }
    
}

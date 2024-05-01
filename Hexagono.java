public class Hexagono {
    private String color;
    private float lado;
    private float apotema;
    
    //Constructor//
    public Hexagono(){
    }
    //Metodos Get y Set//

    public String getcolor(){
        return color;
    }

    public float getlado(){
        return lado;
    }

    public float getapotema(){
        return apotema;
    }
    
    public void setcolor(String color){
        this.color = color;
    }

    public void setlado(float lado){
        this.lado = lado;
    }

    public void setapotema(float apotema){
        this.apotema = apotema;
    }

    public float getperimetro(){
        return perimetro(lado);
    }

    public float getarea(){
        return area(lado, apotema);
    }

    //Metodos par aobtener el Area y Perimetro//

    private float perimetro(float lado){
        return (6*lado);
    }

    private float area(float lado, float apotema){
        return (apotema*4*lado)/ 2;
    }
    
}

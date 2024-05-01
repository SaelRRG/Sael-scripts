public class Rombo{
    private String color;
    private float lado;
    private float diagonalM;
    private float diagonalm;
    
    //Constructor//
    public Rombo(){
    }
    //Metodos Get y Set//

    public String getcolor(){
        return color;
    }

    public float getlado(){
        return lado;
    }

    public float getdiagonalM(){
        return diagonalM;
    }

    public float getdiagonalm(){
        return diagonalm;
    }

    
    public void setcolor(String color){
        this.color = color;
    }

    public void setlado(float lado){
        this.lado = lado;
    }

    public void setdiagonalM(float diagonalM){
        this.diagonalM = diagonalM;
    }

    public void setdiagonalm(float diagonalm){
        this.diagonalm = diagonalm;
    }

    public float getperimetro(){
        return perimetro(lado);
    }

    public float getarea(){
        return area(diagonalM,diagonalm);
    }

    //Metodos par aobtener el Area y Perimetro//

    private float perimetro(float lado){
        return (4*lado);
    }

    private float area(float diagonalM, float diagonalm){
        return (diagonalM*diagonalm) / 2;
    }


}

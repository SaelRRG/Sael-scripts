//Romero Galicia Sael Raul

public class Persona {
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private int edad;
    private String email;
    private float peso;
    private float altura;

    public Persona() {}


    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setApellidoP(String apellidoP) {
        this.ApellidoP = apellidoP;
    }

    public void setApellidoM(String apellidoM) {
        this.ApellidoM = apellidoM;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getApellidoP() {
        return this.ApellidoP;
    }

    public String getApellidoM() {
        return this.ApellidoM;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getEmail() {
        return this.email;
    }

    public float getPeso() {
        return this.peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public static void main(String[] args) {
        Persona P1 = new Persona();
        P1.setNombre("Mario");
        P1.setApellidoP("Martinez");
        P1.setApellidoM("Luna");
        P1.setEdad(28);
        P1.setEmail("luna@gmail");
        P1.setPeso(76.2f); 
        P1.setAltura(1.77f);

        System.out.println("Nombre: " + P1.getNombre());
        System.out.println("ApellidoP.: " + P1.getApellidoP());
        System.out.println("ApellidoM.: " + P1.getApellidoM());
        System.out.println("Edad: " + P1.getEdad());
        System.out.println("Email: " + P1.getEmail());
        System.out.println("Peso: " + P1.getPeso());
        System.out.println("Altura: " + P1.getAltura());
    }
}

package practica3;

public class Persona {

    public String Modelo;
    public String Marca;
    public String Año;

    public Coche(String Modelo, String Marca, String Año) {
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Año = Año;
    }

    public void Mostrar() {
        System.out.println("==============================");
        System.out.println("Modelo: " + this.Modelo);
        System.out.println("Marca: " + this.Marca);
        System.out.println("Año: " + this.Año);
        System.out.println("==============================");
    }
}
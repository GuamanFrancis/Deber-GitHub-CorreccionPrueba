// crear una clase llamada hotel
public class Hotel {
    String Nombre;
    String Direccion;
    int numerodepisos;
    double preciohabitacion;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getNumerodepisos() {
        return numerodepisos;
    }

    public void setNumerodepisos(int numerodepisos) {
        this.numerodepisos = numerodepisos;
    }

    public double getPreciohabitacion() {
        return preciohabitacion;
    }

    public void setPreciohabitacion(double preciohabitacion) {
        this.preciohabitacion = preciohabitacion;
    }

    public Hotel(String Nombre, String Direccion, int numerodepisos, double preciohabitacion){
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.numerodepisos = numerodepisos;
        this.preciohabitacion = preciohabitacion;

    }


    public void Modificar(String nuevonombre,String nuevaDir, int nuevoNpisos,double nuevoprecio){

        System.out.println(" Datos anteriores \n");
        imprimir();
        System.out.println(" ---------------------------------------\n");
        this.Nombre = nuevonombre;
        this.Direccion = nuevaDir;
        this.numerodepisos = nuevoNpisos;
        this.preciohabitacion = nuevoprecio;
        System.out.println(" Datos modificados exitosamente \n");
        System.out.println(" Datos nuevos \n");

    }

    public void imprimir(){

        System.out.println("Datos. \n");
        System.out.println("Nombre: "+Nombre+"\n");
        System.out.println("Direccion: "+Direccion+"\n");
        System.out.println("Numero de pisos: "+numerodepisos+"\n");
        System.out.println(" Precio de habitacion: "+preciohabitacion+"\n");
        System.out.println("Gracias por usar el sistema \n");

    }

    public void Modificarvaloresnull(){




    }




}
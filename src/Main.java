
//Utilizando los principios de programación orientada a objetos, implementar un sistema que me permita registrar hoteles de una ciudad.

//
public class Main {
    public static void main(String[] args) {

        Hotel hotel1 = new Hotel("Hotel Quito","AV 123",15,200);
        Hotel hotel2 = new Hotel("Hotel Colon ","AV 6 de dicicembre",20,100);
        Hotel hotel3 = new Hotel("Hotel Rocafuerte","AV 19 de agosto",10,150);
        Hotel hotel4 = new Hotel("Hotel Virtud","AV Gnrl Gutierrez",25,250);
        Hotel hotel5 = new Hotel("Hotel Sanluis","AV Inca",10,50);
        Hotel hotel6 = new Hotel("","",0,0);
        Hotel hotel7 = new Hotel("","",0,0);

        hotel6.imprimir();

        hotel6.setNombre("Hotel Guayaquil");
        hotel6.setDireccion("AV Simon B");
        hotel6.setNumerodepisos(10);
        hotel6.setPreciohabitacion(150.00);
        hotel7.setNombre("Hotel California");
        hotel7.setDireccion("AV caracas");
        hotel7.setNumerodepisos(20);
        hotel7.setPreciohabitacion(155);
        hotel6.imprimir();        hotel3.Modificar("sdfdsf","sdfsdfsd",47564,45646545);
        hotel3.imprimir();













    }
}
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Constructor vacio
        Animal a1 = new Animal();
        a1.setNombre("LULU");
        a1.setEspecie("MAMIFERO");
        a1.setTamano(2.8);
        a1.setGeneros("FEMENINO");
        System.out.println(a1.toString());
        System.out.println(a1.calcularTamano(a1.getTamano()));


        Animal a2 = new Animal("THOMAS", "CANINO", 1.3, "MASCULINO");
        System.out.println(a2.toString());
        System.out.println(a2.calcularTamano(a2.getTamano()));



        Animal a3 = new Animal("KOKO", "Masculino");
        System.out.println(a3.toString());
        System.out.println(a3.calcularTamano(a3.getTamano()));
    }
}
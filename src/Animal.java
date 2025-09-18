public class Animal {
    //Atributos de la clase

    private String nombre;
    private String especie;
    private double tamano;
    private String generos;

    //constructor vacio
    public Animal() {
    }


    //Constructor de todos los parametros
    public Animal(String nombre, String especie, double tamano, String generos) {
        this.nombre = nombre;
        this.especie = especie;
        this.tamano = tamano;
        this.generos = generos;
    }

    public Animal(String nombre, String generos) {
        this.nombre = nombre;
        this.generos = generos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", tamano=" + tamano +
                ", generos='" + generos + '\'' +
                '}';
    }
    //METODOS PROPIOS

    public String calcularTamano(double t){
        if(t>5){
            return "Animal Grande";
        }else if(t<=5 && t>3){
            return "Animal Pequeño";
        }else if(t<3){
            return "Pequeño";
        }
        return null;
    }
}

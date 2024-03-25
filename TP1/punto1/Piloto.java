package T1;

public class Piloto extends Persona implements Volador{
    private int rango;

    public Piloto(int edad, String nombre, int rango) {
        super(edad, nombre);
        this.rango = rango;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }
    @Override
    public void volar(){
        System.out.println(this.nombre + " esta pilotando ");
    }

}

package T1;

public class Reserva {
    private int numAsiento;
    private Vuelo vuelo;

    public Reserva(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public void agregarVuelo(Vuelo vuelo1){
        this.vuelo = vuelo1;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
}

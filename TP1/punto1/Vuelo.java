package T1;

public class Vuelo {
    private int numVuelo;
    private int capacidad;
    private Reserva reserva;

    public Vuelo(int numVuelo, int capacidad) {
        this.numVuelo = numVuelo;
        this.capacidad = capacidad;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void agregarReserva(Reserva reserva1){
        if (this.capacidad < 0){
            this.reserva = reserva1;
        }
    }
}

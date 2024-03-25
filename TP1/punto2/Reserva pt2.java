public class Reserva {

    public Vuelo getVuelo;
    private String numeroReserva;
    private Pasajero pasajero;
    private Vuelo vuelo;
    private String estado;
    public Reserva(Pasajero pasajero,Vuelo vuelo){

        this.numeroReserva=generarNumeroReserva();
        this.pasajero=pasajero;
        this.vuelo=vuelo;
        this.estado= "Esperando";

    }
    public void confirmarReserva(){

        this.estado = "Confirmado";
        System.out.println("Reserva confirmada para el vuelo " + vuelo.getNumeroVuelo());

    }

    public void cambiarEstado(String nuevoEstado){

        this.estado = nuevoEstado;
        System.out.println("Estado de la reserva cambiado a " + nuevoEstado);

    }

    private String generarNumeroReserva() {
        return "RES" + Math.random() * 1000;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }


}

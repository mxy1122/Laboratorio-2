//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pasajero pasajero = new Pasajero("Juan", "Perez", 30);
        Vuelo vuelo = new Vuelo("AV123");

        pasajero.reservarVuelo(vuelo);

        Reserva reserva = pasajero.getReservas().get(0);
        reserva.confirmarReserva();
        reserva.cambiarEstado("Cancelada");


    }
}
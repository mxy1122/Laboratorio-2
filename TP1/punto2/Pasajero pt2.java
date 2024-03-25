import java.util.ArrayList;

public class Pasajero {

   private String nombre;
   private String apellido;
   private int edad;
   private ArrayList<Reserva> reservas;

    public Pasajero(String nombre,String apellido,int edad){

        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.reservas= new ArrayList<>();

    }
    public void reservarVuelo(Vuelo vuelo){

        Reserva reserva = new Reserva(this, vuelo);
        reservas.add(reserva);
        System.out.println("Reserva realizada con exito"+vuelo.getNumeroVuelo());

    }

    public void cancelarReserva(Reserva reserva){

        reservas.remove(reserva);
        System.out.println("Reserva cancelada con exito"+reserva.getVuelo.getNumeroVuelo());

    }
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }


}

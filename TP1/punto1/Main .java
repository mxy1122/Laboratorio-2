package T1;

public class Main {
    public static void main(String[] args) {
            Piloto p1 = new Piloto(33,"Raul",15);
            avion a1 = new avion("ZY12OAO","Japon");
            Flota f1 = new Flota("Chile");
            Vuelo v1 = new Vuelo(62, 80);
            Reserva r1 = new Reserva(20);


        a1.setVuelo(v1);
        System.out.println(a1.getPatente() + " tiene asignado el vuelo " + a1.getVuelo().getNumVuelo());
        r1.agregarVuelo(v1);
        System.out.println("la reserva " + r1 + "tiene el vuelo " + r1.getVuelo());
        p1.volar();

    }


}

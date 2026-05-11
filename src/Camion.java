public class Camion extends Vehiculo {

    private double tonelaje;

    public Camion(int numeroRuedas, String marca, double torque, double tonelaje) {
        super("Diesel", numeroRuedas, marca, 2,
                3, torque, "Camion");
        this.tonelaje = tonelaje;
    }


    @Override
    public double calcularAceleracion() {
        double aceleracion = getTorque() / tonelaje;
        setAceleracion(aceleracion);
        return getAceleracion();
    }

    @Override
    public double consumoCombustible(double recorrido) {
        double consumo = recorrido / tonelaje * 2;
        setConsumoCombustilble(consumo);
        return getConsumoCombustilble();
    }
}

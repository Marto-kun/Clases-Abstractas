public class Moto extends Vehiculo {


    private double cilindraje;

    public Moto(String marca, int numeroPasajeros, double torque, double cilindraje) {
        super("Gasolina", 2, marca, 0, numeroPasajeros, torque);
        this.cilindraje = cilindraje;
    }


    @Override
    public double calcularAceleracion() {
        double aceleracion = getTorque() / cilindraje * 4;
        setAceleracion(aceleracion);
        return getAceleracion();
    }

    @Override
    public double consumoCombustible(double recorrido) {
        double consumo = getTorque() / cilindraje;
        setConsumoCombustilble(consumo);
        return getConsumoCombustilble();
    }
}

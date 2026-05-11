public class Automovil extends Vehiculo {

    private String color;
    public double cilindraje;
    private double rendimiento;
    private double recorrido;

    public Automovil(int numeroRuedas, String marca, int numeroPuertas,
                     String color, double torque, double rendimiento) {

        super("Gasolina", numeroRuedas, marca, numeroPuertas, 5, torque);
        this.color = color;
        this.rendimiento = rendimiento;
    }

    @Override
    public double calcularAceleracion() {
        double aceleracion = getTorque() / cilindraje * 2;
        setAceleracion(aceleracion);
        return getAceleracion();
    }

    @Override
    public double consumoCombustible(double recorrido) {
        double consumo = rendimiento * recorrido;
        setConsumoCombustilble(consumo);
        return getConsumoCombustilble();
    }


}

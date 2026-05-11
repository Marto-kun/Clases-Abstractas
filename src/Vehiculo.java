public abstract class Vehiculo {

    private String tipoCombustible;
    private int numeroRuedas;
    private String marca;
    private int numeroPuertas;
    private int numeroPasajeros;
    private double torque;
    private double aceleracion;
    private double consumoCombustilble;
    private String tipoVehiculo;

    public Vehiculo(String tipoCombustible,
                    int numeroRuedas,
                    String marca,
                    int numeroPuertas,
                    int numeroPasajeros,
                    double torque, String tipoVehiculo) {

        this.tipoCombustible = tipoCombustible;
        this.numeroRuedas = numeroRuedas;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.numeroPasajeros = numeroPasajeros;
        this.torque = torque;
        this.tipoVehiculo = tipoVehiculo;
    }

    public Vehiculo() {
    }

    public abstract double calcularAceleracion();

    public abstract double consumoCombustible(double recorrido);


    @Override
    public String toString() {
        return "Tipo de Vehiculo: " + tipoVehiculo +
                " Marca: " + marca +
                " Aceleracion: " + aceleracion +
                " Consumo: " + consumoCombustilble + "\n";
    }


    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public double getConsumoCombustilble() {
        return consumoCombustilble;
    }

    public void setConsumoCombustilble(double consumoCombustilble) {
        this.consumoCombustilble = consumoCombustilble;
    }
}

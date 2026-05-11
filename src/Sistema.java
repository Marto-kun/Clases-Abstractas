import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    private List<Vehiculo> vehiculos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public Sistema(Scanner sc) {
        this.sc = sc;
    }

    public int menu() {
        System.out.println("Ingrese una opcion: ");
        System.out.println("1. Crear Vehiculo");
        System.out.println("2. Calcular Aceleracion");
        System.out.println("3. Calcular Consumo de Combustible");
        System.out.println("4. Salir");
        System.out.print(">>> ");
        int opc = sc.nextInt();
        return opc;
    }

    public int tipoVehiculo() {
        System.out.println("Ingrese que tipo de vehiculo desea ingresar: ");
        System.out.println("1. Automovil\n 2. Camion\n 3. Moto");
        int opc = sc.nextInt();
        return opc;
    }

    public void crearVehiculo() {
        int opc = tipoVehiculo();
        switch (opc) {
            case 1:
                System.out.print("Ingrese la marca: ");
                String marcaAuto = sc.nextLine();

                System.out.print("Ingrese el numero de ruedas: ");
                int ruedasAuto = sc.nextInt();

                System.out.print("Ingrese el numero de puertas: ");
                int puertasAuto = sc.nextInt();

                System.out.print("Ingrese el color del auto: ");
                String colorAuto = sc.nextLine();

                System.out.print("Ingrese el torque del motor: ");
                double torqueAuto = sc.nextDouble();

                System.out.print("Ingrese el rendimiento del motor: ");
                double rendimientoAuto = sc.nextDouble();

                Automovil auto = new Automovil(ruedasAuto, marcaAuto, puertasAuto,
                        colorAuto, torqueAuto, rendimientoAuto);

                vehiculos.add(auto);
                break;

            case 2:
                System.out.print("Ingrese la marca: ");
                String marcaCamion = sc.nextLine();

                System.out.print("Ingrese el numero de ruedas: ");
                int ruedasCamion = sc.nextInt();

                System.out.print("Ingrese el torque del motor: ");
                double torqueCamion = sc.nextDouble();

                System.out.print("Ingrese el tonelaje del camion: ");
                double tonelaje = sc.nextDouble();

                Camion camion = new Camion(ruedasCamion, marcaCamion, torqueCamion, tonelaje);

                vehiculos.add(camion);
                break;

            case 3:
                System.out.print("Ingrese la marca: ");
                String marcaMoto = sc.nextLine();

                System.out.print("Ingrese el numero de pasajeros: ");
                int pasajeros = sc.nextInt();

                System.out.print("Ingrese el torque del motor: ");
                double torqueMoto = sc.nextDouble();

                System.out.println("Ingrese el cilindraje del motor: ");
                double cilindraje = sc.nextDouble();

                Moto moto = new Moto(marcaMoto, pasajeros, torqueMoto, cilindraje);

                vehiculos.add(moto);
                break;

            default:
                System.out.println("Opcion invalida. Intentelo de nuevo.");
        }
    }

    public void calcularAceleracion() {
        int i = 0;
        System.out.println("Seleccione el vehiculo: ");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(i + 1 + ". " + vehiculo.toString() + "\n");
            i++;
        }
        System.out.print(">>> ");
        int indice = sc.nextInt();
        int opc = indice - 1;
        System.out.println("La aceleracion es: " + vehiculos.get(opc).calcularAceleracion());

    }

    public void calcularConsumo() {
        int i = 0;
        System.out.println("Seleccione el vehiculo: ");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(i + 1 + ". " + vehiculo.toString() + "\n");
            i++;
        }
        System.out.print(">>> ");
        int indice = sc.nextInt();
        int opc = indice - 1;

        System.out.println("Ingrese el recorrido del vehiculo en km: ");
        double recorrido = sc.nextDouble();
        System.out.println("El consumo de combustible es: "
                + vehiculos.get(opc).consumoCombustible(recorrido));

    }

}

package view.console;

import java.util.ArrayList;
import java.util.Scanner;
import model.Vehiculo;
import model.Coche;
import model.Moto;
import model.bus;
import model.ColorEnum;
import model.MarchasEnum;

public class Main {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ DE VEHÍCULOS ---");
            System.out.println("1. Crear Coche");
            System.out.println("2. Crear Moto");
            System.out.println("3. Crear Bus");
            System.out.println("4. Mostrar todas las matrículas");
            System.out.println("5. Buscar vehículo por matrícula");
            System.out.println("6. Mostrar total de vehículos creados");
            System.out.println("7. Mostrar total de coches creados");
            System.out.println("8. Mostrar total de motos creadas");
            System.out.println("9. Mostrar total de buses creados");
            System.out.println("10. Eliminar vehículo por matrícula");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = input.nextInt();
            input.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    listaVehiculos.add(crearCoche());
                    System.out.println("Coche creado con éxito.");
                    break;
                case 2:
                    listaVehiculos.add(crearMoto());
                    System.out.println("Moto creada con éxito.");
                    break;
                case 3:
                    listaVehiculos.add(crearBus());
                    System.out.println("Bus creado con éxito.");
                    break;
                case 4:
                    mostrarMatriculas();
                    break;
                case 5:
                    buscarPorMatricula();
                    break;
                case 6:
                    System.out.println("Total de vehículos creados: " + listaVehiculos.size());
                    break;
                case 7:
                    contarVehiculosPorTipo(Coche.class);
                    break;
                case 8:
                    contarVehiculosPorTipo(Moto.class);
                    break;
                case 9:
                    contarVehiculosPorTipo(bus.class);
                    break;
                case 10:
                    eliminarPorMatricula();
                    break;
                case 11:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 11);
    }

    private static Coche crearCoche() {
        System.out.print("Ingrese la matrícula: ");
        String matricula = input.nextLine();
        System.out.print("Ingrese la marca: ");
        String marca = input.nextLine();
        return new Coche(marca, matricula, "ModeloX", 150.0, ColorEnum.AZUL, "MotorX", "TipoRuedaX", "2020", MarchasEnum.MANUAL, 0, "3", 4);
    }

    private static Moto crearMoto() {
        System.out.print("Ingrese la matrícula: ");
        String matricula = input.nextLine();
        System.out.print("Ingrese la marca: ");
        String marca = input.nextLine();
        return new Moto(marca, matricula, "ModeloY", 100.0, ColorEnum.ROJO, "MotorY", "TipoRuedaY", "2021", MarchasEnum.AUTIMATICA, 0, "2", true);
    }

    private static bus crearBus() {
        System.out.print("Ingrese la matrícula: ");
        String matricula = input.nextLine();
        System.out.print("Ingrese la marca: ");
        String marca = input.nextLine();
        System.out.print("Ingrese la capacidad de pasajeros: ");
        int capacidad = input.nextInt();
        input.nextLine();
        return new bus(marca, matricula, "ModeloZ", 200.0, ColorEnum.VERDE, "MotorZ", "TipoRuedaZ", "2018", MarchasEnum.MANUAL, 0, "5", capacidad, "Urbano");
    }

    private static void mostrarMatriculas() {
        System.out.println("Matrículas registradas:");
        for (Vehiculo v : listaVehiculos) {
            System.out.println(v.getMatricula());
        }
    }

    private static void buscarPorMatricula() {
        System.out.print("Ingrese la matrícula del vehículo a buscar: ");
        String matricula = input.nextLine();
        for (Vehiculo v : listaVehiculos) {
            if (v.getMatricula().equals(matricula)) {
                System.out.println(v);
                return;
            }
        }
        System.out.println("Vehículo no encontrado.");
    }

    private static void contarVehiculosPorTipo(Class<?> tipo) {
        int contador = 0;
        for (Vehiculo v : listaVehiculos) {
            if (tipo.isInstance(v)) {
                contador++;
            }
        }
        System.out.println("Total de " + tipo.getSimpleName() + "s: " + contador);
    }

    private static void eliminarPorMatricula() {
        System.out.print("Ingrese la matrícula a eliminar: ");
        String matricula = input.nextLine();
        listaVehiculos.removeIf(v -> v.getMatricula().equals(matricula));
        System.out.println("Vehículo eliminado si existía.");
    }
}

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        String nombreDelCliente = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldoDisponible = 1599.99;

        System.out.println("******************************************************");
        System.out.println("\nNombre del cliente: "+nombreDelCliente+ "\nTipo de cuenta: "+tipoDeCuenta+ "\nSaldo disponible: $"+saldoDisponible);
        System.out.println("\n******************************************************");

        String menu = """ 
                ** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                4 - Salir
                """;

        while (opcion != 4) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actual es: $" + saldoDisponible);
                    break;
                case 2:
                    System.out.print("¿Cuánto deseas retirar? $");
                    double retiro = teclado.nextDouble();
                    if (retiro > saldoDisponible) {
                        System.out.println("Saldo insuficiente.");
                    } else if (retiro <= 0) {
                        System.out.println("El valor debe ser mayor que 0.");
                    } else {
                        saldoDisponible -= retiro;
                        System.out.println("Retiro exitoso. Saldo restante: $" + saldoDisponible);
                    }
                    break;
                case 3:
                    System.out.print("¿Cuánto deseas depositar? $");
                    double deposito = teclado.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("El valor debe ser mayor que 0.");
                    } else {
                        saldoDisponible += deposito;
                        System.out.println("Depósito exitoso. Saldo actualizado: $" + saldoDisponible);
                    }
                    break;
                case 4:
                    System.out.println("Finalizando el programa. ¡Gracias por usar nuestros servicios, Tony!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
            }
        }
        teclado.close();
    }
}

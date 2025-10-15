package ejerciciossss;

public class Ejerciciossss {
    public static void main(String[] args) {
        double salarioBase = 2000000.0;
        double porcentajeSaludMagica = 0.04;
        double porcentajeProteccionPension = 0.04;

        double descuentoSaludMagica = salarioBase * porcentajeSaludMagica;
        double descuentoProteccionPension = salarioBase * porcentajeProteccionPension;

        double totalDescuentos = descuentoSaludMagica + descuentoProteccionPension;
        double salarioNeto = salarioBase - totalDescuentos;

        System.out.println("===== Salario del Héroe =====");
        System.out.println("Salario base: " + salarioBase + " monedas de oro");
        System.out.println("Descuento por Salud Mágica (4%): " + descuentoSaludMagica + " monedas de oro");
        System.out.println("Descuento por Protección de Pensión (4%): " + descuentoProteccionPension + " monedas de oro");
        System.out.println("Total descuentos: " + totalDescuentos + " monedas de oro");
        System.out.println("Salario neto: " + salarioNeto + " monedas de oro");
        System.out.println("Tu saldo final es de " + salarioNeto + " monedas de oro, ¡Prepárate para tu próxima aventura!");
    }
}


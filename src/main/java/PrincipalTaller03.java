import java.util.Scanner;

public class PrincipalTaller03 {
    public static void main(String[] args) {
    iniciarPrograma();

    }

    public static void iniciarPrograma() {
        boolean b;
        do {
            mostrarMenu();
            b = elegirOpcion(ingresarOpcion());

        } while (!b);
    }
    public static String ingresarOpcion() {
        Scanner teclado= new Scanner(System.in);
        String s = teclado.next();
        return s;
    }

    public static void mostrarMenu() {
        Scanner telcado = new Scanner(System.in);
        System.out.println("Bienvenido, por favor ingrese una opcion");
        System.out.println("[1] mostrar datos");
        System.out.println("[2] Editar datos");
        System.out.println("[0] Salir");
    }
    public static boolean elegirOpcion(String seleccionOpcion) {
        boolean b;
        switch (seleccionOpcion) {
            case "1": {
                System.out.println("Usted ha seleccionado: Mostrar datos");
                b = true;
                break;
            }
            case "2": {
                System.out.println("Usted ha seleccionado: Editar datos");
                b = true;
                break;
            }
            case "0": {
                b = true;
                System.out.println("El programa ha finalizado");
                break;
            }
            default: {
                System.out.println("opcion no valida");
                b = false;
                break;
            }

        }
        return b;
}
}

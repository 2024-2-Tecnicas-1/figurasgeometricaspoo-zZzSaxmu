import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura:");
        String nombre = scan.nextLine();

        System.out.println("Ingrese el color de la figura:");
        String color = scan.nextLine();

        System.out.println("Seleccione el tipo de figura:");
        System.out.println("1. Circulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        int opcion = scan.nextInt();

        FiguraGeometrica figura = null;

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el radio del circulo:");
                double radio = scan.nextDouble();
                figura = new Circulo(nombre, color, radio);
                break;

            case 2:
                System.out.println("Ingrese el largo del rectangulo:");
                double largo = scan.nextDouble();
                System.out.println("Ingrese el ancho del rectangulo:");
                double ancho = scan.nextDouble();
                figura = new Rectangulo(nombre, color, largo, ancho);
                break;

            case 3:
                System.out.println("Ingrese la base del triangulo:");
                double base = scan.nextDouble();
                System.out.println("Ingrese la altura del triangulo:");
                double altura = scan.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
                break;

            default:
                System.out.println("Opción no válida.");
                return;
        }

        if (figura != null) {
            System.out.println("Área de la figura: " + figura.calcularArea());
            System.out.println("Perímetro de la figura: " + figura.calcularPerimetro());
        }

        scan.close();
    }
}

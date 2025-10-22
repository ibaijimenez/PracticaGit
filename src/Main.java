import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String cadena() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cadena:");
        return sc.nextLine();
    }
    public static char posicionx(String cadena) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la posición que desea saber:");
        int pos = sc.nextInt() -1;
        if (pos >= -1 && pos < cadena.length()) {
            return cadena.charAt(pos);
        } else {
            System.out.println("Posición inválida");
        }
        return '\0';
    }
    public static int entero(String cadena) {
        int cadena1 = Integer.parseInt(cadena());
        return cadena1;
    }
    public static LocalDate fecha(String cadena) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechauno = LocalDate.parse(cadena, dtf);
        return fechauno;
    }
    public static void main(String[] args) {

    }
}
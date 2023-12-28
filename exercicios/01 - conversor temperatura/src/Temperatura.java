import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) throws Exception {

        //para reconhecer o double no scanner tem q colocar o ".useLocale(Locale.US)"
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite a temperatura em Graus Celsius: ");
        Double celsius = s.nextDouble();
        System.out.println(celsius);
        escolherTemperatura(celsius);
    }

    public static void escolherTemperatura(double celsius) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a temperatura que deseja (F - Fahrenheit; K - Kelvin; Ra - Reaumur; Re - Rankie): ");
        String temperatura = s.next();

        if (temperatura.equalsIgnoreCase("F")) {
            System.out.println("A Temperatura em Fahrenheit é de: " + converterFahrenheit(celsius));
        } else if (temperatura.equalsIgnoreCase("K")) {
            System.out.println("A Temperatura em Kelvin é de: " + converterKelvin(celsius));
        } else if (temperatura.equalsIgnoreCase("Ra")) {
            System.out.println("A Temperatura em Reaumur é de: " + converterReaumur(celsius));
        } else if (temperatura.equalsIgnoreCase("Re")) {
            System.out.println("A Temperatura em Rankine é de: " + converterRankine(celsius));
        }

    }

    public static Double converterKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static Double converterReaumur(double celsius) {
        return celsius * 0.8;
    }

    public static Double converterFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static Double converterRankine(double celsius) {
        return celsius * 1.8;
    }
}

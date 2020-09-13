import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj cenę sprzętu");
        Scanner pric = new Scanner(System.in);
        double price = pric.nextDouble();
        System.out.println("Podaj liczbę rat do spłaty");
        Scanner numberOfInstallmen = new Scanner(System.in);
        int numberOfInstallment = numberOfInstallmen.nextInt();
        while (price < 100) {
            System.out.println("Sprzedaż ratalna powyżej 100 PLN");
            System.out.println("Podaj ponownie cenę sprzętu");
            price = pric.nextDouble();
            //return;
        }
        while (price > 10000) {
            System.out.println("Sprzedaż ratalna do 10000 PLN");
            System.out.println("Podaj ponownie cenę sprzętu");
            price = pric.nextDouble();
            //return;
        }
        while (numberOfInstallment < 6) {
            System.out.println("Minimalna liczba rat to 6");
            System.out.println("Podaj ponownie liczbę rat do spłaty");
            numberOfInstallment = numberOfInstallmen.nextInt();
            //return;
        }
        while (numberOfInstallment > 48) {
            System.out.println("Maksymalna liczba rat to 48");
            System.out.println("Podaj ponownie liczbę rat do spłaty");
            numberOfInstallment = numberOfInstallmen.nextInt();
            //return;
        }
        if (numberOfInstallment > 5 && numberOfInstallment < 13) {
            double installment = price / numberOfInstallment + price * 0.025;
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMaximumFractionDigits(2);
            System.out.println("Twoja rata to: " + nf.format(installment) + " PLN.");
        } else if (numberOfInstallment > 12 && numberOfInstallment < 25) {
            double installment = price / numberOfInstallment + price * 0.05;
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMaximumFractionDigits(2);
            System.out.println("Twoja rata to: " + nf.format(installment) + " PLN.");
        } else if (numberOfInstallment > 24 && numberOfInstallment < 49) {
            double installment = price / numberOfInstallment + price * 0.1;
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMaximumFractionDigits(2);
            System.out.println("Twoja rata to: " + nf.format(installment) + " PLN.");
        }

    }
}

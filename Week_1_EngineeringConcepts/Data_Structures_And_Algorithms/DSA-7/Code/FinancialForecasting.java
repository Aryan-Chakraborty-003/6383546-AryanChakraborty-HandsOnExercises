import java.util.Scanner;

class FinancialForecasting {
    public static double forecast(double initial, double rate, int years) {
        if (years == 0) return initial;
        return forecast(initial * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial value: ");
        double initial = scanner.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.1 for 10%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double futureValue = forecast(initial, rate, years);
        System.out.println("Forecasted value after " + years + " years: " + futureValue);

        scanner.close();
    }
}

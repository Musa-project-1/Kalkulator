public class Kalkulator { 
    public static String hitung(String operator, double a, double b) {
        if (operator.equals("÷") && b == 0) return "Error: Bagi 0!";
        double hasil = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "X" -> a * b;
            case "÷" -> a / b;
            default -> 0;
        };
        if (Math.abs(hasil)>= 1_000_000_000_000L) { return String.format("%.2E", hasil);}       
        return (hasil == (long) hasil) ? String .valueOf((long) hasil) : String.valueOf(hasil);
    }
}

import java.util.Scanner;

public class Main {

    public static String[] romanNumbers = {"there is no number", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII",
            "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII",
            "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII",
            "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII",
            "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV",
            "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV",
            "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV",
            "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII",
            "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toUpperCase();
        System.out.println(calc(str));
    }

    public static String calc(String input) throws Exception {
        int result, result2;
        String[] data;
        String resultat = "Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.";
        if (!input.contains("+") && !input.contains("-") && !input.contains("*") && !input.contains("/")) {
            throw new Exception("//т.к. строка не является математической операцией");
        }
        try {
            if (input.contains("+")) {
                data = input.split("\\+", 2);
                if (data[1].contains("+") || data[1].contains("-") || data[1].contains("*") || data[1].contains("/")) {
                    throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
                result = Integer.parseInt(data[0]);
                result2 = Integer.parseInt(data[1]);
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    return resultat = Integer.toString(result + result2);
                else
                    return resultat;
            } else if (input.contains("-")) {
                data = input.split("-", 2);
                if (data[1].contains("+") || data[1].contains("-") || data[1].contains("*") || data[1].contains("/")) {
                    throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
                result = Integer.parseInt(data[0]);
                result2 = Integer.parseInt(data[1]);
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    return resultat = Integer.toString(result - result2);
                else
                    return resultat;
            } else if (input.contains("*")) {
                data = input.split("\\*", 2);
                if (data[1].contains("+") || data[1].contains("-") || data[1].contains("*") || data[1].contains("/")) {
                    throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
                result = Integer.parseInt(data[0]);
                result2 = Integer.parseInt(data[1]);
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    return resultat = Integer.toString(result * result2);
                else
                    return resultat;
            } else if (input.contains("/")) {
                data = input.split("/", 2);
                if (data[1].contains("+") || data[1].contains("-") || data[1].contains("*") || data[1].contains("/")) {
                    throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
                result = Integer.parseInt(data[0]);
                result2 = Integer.parseInt(data[1]);
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    return resultat = Integer.toString(result / result2);
                else
                    return resultat;
            }
        } catch (NumberFormatException e) {
            if (input.contains("+")) {
                data = input.split("\\+", 2);
                if (data[1].contains("+") || data[1].contains("-") || data[1].contains("*") || data[1].contains("/")) {
                    throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
                result = romanСonversion(data[0]);
                result2 = romanСonversion(data[1]);
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    return resultat = romanNumbers[result + result2];
                else
                    return resultat;
            } else if (input.contains("-")) {
                data = input.split("-", 2);
                if (data[1].contains("+") || data[1].contains("-") || data[1].contains("*") || data[1].contains("/")) {
                    throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
                result = romanСonversion(data[0]);
                result2 = romanСonversion(data[1]);
                if (result < result2 || result == result2) {
                    throw new Exception("т.к. в римской системе нет отрицательных чисел");
                }
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    return resultat = romanNumbers[result - result2];
                else
                    return resultat;
            } else if (input.contains("*")) {
                data = input.split("\\*", 2);
                if (data[1].contains("+") || data[1].contains("-") || data[1].contains("*") || data[1].contains("/")) {
                    throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
                result = romanСonversion(data[0]);
                result2 = romanСonversion(data[1]);
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    return resultat = romanNumbers[result * result2];
                else
                    return resultat;
            } else if (input.contains("/")) {
                data = input.split("/", 2);
                if (data[1].contains("+") || data[1].contains("-") || data[1].contains("*") || data[1].contains("/")) {
                    throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
                result = romanСonversion(data[0]);
                result2 = romanСonversion(data[1]);
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    return resultat = romanNumbers[result / result2];
                else
                    return resultat;
            }
        }
        return input;
    }

    public static int romanСonversion(String roman) {
        int result = 0;
        for (int i = 0; i < romanNumbers.length; i++) {
            if (roman.equals(romanNumbers[i]))
                result = i;
        }
        return result;
    }

}

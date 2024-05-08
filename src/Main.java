import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("input:");
        String UserChat = scanner.nextLine();

        String result = String.valueOf(calc(UserChat));

        String[] Box = UserChat.split(" ");

        if (Box[0].equals("I") || Box[0].equals("II") || Box[0].equals("III") || Box[0].equals("IV")
                || Box[0].equals("V") || Box[0].equals("VI") || Box[0].equals("VII") || Box[0].equals("VIII")
                || Box[0].equals("IX") || Box[0].equals("X")) {

            int intresylt = Integer.parseInt(result);
            if (intresylt < 0) {
                throw new IllegalArgumentException("т.к. в римской системе нет отрицательных чисел");
            }
            String StrResult = Integer.toString(intresylt);

            HashMap<Integer, String> resultmap = new HashMap<>();

            resultmap.put(1, "I");
            resultmap.put(2, "II");
            resultmap.put(3, "III");
            resultmap.put(4, "IV");
            resultmap.put(5, "V");
            resultmap.put(6, "VI");
            resultmap.put(7, "VII");
            resultmap.put(8, "VIII");
            resultmap.put(9, "IX");
            resultmap.put(10, "X");
            resultmap.put(11, "XI");
            resultmap.put(12, "XII");
            resultmap.put(13, "XIII");
            resultmap.put(14, "XIV");
            resultmap.put(15, "XV");
            resultmap.put(16, "XVI");
            resultmap.put(17, "XVII");
            resultmap.put(18, "XVIII");
            resultmap.put(19, "XIX");
            resultmap.put(20, "XX");
            resultmap.put(21, "XXI");
            resultmap.put(22, "XXII");
            resultmap.put(23, "XXIII");
            resultmap.put(24, "XXIV");
            resultmap.put(25, "XXV");
            resultmap.put(26, "XXVI");
            resultmap.put(27, "XXVII");
            resultmap.put(28, "XXVIII");
            resultmap.put(29, "XXIX");
            resultmap.put(30, "XXX");
            resultmap.put(31, "XXXI");
            resultmap.put(32, "XXXII");
            resultmap.put(33, "XXXIII");
            resultmap.put(34, "XXXIV");
            resultmap.put(35, "XXXV");
            resultmap.put(36, "XXXVI");
            resultmap.put(37, "XXXVII");
            resultmap.put(38, "XXXVIII");
            resultmap.put(39, "XXXIX");
            resultmap.put(40, "XL");
            resultmap.put(41, "XLI");
            resultmap.put(42, "XLII");
            resultmap.put(43, "XLIII");
            resultmap.put(44, "XLIV");
            resultmap.put(45, "XLV");
            resultmap.put(46, "XLVI");
            resultmap.put(47, "XLVII");
            resultmap.put(48, "XLVIII");
            resultmap.put(49, "XLIX");
            resultmap.put(50, "L");
            resultmap.put(51, "LI");
            resultmap.put(52, "LII");
            resultmap.put(53, "LIII");
            resultmap.put(54, "LIV");
            resultmap.put(55, "LV");
            resultmap.put(56, "LVI");
            resultmap.put(57, "LVII");
            resultmap.put(58, "LVIII");
            resultmap.put(59, "LIX");
            resultmap.put(60, "LX");
            resultmap.put(61, "LXI");
            resultmap.put(62, "LXII");
            resultmap.put(63, "LXIII");
            resultmap.put(64, "LXIV");
            resultmap.put(65, "LXV");
            resultmap.put(66, "LXVI");
            resultmap.put(67, "LXVII");
            resultmap.put(68, "LXVIII");
            resultmap.put(69, "LXIX");
            resultmap.put(70, "LXX");
            resultmap.put(71, "LXXI");
            resultmap.put(72, "LXXII");
            resultmap.put(73, "LXXIII");
            resultmap.put(74, "LXXIV");
            resultmap.put(75, "LXXV");
            resultmap.put(76, "LXXVI");
            resultmap.put(77, "LXXVII");
            resultmap.put(78, "LXXVIII");
            resultmap.put(79, "LXXIX");
            resultmap.put(80, "LXXX");
            resultmap.put(81, "LXXXI");
            resultmap.put(82, "LXXXII");
            resultmap.put(83, "LXXXIII");
            resultmap.put(84, "LXXXIV");
            resultmap.put(85, "LXXXV");
            resultmap.put(86, "LXXXVI");
            resultmap.put(87, "LXXXVII");
            resultmap.put(88, "LXXXVIII");
            resultmap.put(89, "LXXXIX");
            resultmap.put(90, "XC");
            resultmap.put(91, "XCI");
            resultmap.put(92, "XCII");
            resultmap.put(93, "XCIII");
            resultmap.put(94, "XCIV");
            resultmap.put(95, "XCV");
            resultmap.put(96, "XCVI");
            resultmap.put(97, "XCVII");
            resultmap.put(98, "XCVIII");
            resultmap.put(99, "XCIX");
            resultmap.put(100, "C");

            for (int i = 0; i < StrResult.length(); i++) {
                for (Integer key : resultmap.keySet()) {
                    if (StrResult.equals(key.toString())) {
                        StrResult = String.valueOf(resultmap.get(key));
                    }
                }
            }
            if (StrResult.equals("0")) {
                throw new IllegalArgumentException("т.к. в римской системе нет 0");
            } else {
                System.out.print("Output:\n" + StrResult);
            }
        } else {
            System.out.print("Output:\n" + result);
        }
    }

    public static String calc(String UserChat) {

        String[] Box = UserChat.split(" ");

        if (Box.length != 3) {
            throw new IllegalArgumentException("//т.к. формат математической операции не удовлетворяет " +
                    "заданию - два операнда и один оператор (+, -, /, *)");
        }

        if (!Box[1].equals("+") && !Box[1].equals("-") && !Box[1].equals("*") && !Box[1].equals("/")) {
            throw new IllegalArgumentException("//т.к. строка не является математической операцией");
        }
        if (!Box[0].matches("[0-9]+") != !Box[2].matches("[0-9]+")) {
            throw new IllegalArgumentException("т.к. используются одновременно разные системы счисления");
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);

        for (int i = 0; i < Box.length; i++) {
            for (String key : map.keySet()) {
                if (Box[i].equals(key)) {
                    Box[i] = String.valueOf(map.get(key));
                }
            }
        }

        String StrNum1 = Box[0];
        String StrOper = Box[1];
        String StrNum2 = Box[2];

        int IntNum1 = Integer.parseInt(StrNum1);
        int IntNum2 = Integer.parseInt(StrNum2);

        if (IntNum1 < 0 || IntNum1 > 10 || IntNum2 < 0 || IntNum2 > 10) {
            throw new IllegalArgumentException("Число должно быть от 0 до 10 включительно");
        }

        if (StrOper.equals("+")) {
            return String.valueOf(IntNum1 + IntNum2);
        } else if (StrOper.equals("-")) {
            return String.valueOf(IntNum1 - IntNum2);
        } else if (StrOper.equals("*")) {
            return String.valueOf(IntNum1 * IntNum2);
        } else if (StrOper.equals("/")) {
            if (IntNum2 == 0) {
                throw new IllegalArgumentException("Деление на ноль невозможно");
            } else {
                return String.valueOf(IntNum1 / IntNum2);
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
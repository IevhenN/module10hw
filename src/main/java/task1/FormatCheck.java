package task1;

import java.util.regex.Pattern;

public class FormatCheck {
// Сделал код проверки формата не используя регулярные выражения.
// Но хотелось попробовать еще и их :))

//   boolean checkFormat(String number){
//        if (number.length()==14){
//            if (number.charAt(0) == '(' && number.charAt(4)==')' && number.charAt(5)== ' ' && number.charAt(9)=='-') {
//                String numberNumeric = number
//                        .replace("(","")
//                        .replace(")","")
//                        .replace(" ","")
//                        .replace("-","");
//                try {
//                    Double.parseDouble(numberNumeric);
//                    return true;
//                } catch (NumberFormatException e) {
//                    return false;
//                }
//            }
//        } else if (number.length()==12) {
//            if (number.charAt(3) == '-' && number.charAt(7)=='-') {
//                String numberNumeric = number.replace("-","");
//                try {
//                    Double.parseDouble(numberNumeric);
//                    return true;
//                } catch (NumberFormatException e){
//                    return false;
//                }
//            };
//        }
//
//        return false;
//    }
    boolean checkFormat(String number) {
        if (Pattern.matches("\\(\\d{3}\\) \\d{3}-\\d{4}", number)) {
//                (xxx) xxx-xxxx
            return true;
        } else if (Pattern.matches("\\d{3}-\\d{3}-\\d{4}", number)) {
//                xxx-xxx-xxxx
            return true;
        }

        return false;
    }
}

package HomeWork2_2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.util.Arrays;

public class TransportService {
    Transport[] transports = new Transport[5];

    public static void changeTiresToSeason(Transport[] transports) {
        int month = LocalDate.now().getMonthValue();
        for (Transport summerOrWinterTires : transports){
            summerOrWinterTires.setSummerOrWinterTires((month >= 4) && (month <= 9));
        }

    }
    public static String isCorrectStringType(String object) {
        if (!object.equals("")) {
            if (!object.isBlank()) {
                return object;
            }
        }
        return "default ";
    }

    public static int isCorrectIntType(int object) {
        if (object < 1 || object > 100) {
                return 1;
            }
        return object;
    }

    public static String isCorrectRegistrationNumber(String object) {
        String object2 = object.trim();
        if (object.length() == 9){
            Pattern pattern = Pattern.compile("\\w{1}\\d{3}\\w{2}\\d{3}");
            Matcher matches = pattern.matcher(object);
            boolean result = matches.matches();
            if (!result) {
                object = "default ";
            }
    } else object = "default ";
        return object;
    }
}

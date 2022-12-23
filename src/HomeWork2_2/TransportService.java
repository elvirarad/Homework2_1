package HomeWork2_2;

import java.time.LocalDate;

public class TransportService {
    Transport[] transports = new Transport[5];

    public static void changeTiresToSeason(Transport[] transports) {
        int month = LocalDate.now().getMonthValue();
        for (Transport summerOrWinterTires : transports){
            summerOrWinterTires.setSummerOrWinterTires((month >= 4) && (month <= 9));
        }

    }

}

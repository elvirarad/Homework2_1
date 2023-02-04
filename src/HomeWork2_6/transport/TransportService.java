package HomeWork2_6.transport;

import HomeWork2_6.transport.Transport;

public class TransportService {
    Transport[] transports = new Transport[5];

    public static String isCorrectStringType(String object) {
        if (!object.equals("")) {
            if (!object.isBlank()) {
                return object;
            }
        }
        return "default ";
    }

    public static int isCorrectIntType(int object) {
        if (object < 1 || object > 350) {
            return 1;
        }
        return object;
    }

}

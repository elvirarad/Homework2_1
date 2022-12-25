package HomeWork2_3;


public class Main {
    public static void main(String[] args) {

        Transport[] transport = new Transport[5];
        transport[0] = new Transport("Lada", "Granta", "Россия", 1.7F, 2015, "желтый", "МККП", "седан", "о111ва102", 4, false);
        transport[1] = new Transport("Audi", "A8 50 L TDI quattro", "Германия", 3.0F, 2020, "черный", "5АКПП", "хечбек", "б789ка777", 4, true);
        transport[2] = new Transport("BMW", "Z8", "Германия", 3F, 2021, "черный", "РКПП", "кабриолет", "а123то002", 4, true);
        transport[3] = new Transport("Kia", "Sportage 4-го поколения", "Южная Корея", 2.4F, 2018, "красный", "5АКПП", "кроссовер", "т159ип126", 5, false);
        transport[4] = new Transport("Hyundai", "Avante", "Южная Корея", 01.6F, 2016, "оранжевый", "4АКПП", "пикап", "м777м177", 4, true);

        for (
                Transport i : transport) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println(" Резина с учётом текущего сезона:");

        TransportService.changeTiresToSeason(transport);

        for (
                Transport i : transport) {
            System.out.println(i);
        }
    }
}

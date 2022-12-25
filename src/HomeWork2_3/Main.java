package HomeWork2_3;


public class Main {
    public static void main(String[] args) {

        Transport[] transport = new Transport[5];
        transport[0] = new Transport("Lada", "Granta",  2015, "Россия","желтый", 190);
        transport[1] = new Transport("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 250);
        transport[2] = new Transport("BMW", "Z8", 2021, "Германия", "черный", 280);
        transport[3] = new Transport("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 230);
        transport[4] = new Transport("Hyundai", "Avante", 2016,"Южная Корея",  "оранжевый", 200);

        for (Transport i : transport) {
            System.out.println(i);
        }

        /*for (Car i : )  {
            System.out.println(i);
        }*/

    }
}

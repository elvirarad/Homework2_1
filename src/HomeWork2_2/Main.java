package HomeWork2_2;

import lesson1.Transport;

public class Main {
    public static void main(String[] args) {

        HomeWork2_2.Transport ladaGranta = new HomeWork2_2.Transport("Lada", "Granta", "Россия", 1.7F, 2015, "желтый", "МККП", "седан", "о111ва102", 4, false);
        ladaGranta.print();

        HomeWork2_2.Transport audiA8 = new HomeWork2_2.Transport("Audi", "A8 50 L TDI quattro", "Германия", 3.0F, 2020, "черный", "5АКПП", "хечбек", "б789ка777",4,true);
        audiA8.print();

        HomeWork2_2.Transport bmwZ8 = new HomeWork2_2.Transport("BMW", "Z8", "Германия", 3F, 2021, "черный", "РКПП", "кабриолет", "а123то002", 4, true);
        bmwZ8.print();

        HomeWork2_2.Transport kiaSportage = new HomeWork2_2.Transport("Kia", "Sportage 4-го поколения", "Южная Корея", 2.4F, 2018,"красный", "5АКПП", "кроссовер", "т159ип116", 5, false);
        kiaSportage.print();

        HomeWork2_2.Transport hyundaiAvante = new HomeWork2_2.Transport("Hyundai", "Avante", "Южная Корея", 01.6F, 2016, "оранжевый", "4АКПП", "пикап", "м777мм177", 4,false);
        hyundaiAvante.print();

        //Transport.changeTiresToSeason();
        //bmwZ8.print();
    }
}

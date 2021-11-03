package kur.alexei;

public class ValueState {
    String valueOfHouse;

    public void largeHouseValue() {
        valueOfHouse = "дорогущий)";
        System.out.println("оценка стоимости = " + valueOfHouse);
    }

    public void smallHouseValue() {
        valueOfHouse = "можно брать)";
        System.out.println("оценка стоимости = " + valueOfHouse);
    }
}

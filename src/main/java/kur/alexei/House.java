package kur.alexei;

public class House {
    Rooms houseRooms = new Rooms();
    Type typeOfWalls = new Type();
    Area areaOfHouse = new Area();
    ValueState valueState = new ValueState();

    public static void main(String[] args) {

        House inexpensiveHouse = new House();
        House expensiveHouse = new House();

        System.out.println("Доступный дом:");
        inexpensiveHouse.houseRooms.numberOfRooms();
        inexpensiveHouse.typeOfWalls.notBreakWalls();
        inexpensiveHouse.areaOfHouse.smallHouseArea();
        inexpensiveHouse.valueState.smallHouseValue();

        System.out.println("Дорогой дом:");
        expensiveHouse.houseRooms.incrementRooms();
        expensiveHouse.houseRooms.numberOfRooms();
        expensiveHouse.typeOfWalls.breakWalls();
        expensiveHouse.areaOfHouse.largeHouseArea();
        expensiveHouse.valueState.largeHouseValue();

    }
}

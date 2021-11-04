package kur.alexei;

public class House {

    Rooms houseRooms = new Rooms();
    Type typeOfWalls = new Type();
    Area areaOfHouse = new Area();
    ValueState valueState = new ValueState();


    public static void main(String[] args) {

        House inexpensiveHouse = new House();
        House expensiveHouse = new House();

        inexpensiveHouse.houseRooms.rooms = 2;
        inexpensiveHouse.areaOfHouse.area = 50.73;
        expensiveHouse.houseRooms.rooms = inexpensiveHouse.houseRooms.rooms;
        expensiveHouse.areaOfHouse.area = 1025.356;

        System.out.println("Доступный дом:");
        inexpensiveHouse.houseRooms.numberOfRooms();
        inexpensiveHouse.typeOfWalls.notBreakWalls();
        inexpensiveHouse.areaOfHouse.smallHouseArea();
        inexpensiveHouse.valueState.smallHouseValue();

        System.out.println("Дорогой дом:");
        expensiveHouse.houseRooms.incrementRooms();
        //System.out.println();
        expensiveHouse.houseRooms.numberOfRooms();
        expensiveHouse.typeOfWalls.breakWalls();
        expensiveHouse.areaOfHouse.largeHouseArea();
        expensiveHouse.valueState.largeHouseValue();

    }
}

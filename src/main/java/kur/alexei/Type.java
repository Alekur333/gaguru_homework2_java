package kur.alexei;

public class Type {
    boolean breakWalls = true;

    public void breakWalls() {
        System.out.println("кирпичные стены = " + breakWalls);
    }

    public void notBreakWalls() {
        breakWalls = !breakWalls;
        System.out.println("кирпичные стены = " + breakWalls);

    }

}

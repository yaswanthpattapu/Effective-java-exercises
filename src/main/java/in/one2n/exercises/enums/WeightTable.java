package in.one2n.exercises.enums;

public class WeightTable {
    public static void main(String[] args) {
        //Can pass any value as earthWeight
        //that will print weights of other planets accordingly
        double earthWeight = 185;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
    }
}

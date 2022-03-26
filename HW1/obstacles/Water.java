package HW1.obstacles;

import HW1.Competitors.Animal;
import HW1.Competitors.Competitor;

public class Water extends Obstacle {
    private final int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(distance);
    }
}
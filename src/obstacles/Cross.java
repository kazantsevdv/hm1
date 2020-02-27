package obstacles;

import competitors.Competitor;

public class Cross implements Obstacle {
    int distance;

    public Cross(int distance) {
        this.distance = Math.max(distance, 0);
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(distance);
    }
}

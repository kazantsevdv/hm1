package obstacles;

import competitors.Competitor;

public class Wall implements Obstacle {
    int height;

    public Wall(int height) {
        this.height = Math.max(height, 0);
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}

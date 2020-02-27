import competitors.Cat;
import competitors.Competitor;
import competitors.Human;
import competitors.Robot;
import obstacles.Cross;
import obstacles.Obstacle;
import obstacles.Wall;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {
                new Human("Выся"),
                new Robot("Бендер"),
                new Cat("Мурзик")
        };
        Obstacle[] obstacles = {
                new Wall(3),
                new Cross(10),
                new Wall(1)
        };

        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isDistance()) {
                    break;
                }
            }
        }

        for (Competitor c : competitors) {
            c.info();
        }


    }
}

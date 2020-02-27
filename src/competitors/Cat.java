package competitors;

public class Cat implements Competitor {
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    boolean active;


    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = Math.max(maxRunDistance, 0);
        this.maxJumpHeight = Math.max(maxJumpHeight, 0);
        this.active = true;
    }

    public Cat(String name) {
        this(name, 500, 1);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance && active) {
            System.out.println("Кот " + name + " справился с бегом");
        } else {
            System.out.println("Кот " + name + " провалил бег");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight && active) {
            System.out.println("Кот " + name + " справился с прыжком");
        } else {
            System.out.println("Кот " + name + " не смог допрыгнуть");
            active = false;
        }
    }

    @Override
    public boolean isDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println("Кот " + name + " " + active);
    }
}

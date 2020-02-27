package competitors;

public class Robot implements Competitor {
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    boolean active;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = Math.max(maxRunDistance, 0);
        this.maxJumpHeight = Math.max(maxJumpHeight, 0);
        this.active = true;

    }

    public Robot(String name) {
        this(name, 5000, 10);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance && active) {
            System.out.println("Робот " + name + " справился с бегом");
        } else {
            System.out.println("Робот " + name + " провалил бег");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight && active) {
            System.out.println("Робот " + name + " справился с прыжком");
        } else {
            System.out.println("Робот " + name + " не смог допрыгнуть");
            active = false;
        }
    }

    @Override
    public boolean isDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println("Робот " + name + " " + active);
    }
}

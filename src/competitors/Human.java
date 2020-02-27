package competitors;

public class Human implements Competitor {
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    boolean active;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = Math.max(maxRunDistance, 0);
        this.maxJumpHeight = Math.max(maxJumpHeight, 0);
        this.active = true;
    }

    public Human(String name) {
        this(name, 3000, 2);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance && active) {
            System.out.println("Черовек " + name + " справился с бегом");
        } else {
            System.out.println("Черовек " + name + " провалил бег");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight && active) {
            System.out.println("Черовек " + name + " справился с прыжком");
        } else {
            System.out.println("Черовек " + name + " не смог допрыгнуть");
            active = false;
        }
    }

    @Override
    public boolean isDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println("Черовек " + name + " " + active);
    }
}

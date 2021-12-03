package uk.epl.player;

public abstract class Player {
    private String name;
    private int jerseyNumber;
    public static boolean sign;

    private int[] abilities = new int[3];
    final int SPEED = 0; final int STAMINA = 1; final int PASSING = 2;

    public Player(String name, int jerseyNumber, int speed, int stamina, int passing){
        this.name = name; this.jerseyNumber = jerseyNumber; this.position = new Position(0, 0);
        abilities[SPEED] = speed; abilities[STAMINA] = stamina; abilities[PASSING] = passing;
    }

    public Position position;

    public class Position{
        public int x;
        public int y;

        public Position(int x, int y) {
            setX(x);
            setY(y);
        }
        public void setX(int x) {
            this.x = x;
        }
        public void setY(int y) {
            this.y = y;
        }
        public String toString(){
            return String.format("%d, %d", x, y);
        }
    }

    public Position getPosition(){
        return new Position(position.x, position.y);
    }
    public abstract void moveUp();
    public abstract void moveDown();
    public abstract void moveLeft();
    public abstract void moveRight();
    public abstract String getPName();

    protected void decreaseStamina(){
        abilities[STAMINA] = (int)(abilities[STAMINA] - 2);
    }

    public String getName(){ return name; }
    public int getJerseyNumber(){ return jerseyNumber; }

    protected float getMoveDelta(){
        return 1 + getSpeed()/100 * getStamina()/100;
    }
    protected float getSpeed(){
        return (float)abilities[SPEED];
    }
    protected float getStamina(){
        return (float)abilities[STAMINA];
    }
    protected float getPassing(){
        return (float)abilities[PASSING];
    }
}

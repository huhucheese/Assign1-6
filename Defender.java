package uk.epl.player;

public class Defender extends Player {
    private int STRENGTH_POINT = 10;
    public Defender(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber, speed, stamina, passing);
    }

    public void moveUp(){
        if(sign){
            float move_delta = getMoveDelta();
            position.y = (int)(position.y - move_delta);
            decreaseStamina();
        }
    }

    @Override
    public void moveDown() {
        if(sign){
            float move_delta = getMoveDelta();
            position.y = (int)(position.y + move_delta);
            decreaseStamina();
        }
    }

    @Override
    public void moveLeft() {
        if(sign){
            float move_delta = getMoveDelta();
            position.x = (int)(position.x - move_delta);
            decreaseStamina();
        }
    }

    @Override
    public void moveRight() {
        if(sign){
            float move_delta = getMoveDelta();
            position.x = (int)(position.x + move_delta);
            decreaseStamina();
        }
    }

    @Override
    public String getPName() {
        return "D";
    }

    @Override
    protected float getStamina(){
        return super.getStamina() + STRENGTH_POINT;
    }

    @Override
    public String toString(){
        return String.format("Player Name='%s, JerseyNumber=%d Position (%s) Defender SPEED=%.1f, STAMINA=%.1f, PASSING=%.1f\n",
                super.getName(), super.getJerseyNumber(), super.getPosition(), super.getSpeed(), getStamina(), super.getPassing());
    }

}

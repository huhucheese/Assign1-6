package uk.epl.player;

public class Forward extends Player{
    private int ACCELERATION_POINT = 10;
    private String name;

    public Forward(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber, speed, stamina, passing);
    }

    @Override
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
        return "F";
    }

    @Override
    protected float getSpeed(){
        return super.getSpeed() + ACCELERATION_POINT;
    }

    @Override
    public String toString(){
        return String.format("Player Name='%s, JerseyNumber=%d Position (%s) Forward SPEED=%.1f, STAMINA=%.1f, PASSING=%.1f\n",
                super.getName(), super.getJerseyNumber(), super.getPosition(), getSpeed(), super.getStamina(), super.getPassing());
    }
}

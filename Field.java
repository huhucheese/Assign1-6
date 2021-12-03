package uk.epl.game;

import uk.epl.player.*;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Player> players = new ArrayList<>();

    public void add(Player newPlayer) {
        players.add(newPlayer);
        System.out.println(newPlayer);
    }

    public void moveUp(int choosePlayer) {
        for(Player player : players){
            if(player.getJerseyNumber() == choosePlayer){
                player.moveUp();
            }
        }
    }

    public void moveDown(int choosePlayer){
        for(Player player : players){
            if(player.getJerseyNumber() == choosePlayer){
                player.moveDown();
            }
        }
    }

    public void moveLeft(int choosePlayer){
        for(Player player : players){
            if(player.getJerseyNumber() == choosePlayer){
                player.moveLeft();
            }
        }
    }

    public void moveRight(int choosePlayer){
        for(Player player : players){
            if(player.getJerseyNumber() == choosePlayer){
                player.moveRight();
            }
        }
    }

    public void start() {
        for(Player player : players){
            player.position.setX(34);
            if("F".equals(player.getPName()))
                player.position.setY(25);
            else if("M".equals(player.getPName()))
                player.position.setY(50);
            else if("D".equals(player.getPName()))
                player.position.setY(75);
        }
        Player.sign = true;
    }

    public void info() {
        for(Player player : players){
            System.out.println(player);
        }
    }

    public void stop() {
        Player.sign = false;
    }

}

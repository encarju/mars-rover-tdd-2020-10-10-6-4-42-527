package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private  int coordinateX;
    private  int coordinateY;
    private  String headingDirection;



    public MarsRover(int coordinateX, int coordinateY, String headingDirection) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.headingDirection = headingDirection;
    }

    public void executeCommands(String commands) {
        Arrays.asList(commands.split("")).forEach(command -> this.executeCommand(command));
    }

    private void executeCommand(String command) {
        if(command=="M"){
            move();
        }
    }

    private void move() {
        if(headingDirection=="N"){
            coordinateY += 1;
        }
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public String getHeadingDirection() {
        return headingDirection;
    }
}

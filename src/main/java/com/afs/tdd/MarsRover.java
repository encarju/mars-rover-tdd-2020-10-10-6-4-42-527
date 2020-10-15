package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private static final String MOVE = "M";
    private static final String NORTH_DIRECTION = "N";
    private static final String DELIMITER = "";
    private static final String WEST_DIRECTION = "W";
    private static final int MOVE_ONE_COORDINATE = 1;
    private  int coordinateX;
    private  int coordinateY;
    private  String headingDirection;



    public MarsRover(int coordinateX, int coordinateY, String headingDirection) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.headingDirection = headingDirection;
    }

    public void executeCommands(String commands) {
        Arrays.asList(commands.split(DELIMITER)).forEach(command -> this.executeCommand(command));
    }

    private void executeCommand(String command) {
        if(command==MOVE){
            move();
        }
        if(command=="L"){
            turnLeft();
        }
    }

    private void turnLeft() {
        if(headingDirection==NORTH_DIRECTION){
            headingDirection = WEST_DIRECTION;
        }
    }

    private void move() {
        if(headingDirection==NORTH_DIRECTION){
            coordinateY += MOVE_ONE_COORDINATE;
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

package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private static final String MOVE = "M";
    private static final String NORTH_DIRECTION = "N";
    private static final String DELIMITER = "";
    private static final String WEST_DIRECTION = "W";
    private static final int MOVE_ONE_COORDINATE = 1;
    private static final String TURN_LEFT = "L" ;
    private static final String TURN_RIGHT = "R";
    private static final String EAST_DIRECTION = "E";
    private static final String SOUTH_DIRECTION = "S";
    private  int coordinateX;
    private  int coordinateY;
    private  String headingDirection;



    public MarsRover(int coordinateX, int coordinateY, String headingDirection) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.headingDirection = headingDirection;
    }

    public void executeCommands(String commands) throws CommandNotDefinedException {
        for (String command : Arrays.asList(commands.split(DELIMITER))) {
            this.executeCommand(command);
        }
    }

    private void executeCommand(String command) throws CommandNotDefinedException{
        if(command.equals(MOVE)){
            move();
        }
        else if(command.equals(TURN_LEFT)){
            turnLeft();
        }
        else if(command.equals(TURN_RIGHT)){
            turnRight();
        }
        else{
            throw new CommandNotDefinedException("Command Not Defined");
        }
    }

    private void turnRight() {
        if(isNorthernDirection()){
            headingDirection = EAST_DIRECTION;
        }
        else if(isSouthernDirection()){
            headingDirection = WEST_DIRECTION;
        }
        else if(isEasternDirection()){
            headingDirection = SOUTH_DIRECTION;
        }
        else if(isWesternDirection()){
            headingDirection = NORTH_DIRECTION;
        }
    }

    private void turnLeft() {
        if(isNorthernDirection()){
            headingDirection = WEST_DIRECTION;
        }
        else if(isSouthernDirection()){
            headingDirection = EAST_DIRECTION;
        }
        else if(isEasternDirection()){
            headingDirection = NORTH_DIRECTION;
        }
        else if(isWesternDirection()){
            headingDirection = SOUTH_DIRECTION;
        }
    }

    private void move() {
        if(isNorthernDirection()){
            coordinateY += MOVE_ONE_COORDINATE;
        }
        else if(isSouthernDirection()){
            coordinateY -= MOVE_ONE_COORDINATE;
        }
        else if(isEasternDirection()){
            coordinateX += MOVE_ONE_COORDINATE;
        }
        else if(isWesternDirection()){
            coordinateX -= MOVE_ONE_COORDINATE;
        }
    }

    private boolean isNorthernDirection(){
        return headingDirection==NORTH_DIRECTION;
    }

    private boolean isSouthernDirection(){
        return headingDirection==SOUTH_DIRECTION;
    }

    private boolean isEasternDirection() {
        return headingDirection==EAST_DIRECTION;
    }

    private boolean isWesternDirection() {
        return headingDirection==WEST_DIRECTION;
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

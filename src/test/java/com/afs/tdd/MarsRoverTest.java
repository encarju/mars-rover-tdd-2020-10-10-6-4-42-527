package com.afs.tdd;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MarsRoverTest {

    @Test
    void should_return_0_1_N_when_execute_given_0_0_N_command_M() {
        //Given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //When
        marsRover.executeCommands("M");
        //Then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(1, marsRover.getCoordinateY());
        assertEquals("N",marsRover.getHeadingDirection());
    }
    @Test
    void should_return_0_0_W_when_execute_given_0_0_N_command_L() {
        //Given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //When
        marsRover.executeCommands("L");
        //Then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals("W",marsRover.getHeadingDirection());
    }

    @Test
    void should_return_0_0_E_when_execute_given_0_0_N_command_R() {
        //Given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //When
        marsRover.executeCommands("R");
        //Then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals("E",marsRover.getHeadingDirection());
    }

    @Test
    void should_return_0_negative_1_S_when_execute_given_0_0_S_command_M() {
        //Given
        MarsRover marsRover = new MarsRover(0,0,"S");
        //When
        marsRover.executeCommands("M");
        //Then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(-1, marsRover.getCoordinateY());
        assertEquals("S",marsRover.getHeadingDirection());
    }

    @Test
    void should_return_0_0_E_when_execute_given_0_0_S_command_L() {
        //Given
        MarsRover marsRover = new MarsRover(0,0,"S");
        //When
        marsRover.executeCommands("L");
        //Then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals("E",marsRover.getHeadingDirection());
    }

    @Test
    void should_return_0_0_W_when_execute_given_0_0_S_command_R() {
        //Given
        MarsRover marsRover = new MarsRover(0,0,"S");
        //When
        marsRover.executeCommands("R");
        //Then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals("W",marsRover.getHeadingDirection());
    }

    @Test
    void should_return_1_0_E_when_execute_given_0_0_E_command_M() {
        //Given
        MarsRover marsRover = new MarsRover(0,0,"E");
        //When
        marsRover.executeCommands("M");
        //Then
        assertEquals(1, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals("E",marsRover.getHeadingDirection());
    }

    @Test
    void should_return_0_0_N_when_execute_given_0_0_E_command_L() {
        //Given
        MarsRover marsRover = new MarsRover(0,0,"E");
        //When
        marsRover.executeCommands("L");
        //Then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals("N",marsRover.getHeadingDirection());
    }

    @Test
    void should_return_0_0_S_when_execute_given_0_0_E_command_R() {
        //Given
        MarsRover marsRover = new MarsRover(0,0,"E");
        //When
        marsRover.executeCommands("R");
        //Then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals("S",marsRover.getHeadingDirection());
    }

    @Test
    void should_return_negative_1_0_W_when_execute_given_0_0_W_command_M() {
        //Given
        MarsRover marsRover = new MarsRover(0,0,"W");
        //When
        marsRover.executeCommands("M");
        //Then
        assertEquals(-1, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals("W",marsRover.getHeadingDirection());
    }

    @Test
    void should_return_0_0_S_when_execute_given_0_0_W_command_L() {
        //Given
        MarsRover marsRover = new MarsRover(0,0,"W");
        //When
        marsRover.executeCommands("L");
        //Then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals("S",marsRover.getHeadingDirection());
    }

    @Test
    void should_return_0_0_N_when_execute_given_0_0_W_command_R() {
        //Given
        MarsRover marsRover = new MarsRover(0,0,"W");
        //When
        marsRover.executeCommands("R");
        //Then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(0, marsRover.getCoordinateY());
        assertEquals("N",marsRover.getHeadingDirection());
    }

    @Test
    void should_return_exception_when_execute_given_command_string_not_defined() {
        //Given
        MarsRover marsRover = new MarsRover(0,0,"W");
        //When
        Executable executable = () -> {
            marsRover.executeCommands("MLMR");
        };
        //Then
        assertThrows(CommandNotDefinedException.class,executable);
    }

}

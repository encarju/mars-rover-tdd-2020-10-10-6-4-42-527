package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_return_0_1_N_when_execute_given_0_0_N_command_M() {
        //Given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //When
        marsRover.executeCommand("M");
        //Then
        assertEquals(0, marsRover.getCoordinateX());
        assertEquals(1, marsRover.getCoordinateY());
        assertEquals("N",marsRover.getHeadingDirection());
    }
}

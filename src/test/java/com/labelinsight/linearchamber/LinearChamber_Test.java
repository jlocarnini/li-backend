package com.labelinsight.linearchamber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class LinearChamber_Test {

    @Test
    public void chamber0() {

        String testString = "..R....";
        LinearChamber linearChamber = new LinearChamber();

        System.out.println("Testing - 2, " + testString);

        String[] animatedParticles = linearChamber.animate(testString, 2);

        System.out.println("Result is:");
        Arrays.stream(animatedParticles).forEach(frame -> System.out.println(frame));
        System.out.println("==========================");

        String[] expectedParticles = {
                "..X....",
                "....X..",
                "......X",
                "......." };

        Assertions.assertEquals(expectedParticles.length, animatedParticles.length);

        for (int i = 0; i < animatedParticles.length; i++) {
            Assertions.assertEquals(expectedParticles[i], animatedParticles[i]);
        }
    }

    @Test
    public void chamber1() {

        String testString = "RR..LRL";
        LinearChamber linearChamber = new LinearChamber();

        System.out.println("Testing - 3, " + testString);

        String[] animatedParticles = linearChamber.animate(testString, 3);

        System.out.println("Result is:");
        Arrays.stream(animatedParticles).forEach(frame -> System.out.println(frame));
        System.out.println("==========================");

        String[] expectedParticles = {
                "XX..XXX",
                ".X.XX..",
                "X.....X",
                "......." };

        Assertions.assertEquals(expectedParticles.length, animatedParticles.length);

        for (int i = 0; i < animatedParticles.length; i++) {
            Assertions.assertEquals(expectedParticles[i], animatedParticles[i]);
        }
    }

    @Test
    public void chamber2() {

        String testString = "LRLR.LRLR";
        LinearChamber linearChamber = new LinearChamber();

        System.out.println("Testing - 2, " + testString);

        String[] animatedParticles = linearChamber.animate(testString, 2);

        System.out.println("Result is:");
        Arrays.stream(animatedParticles).forEach(frame -> System.out.println(frame));
        System.out.println("==========================");

        String[] expectedParticles = {
                "XXXX.XXXX",
                "X..X.X..X",
                ".X.X.X.X.",
                ".X.....X.",
                "........." };

        Assertions.assertEquals(expectedParticles.length, animatedParticles.length);

        for (int i = 0; i < animatedParticles.length; i++) {
            Assertions.assertEquals(expectedParticles[i], animatedParticles[i]);
        }
    }

    @Test
    public void chamber3() {

        String testString = "RLRLRLRLRL";
        LinearChamber linearChamber = new LinearChamber();

        System.out.println("Testing - 10, " + testString);

        String[] animatedParticles = linearChamber.animate(testString, 10);

        System.out.println("Result is:");
        Arrays.stream(animatedParticles).forEach(frame -> System.out.println(frame));
        System.out.println("==========================");

        String[] expectedParticles = {
                "XXXXXXXXXX",
                ".........." };

        Assertions.assertEquals(expectedParticles.length, animatedParticles.length);

        for (int i = 0; i < animatedParticles.length; i++) {
            Assertions.assertEquals(expectedParticles[i], animatedParticles[i]);
        }
    }

    @Test
    public void chamber4() {

        String testString = "...";
        LinearChamber linearChamber = new LinearChamber();

        System.out.println("Testing - 1, " + testString);

        String[] animatedParticles = linearChamber.animate(testString, 1);

        System.out.println("Result is:");
        Arrays.stream(animatedParticles).forEach(frame -> System.out.println(frame));
        System.out.println("==========================");

        String[] expectedParticles =  { "..." };

        Assertions.assertEquals(expectedParticles.length, animatedParticles.length);

        for (int i = 0; i < animatedParticles.length; i++) {
            Assertions.assertEquals(expectedParticles[i], animatedParticles[i]);
        }
    }

    @Test
    public void chamber5() {

        String testString = "LRRL.LR.LRR.R.LRRL.";
        LinearChamber linearChamber = new LinearChamber();

        System.out.println("Testing - 1, " + testString);

        String[] animatedParticles = linearChamber.animate(testString, 1);

        System.out.println("Result is:");
        Arrays.stream(animatedParticles).forEach(frame -> System.out.println(frame));
        System.out.println("==========================");

        String[] expectedParticles =  {
                "XXXX.XX.XXX.X.XXXX.",
                "..XXX..X..XX.X..XX.",
                ".X.XX.X.X..XX.XX.XX",
                "X.X.XX...X.XXXXX..X",
                ".X..XXX...X..XX.X..",
                "X..X..XX.X.XX.XX.X.",
                "..X....XX..XX..XX.X",
                ".X.....XXXX..X..XX.",
                "X.....X..XX...X..XX",
                ".....X..X.XX...X..X",
                "....X..X...XX...X..",
                "...X..X.....XX...X.",
                "..X..X.......XX...X",
                ".X..X.........XX...",
                "X..X...........XX..",
                "..X.............XX.",
                ".X...............XX",
                "X.................X",
                "..................." };

        Assertions.assertEquals(expectedParticles.length, animatedParticles.length);

        for (int i = 0; i < animatedParticles.length; i++) {
            Assertions.assertEquals(expectedParticles[i], animatedParticles[i]);
        }
    }
}

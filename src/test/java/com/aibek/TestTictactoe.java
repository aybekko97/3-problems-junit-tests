package com.aibek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTictactoe {
    @Test
    void testForNo0(){
        String[] input = {
                "XO..X.....",
                ".....OOOO.",
                "..........",
                "..........",
                "..........",
                "....XX...X",
                "..........",
                "..........",
                "..........",
                ".........."
        };
        Tictactoe t = new Tictactoe(input);
        assertEquals("NO", t.getAnswer());
    }

    @Test
    void testHorizontal(){
        String[] input = {
                "XX.XX.....",
                ".....OOOO.",
                "..........",
                "..........",
                "..........",
                "..........",
                "..........",
                "..........",
                "..........",
                ".........."
        };
        Tictactoe t = new Tictactoe(input);
        assertEquals("YES", t.getAnswer());
    }

    @Test
    void testForNo1(){
        String[] input = {
                "XX.....OOO",
                ".....OO.XO",
                ".......O.O",
                "..........",
                ".....XX.X.",
                "........X.",
                "...X......",
                "..........",
                "..........",
                ".........."
        };
        Tictactoe t = new Tictactoe(input);
        assertEquals("NO", t.getAnswer());
    }

    @Test
    void testVertical(){
        String[] input = {
                "XX.....OOO",
                ".X...OO.XO",
                ".X.....O.O",
                "........X.",
                "........X.",
                "........X.",
                "........X.",
                "........O.",
                "..........",
                ".........."
        };
        Tictactoe t = new Tictactoe(input);
        assertEquals("YES", t.getAnswer());
    }

    @Test
    void testForNo2(){
        String[] input = {
                "XX.XO.....",
                ".X...OOOO.",
                ".......OO.",
                "..........",
                "....X.....",
                ".....X....",
                "......X...",
                "..........",
                "..........",
                ".........."
        };
        Tictactoe t = new Tictactoe(input);
        assertEquals("NO", t.getAnswer());
    }

    @Test
    void testDiagonal(){
        String[] input = {
                "XX.XO.....",
                ".X...OOOO.",
                "..........",
                "..........",
                "....X.....",
                ".....X....",
                "......X...",
                ".......X..",
                "....O.....",
                ".....OO..."
        };
        Tictactoe t = new Tictactoe(input);
        assertEquals("YES", t.getAnswer());
    }

    @Test
    void testForNo3(){
        String[] input = {
                "XX.XO.....",
                ".X...OOOO.",
                ".......OOO",
                "......O...",
                "....X...X.",
                ".....O.O.X",
                "......X.X.",
                ".......X..",
                "....X.....",
                ".........."
        };
        Tictactoe t = new Tictactoe(input);
        assertEquals("NO", t.getAnswer());
    }

    @Test
    void testAntiDiagonal(){
        String[] input = {
                "XX.XO.....",
                ".X...OOOO.",
                "..........",
                "..........",
                "....X...X.",
                ".....O.X..",
                "......X...",
                ".......X..",
                "....X.....",
                "....O..OOO"
        };
        Tictactoe t = new Tictactoe(input);
        assertEquals("YES", t.getAnswer());
    }

    @Test
    void testForNo4(){
        String[] input = {
                "X.XOXOXOX.",
                ".X...OOOO.",
                "..XOXOXOX.",
                ".XOXOXOO..",
                ".XOXOXOX.X",
                "..X..O.X..",
                "..X...X...",
                "....OO.X..",
                ".O.XX...OO",
                "...X...OOO"
        };
        Tictactoe t = new Tictactoe(input);
        assertEquals("NO", t.getAnswer());
    }

    @Test
    void testAdditionalYes(){
        String[] input = {
                "X.XOXOXOX.",
                "OXO..OOOO.",
                "..XOXOXOX.",
                ".XOXOXOX..",
                ".XOXOXOX.X",
                "OOX..O.X..",
                "..X...X...",
                "OOO.OO.X..",
                ".O.XX.....",
                "...X......"
        };
        Tictactoe t = new Tictactoe(input);
        assertEquals("YES", t.getAnswer());
    }


    @Test
    void testOneXOneO(){
        String[] input = {
                "O.........",
                "..........",
                "..........",
                "..........",
                "..........",
                "..........",
                "..........",
                "..........",
                "..........",
                "...X......"
        };
        Tictactoe t = new Tictactoe(input);
        assertEquals("NO", t.getAnswer());
    }

    @Test
    void testMultipleAnswers(){
        String[] input = {
                "OOOO.XXXX.",
                "....O...X.",
                "....O.....",
                "..O.....X.",
                "..O..X..X.",
                "..O...X...",
                ".....XXXX.",
                "........X.",
                ".OOO..OOO.",
                "...X......"
        };
        Tictactoe t = new Tictactoe(input);
        assertEquals("YES", t.getAnswer());
    }
}
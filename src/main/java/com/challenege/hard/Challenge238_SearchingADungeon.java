package com.challenege.hard;

import java.awt.Point;
import java.io.File;

import javafx.geometry.Point3D;

/**
 * <b>Description</b> <br>
 * Our hero is lost in a dungeon. You will be given ASCII maps of a few floors, her starting
 * position, and her goal. On some floors there are holes in the ground/roof, so that you can move
 * between floors. Some only open one way, so going up doesn't guarantee that you can thereafter go
 * down. <br>
 * 
 * Your goal is to paint the path the hero takes in the dungeon to go from their starting position
 * to the goal. <br>
 * 
 * <br>
 * <br>
 * <b>Input Description <br>
 * There are a few characters used to build the ASCII map. <br>
 * '#' means wall. You cannot go here <br>
 * ' ' means empty. You can go here from adjacent positions on the same floor. <br>
 * 'S' means start. You start here <br>
 * 'G' means goal. You need to go here to find the treasure and complete the challenge! <br>
 * 'U' means up. You can go from floor 'n' to floor 'n+1' here. <br>
 * 'D' means down. You can go from floor 'n' to floor 'n-1' here. <br>
 * Your output is the same as the input, but with '*' used to paint the route. <br>
 * The route has to be the shortest possible route. <br>
 * Lower floors are printed below higher floors <br>
 * Example input: <br>
 * 
 * #####<br>
 * #S# #<br>
 * # # #<br>
 * #D#G#<br>
 * #####<br>
 * <br>
 * #####<br>
 * #  U#<br>
 * # ###<br>
 * #  ##<br>
 * #####<br>
 * 
 * <br>
 * <br>
 * <b>Output Description</b> <br>
 * 
 * Your program should emit the levels of the dungeon with the hero's path painted from start to
 * goal. <br>
 * 
 * Example output: <br>
 * 
 * #####<br>
 * #S#*#<br>
 * #*#*#<br>
 * #D#G#<br>
 * #####<br>
 * <br>
 * #####<br>
 * #**U#<br>
 * #*###<br>
 * #* ##<br>
 * #####<br>
 * <br>
 * (It doesn't matter whether you paint over U and D or not) <br>
 * 
 * <br>
 * <br>
 * <b>Challenge input</b> <br>
 * (if you want to, you may use the fact that these floors are all 10x10 in size, as well as there
 * being 4 floors, by either putting this at the top of your input file, or hardcoding it) <br>
 * 
 * SEE RESOURCE FILE "ChallengeInput238.txt"
 * 
 * @author Liam
 *
 */
public class Challenge238_SearchingADungeon
{

	public static void main(String[] args)
	{
		doChallenge("ChallengeInput238.txt");
	}

	private static void doChallenge(String fileLocation)
	{
	}

}

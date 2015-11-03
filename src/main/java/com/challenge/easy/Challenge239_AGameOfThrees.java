package com.challenge.easy;

/**
 * <b>Challenge Description</b> <br>
 * The input is a single number: the number at which the game starts. Write a program that plays the
 * Threes game, and outputs a valid sequence of steps you need to take to get to 1. Each step should
 * be output as the number you start at, followed by either -1 or 1 (if you are adding/subtracting 1
 * before dividing), or 0 (if you are just dividing). The last line should simply be 1. <br>
 * <br>
 * 
 * <b>Input Description</b>
 * 
 * The input is a single number: the number at which the game starts. <br>
 * 100 <br>
 * <br>
 * <b>Output Description</b>
 * 
 * The output is a list of valid steps that must be taken to play the game. Each step is represented
 * by the number you start at, followed by either -1 or 1 (if you are adding/subtracting 1 before
 * dividing), or 0 (if you are just dividing). The last line should simply be 1.
 * 
 * 100 -1 <br>
 * 33 0 <br>
 * 11 1 <br>
 * 4 -1 <br>
 * 1 <br>
 * 
 * <br>
 * <b>Challenge Input</b>
 * 
 * 31337357
 * 
 * @author Liam
 *
 */
public class Challenge239_AGameOfThrees
{
	public static void main(String[] args)
	{
		final int CHALLENGE_INPUT = 31337357;

		System.out.println("As a while loop: ");
		doChallenge(CHALLENGE_INPUT);
		System.out.println("--------------------------------------");
		System.out.println("As a recursive method: ");
		doChallengeAsRecursion(CHALLENGE_INPUT);
	}

	private static void doChallenge(int input)
	{
		while (input > 1)
		{
			StringBuilder sb = new StringBuilder();
			sb.append(input);
			int modulo = (int) (input % 3);
			switch (modulo)
			{
				case 1 :
					sb.append(" -1");
					input--;
					input /= 3;
					break;
				case 2 :
					sb.append(" +1");
					input++;
					input /= 3;
					break;
				default :
					sb.append(" 0");
					input /= 3;
					break;
			}
			System.out.println(sb.toString());

		}
		System.out.println(input);
	}

	private static void doChallengeAsRecursion(int challenge)
	{

		int modulo = challenge % 3;
		StringBuilder sb = new StringBuilder();
		sb.append(challenge);
		switch (modulo)
		{
			case 1 :
				sb.append(" -1");
				challenge--;
				challenge /= 3;
				break;
			case 2 :
				sb.append(" +1");
				challenge++;
				challenge /= 3;
				break;
			default :
				sb.append(" 0");
				challenge /= 3;
				break;
		}
		System.out.println(sb.toString());
		if (challenge > 1)
		{
			doChallengeAsRecursion(challenge);
		}
		else
		{
			System.out.println(challenge);
		}

	}
}

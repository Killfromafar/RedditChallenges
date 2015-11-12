package com.misc;

import java.math.BigInteger;
import java.util.ArrayList;

public class TotesJokes
{

	public static void main(String[] args)
	{
		int[] cypher = {78, 30, 105, 30, 108, 76, 64, 67, 11, 11, 102, 76, 64, 40, 105, 30, 76, 88, 67, 13, 76, 13, 96, 43, 78, 30, 105, 30, 108, 76, 64, 67,
				11, 11, 102, 76, 36, 30, 51, 76, 88, 67, 13, 76, 133, 67, 124, 11, 43, 78, 30, 105, 30, 108, 76, 64, 67, 11, 11, 102, 76, 108, 13, 11, 76, 102,
				108, 67, 13, 11, 133, 76, 102, 11, 133, 76, 133, 30, 136, 30, 108, 51, 76, 88, 67, 13, 43, 78, 30, 105, 30, 108, 76, 64, 67, 11, 11, 102, 76,
				21, 102, 61, 30, 76, 88, 67, 13, 76, 44, 108, 88, 43, 78, 30, 105, 30, 108, 76, 64, 67, 11, 11, 102, 76, 136, 102, 88, 76, 64, 67, 67, 133, 54,
				88, 30, 43, 78, 30, 105, 30, 108, 76, 64, 67, 11, 11, 102, 76, 51, 30, 36, 36, 76, 102, 76, 36, 40, 30, 76, 102, 11, 133, 76, 26, 13, 108, 51,
				76, 88, 67, 13};

		BigInteger d = new BigInteger("47");
		BigInteger n = new BigInteger("143");
		BigInteger[] buffer = toBigIntegerArray(cypher);

		for (int i = 0; i < buffer.length; i++)
		{
			buffer[i] = buffer[i].modPow(d, n);
		}

		String clearText = new String(toByteArray(buffer));
		System.out.println(clearText);
	}
	
	public static BigInteger[] toBigIntegerArray(int[] a) {

	    ArrayList<BigInteger> bigIntsList = new ArrayList<BigInteger>();

	    for(int i = 0; i < a.length; i++) {

	        bigIntsList.add(BigInteger.valueOf(a[i]));

	    }

	    BigInteger[] bigIntsArr = new BigInteger[bigIntsList.size()];
	    bigIntsArr = bigIntsList.toArray(bigIntsArr);

	    return bigIntsArr;

	}

	private static byte[] toByteArray(BigInteger[] a) {

	    byte[] b = new byte[a.length];

	    for(int i = 0; i < a.length; i++) {
	        b[i] = a[i].byteValue();
	    }

	    return b;

	}

}

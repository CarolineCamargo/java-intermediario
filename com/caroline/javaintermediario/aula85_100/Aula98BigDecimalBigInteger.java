package com.caroline.javaintermediario.aula85_100;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Aula98BigDecimalBigInteger {

	public static void main(String[] args) {

		double a = 0.03;
		double b = 0.04;
		double c = b - a;
		System.out.println(c);

		BigDecimal d = new BigDecimal("0.03");
		BigDecimal e = new BigDecimal("0.04");
		BigDecimal f = e.subtract(d);
		System.out.println(f);

		BigDecimal bd1 = new BigDecimal("1234567890.0987654321");
		BigDecimal bd2 = new BigDecimal("987654321.9876543210");
		System.out.println(bd1.add(bd2));
		System.out.println(bd1.multiply(bd2));
		System.out.println(bd1.divide(new BigDecimal(2)));

		BigInteger bi = new BigInteger("10000000000000000000");
		System.out.println(bi);
	}
}

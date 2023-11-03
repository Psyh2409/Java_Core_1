package com.gmail.psyh2409;

public class HomeWork1 {
	public static void main(String[] args) {

		primitivesDemo();

		int[] intArr = arrIntMaker(10);
		System.out.print("In array ");
		arrPrinter(intArr);
		arrSorter(intArr);
		System.out.print("max value is " + intArr[intArr.length - 1] + " and min value is " + intArr[0] + ".");
	}

	public static void primitivesDemo() {
		byte b = 5;
		short s = 128;
		int i = 100500;
		long l = 3_000_000_000L;
		double d = Math.PI;
		float f = 3.14f;
		char c = 'c';
		boolean bln = true;
		System.out.println("byte (from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ") - " + b + ";\n"
				+ "short (from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ") - " + s + ";\n" + "int (from "
				+ Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ") - " + i + ";\n" + "long (from " + Long.MIN_VALUE
				+ " to " + Long.MAX_VALUE + ") - " + l + ";\n" + "double (from " + Double.MIN_VALUE + " to "
				+ 1.7976931348623157 * (Math.pow(10, 308)) + ") - " + d + ";\n" + "float (from " + Float.MIN_VALUE
				+ " to " + Float.MAX_VALUE + ") - " + f + ";\n" + "char (from " + Character.MIN_VALUE + "("
				+ (int) Character.MIN_VALUE + ") to " + Character.MAX_VALUE + "(" + (int) Character.MAX_VALUE + ")) - "
				+ c + "(" + (int) c + ");\n" + "boolean - " + bln + " or " + !bln + ";\n");
	}

	public static void arrSorter(int[] intArr) {
		int length = intArr.length;
		int temp;
		for (int x = 0; x < length - 1; x++) {
			if (intArr[x] > intArr[x + 1]) {
				temp = intArr[x];
				intArr[x] = intArr[x + 1];
				intArr[x + 1] = temp;
			}
			if (x == length - 2) {
				x = -1;
				length = length - 1;
			}
		}
	}

	public static void arrPrinter(int[] intArr) {
		System.out.print('[');
		boolean bool = true;
		for (int in : intArr) {
			if (bool) {
				System.out.print(in);
				bool = false;
			} else {
				System.out.print("; " + in);
			}
		}
		System.out.println(']');
	}

	public static int[] arrIntMaker(int i) {
		int[] intArr = new int[i];
		for (int x = 0; x < intArr.length; x++) {
			intArr[x] = (int) (100 * Math.random());
		}
		return intArr;
	}
}

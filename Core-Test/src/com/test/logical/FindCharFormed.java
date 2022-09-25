package com.test.logical;

public class FindCharFormed {

	public static void main(String[] args) {

		String input1 = "Ok kite Hello elephent Empyee tabrej";
		String input2 = "fdf ggf jkjkjk asas rerer";
		System.out.println(isFormedString(input1));
		System.out.println(isFormedString(input2));
	}

	private static boolean isFormedString(String input) {
		boolean flag = false;
		String[] stringArray = input.split(" ");
		for (int i = 0; i < stringArray.length-1; i++) {
			flag = false;

			char[] curentWord = stringArray[i].toCharArray();
			for (int j = 0; j < stringArray.length; j++) {
				char[] previousWord = stringArray[j].toCharArray();
				if (i !=j && String.valueOf(curentWord[curentWord.length - 1])
						.equalsIgnoreCase(String.valueOf(previousWord[0]))) {
					j = stringArray.length;
					flag = true;
				}
			}

		}

		return flag;
	}

}

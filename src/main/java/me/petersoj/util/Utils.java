package me.petersoj.util;

import java.util.concurrent.ThreadLocalRandom;

public class Utils {

	public static int getRandomInt(int min, int max){
		return ThreadLocalRandom.current().nextInt(min, max);
	}
}
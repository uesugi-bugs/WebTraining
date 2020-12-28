package model;

import java.util.Random;

public class HeroBirth {
	public void birth(Hero hero){
		String name  = hero.getName();

		int seed=0;
		for(int i=0;i<name.length();i++){
		  seed+=name.charAt(i);
		}

		int[] maxArr = {100,100,50,50,50};
		int[] vals = new int[maxArr.length];
		Random rand = new Random(seed);
		for(int i=0;i<vals.length;i++) {
			vals[i]= rand.nextInt(maxArr[i])+1;
		}

		hero.setVals(vals);

	}

}

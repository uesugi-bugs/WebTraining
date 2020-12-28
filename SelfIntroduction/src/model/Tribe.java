package model;

public class Tribe {
	public int[] SetTribe(Hero hero){
		String tribe = hero.getTribe();
		int[] vals = hero.getVals();
		String[] races = hero.getRaces();

		int[][] raceMatrix={
				{10,10,10,10,10},
				{0,20,0,10,20},
				{30,0,20,0,0},
				{10,0,0,25,20},
		};


		for(int i=0;i<races.length;i++) {
			if(races[i].equals(tribe)) {
				for(int j=0;j<vals.length;j++) {
					vals[j] = (int)(vals[j] + raceMatrix[i][j]);
				}
			}
		}

		return vals;


	}

}

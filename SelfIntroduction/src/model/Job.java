package model;

public class Job {
	public int[] job(Hero hero){
		String job = hero.getJob();
		int[] vals = hero.getVals();
		String[] classes = hero.getClasses();

		double[][] jobMatrix={
				{1.6,1,1.4,1,1},
				{1.1,1,1.2,1.3,1.3},
				{1.3,1.5,1.1,1,1},
				{1,1.9,1,1,1.1},
			};

		for(int i=0;i<classes.length;i++) {
			if(classes[i].equals(job)) {
				for(int j=0;j<vals.length;j++) {
					vals[j] = (int)(vals[j] * jobMatrix[i][j]);
				}
			}
		}

		return vals;

	}

}

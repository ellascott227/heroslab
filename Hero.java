
public class Hero implements HeroInterface{
	private Race race;
	private Job job;

	public Hero(Race race1, Job job1) {
		this.race = race1;
		this.job = job1;
	}

	@Override
	public int attack(int val) {
		return job.getAttack(val, this);
	}

	@Override
	public int getSTR() {
		return race.getSTR();
	}

	@Override
	public int getDEX() {
		return race.getDEX();
	}

	@Override
	public int getINT() {
		return race.getINT();
	}

	@Override
	public String getRaceName() {
		String raceString = String.format("%s", race);
		return raceString;
	}

	@Override
	public String getJobName() {
		String jobString = String.format("%s", job);
		return jobString;
	}

}

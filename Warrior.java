
public class Warrior extends Job {
	@Override
	public int getAttack(int val, Hero hero) {
		return hero.getSTR()*val + hero.getDEX();
	}

}

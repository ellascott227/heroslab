
public class Archer extends Job {
	@Override
	public int getAttack(int val, Hero hero) {
		return (int) (hero.getDEX()*1.5*val);
	}
}

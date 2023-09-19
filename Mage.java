
public class Mage extends Job {
	@Override
	public int getAttack(int val, Hero hero) {
		return hero.getDEX()+ hero.getINT()*val;
	}

}

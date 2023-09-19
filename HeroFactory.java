public class HeroFactory
{


   public static HeroInterface createHero(String raceName, String jobName)   
   {
	   Race race1;
	   Job job1;
	   Hero hero1;
	   
	   race1 = null;
	   job1 = null;
	   
	   if(raceName.equals("DWARF")) {
		   race1 = new Dwarf();
	   }
	   
	   if(raceName.equals("ELF")) {
		   race1 = new Elf();
	   }
	   
	   if(raceName.equals("ROBOT")) {
		   race1 = new Robot();
	   }
	   
	   if(jobName.equals("WARRIOR")) {
		   job1 = new Warrior();
	   }
	   
	   if(jobName.equals("ARCHER")) {
		   job1 = new Archer();
	   }
	   
	   if(jobName.equals("MAGE")) {
		   job1 = new Mage();
	   }
	   
	   if(job1 == null || race1 == null) {
		   hero1 = null;
	   }
	   else {
		   hero1 = new Hero(race1, job1);
	   }
	   
	   return hero1;
   }

   





}
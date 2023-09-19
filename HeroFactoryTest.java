import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HeroFactoryTest {
	
	HeroInterface hero1;
	HeroInterface hero2; 
	HeroInterface hero3; 
	HeroInterface hero4; 
	HeroInterface hero5; 
	HeroInterface hero6; 
	
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void testCreateDwarfWarrior() {
		hero1 = HeroFactory.createHero("DWARF", "WARRIOR");
		
		assertEquals("DWARF", hero1.getRaceName());
		assertEquals("WARRIOR", hero1.getJobName());
		
		assertEquals(20, hero1.getDEX());
		assertEquals(20, hero1.getINT());
		assertEquals(25, hero1.getSTR());
		
		assertEquals(45, hero1.attack(1));
		assertEquals(145, hero1.attack(5));
		
		
		//fail("Not yet implemented");
	}
	
	@Test
	void testCreateElfArcher() {
		hero1 = HeroFactory.createHero("ELF", "ARCHER");
		
		assertEquals("ELF", hero1.getRaceName());
		assertEquals("ARCHER", hero1.getJobName());
		
		assertEquals(25, hero1.getDEX());
		assertEquals(20, hero1.getINT());
		assertEquals(20, hero1.getSTR());
		
		assertEquals(37, hero1.attack(1));
		assertEquals(187, hero1.attack(5));
		
	}
	
	@Test
	void testCreateRobotMage() {
		hero1 = HeroFactory.createHero("ROBOT", "MAGE");
		
		assertEquals("ROBOT", hero1.getRaceName());
		assertEquals("MAGE", hero1.getJobName());
		
		assertEquals(20, hero1.getDEX());
		assertEquals(25, hero1.getINT());
		assertEquals(20, hero1.getSTR());
		
		assertEquals(45, hero1.attack(1));
		assertEquals(145, hero1.attack(5));
		
	}
	
	@Test
	void testOtherNames() {
		hero1 = HeroFactory.createHero("DWARF", "ARCHER");
		assertEquals("DWARF", hero1.getRaceName());
		assertEquals("ARCHER", hero1.getJobName());
		
		hero2 = HeroFactory.createHero("DWARF", "MAGE");
		assertEquals("DWARF", hero2.getRaceName());
		assertEquals("MAGE", hero2.getJobName());
		
		hero3 = HeroFactory.createHero("ELF", "WARRIOR");
		assertEquals("ELF", hero3.getRaceName());
		assertEquals("WARRIOR", hero3.getJobName());
		
		hero4 = HeroFactory.createHero("ELF", "MAGE");
		assertEquals("ELF", hero4.getRaceName());
		assertEquals("MAGE", hero4.getJobName());
		
		hero5 = HeroFactory.createHero("ROBOT", "WARRIOR");
		assertEquals("ROBOT", hero5.getRaceName());
		assertEquals("WARRIOR", hero5.getJobName());
		
		hero6 = HeroFactory.createHero("ROBOT", "ARCHER");
		assertEquals("ROBOT", hero6.getRaceName());
		assertEquals("ARCHER", hero6.getJobName());
		
	}
	
	@Test
	void testInvalidInputs() {
		hero1 = HeroFactory.createHero("RANDOM", "THINGS");
		assertNull(hero1);
		
		hero2 = HeroFactory.createHero("ELF", "THINGS");
		assertNull(hero2);
		
		hero3 = HeroFactory.createHero("RANDOM", "MAGE");
		assertNull(hero3);
	}

}

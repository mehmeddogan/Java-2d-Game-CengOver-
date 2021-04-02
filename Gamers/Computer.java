package Gamers;

import Units.*;

public class Computer extends Gamer{

	public Computer(Object[][] map, int level)
	{
		if(level == 1)
		{
			villagers = new Villager[4];
			foots = new Foot[4];
			archers = new Archer[4];
			//base
		}
		else if(level == 2)
		{
			villagers = new Villager[8];
			foots = new Foot[8];
			archers = new Archer[8];
			//base
		}
		//...
	}
	
	public Object[][] InitializeGamer(Object[][] map)
	{
		//
		return map;
	}
	
}

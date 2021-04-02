package Gamers;

import Auxiliary.Coordinate;
import Buildings.Base;
import Units.*;

public class Player extends Gamer{

	protected final int INIT_POP = 3;
	
	public Player()
	{
		villagers = new Villager[4];
		foots = new Foot[4];
		archers = new Archer[4];
		base = new Base('P', new Coordinate(0, 0));		
	}
	
	public Object[][] InitializeGamer(Object[][] map)
	{
		int baseX, baseY, x, y, i = 0;
		double chance;
		double distance;
		do
		{
			baseX = (int)(Math.random() * 10);
			baseY = (int)(Math.random() * 10);
		}while(map[baseX][baseY] != null);
		
		base.SetCoordinate(new Coordinate(baseX, baseY));
		map[baseX][baseY] = base;
		
		x = baseX;
		y = baseY;
		
		while(i < INIT_POP)
		{
			if(x < map.length && y < map[0].length)
			{
				distance = Math.sqrt(Math.pow((baseX - x), 2) + Math.pow((baseY - y), 2));
				if(distance < 3)
				{
					if(map[x][y] == null)
					{
						if(i == 0)
						{
							villagers[0] = new Villager(1, new Coordinate(x, y), 'P');
							map[x][y] = villagers[0]; 
						}
						else if(i == 1)
						{
							foots[0] = new Foot(1, new Coordinate(x, y), 'P');
							map[x][y] = foots[0]; 
						}
						else if(i == 2)
						{
							archers[0] = new Archer(1, new Coordinate(x, y), 'P');
							map[x][y] = archers[0]; 
						}
						i++;
					}
				}
			}
			chance = Math.random();
			if (chance < 0.5)
			{
				x++;
			}
			else
			{
				y++;
			}
		}
		
		
		
		return map;
	}
	

	public int GetInitPop()
	{
		return INIT_POP;
	}
	
}

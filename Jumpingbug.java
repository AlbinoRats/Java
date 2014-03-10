// name: david yin, qiyuan chen

import info.gridworld.world.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
import java.awt.Color;

public class JumpBug extends Bug
{
public JumpBug()
{
setColor(Color.RED);
}


public JumpBug(Color bugColor)
{
setColor(bugColor);
}

public void act()
{
if (canMove())
move();
else
turn();
}

public void turn()
{
setDirection(getDirection() + Location.HALF_RIGHT);
}

public void move()
{
Grid<Actor> gr = getGrid();
if (gr == null)
return;

Location loc = getLocation();

Location next = loc.getAdjacentLocation(getDirection());
Location next2 = next.getAdjacentLocation(getDirection());
Actor neighbor = gr.get(next);
Actor neighbor2= gr.get(next2);
if(neighbor instanceof Bug á|| neighbor instanceof Rock){
	if(gr.isValid(next2)){
	moveTo(next2);
//removeSelfFromGrid();
Flower flower = new Flower(getColor());
flower.putSelfInGrid(gr, loc);
	}
	}
else
removeSelfFromGrid();
Flower flower = new Flower(getColor());
flower.putSelfInGrid(gr, loc);
}

public boolean canMove()
{
Grid<Actor> gr = getGrid();
if (gr == null)
return false;

Location loc = getLocation();

Location next = loc.getAdjacentLocation(getDirection());
Location next2 = next.getAdjacentLocation(getDirection());
if (!gr.isValid(next))
return false;
else if(gr.isValid(next2))
	return true;
Actor neighbor = gr.get(next);
return (neighbor == null) || (neighbor instanceof Flower);á
// ok to move into empty location or onto flower
// not ok to move onto any other actor
}
}
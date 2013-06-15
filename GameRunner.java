import info.gridworld.grid.*;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import info.gridworld.world.World;
import info.gridworld.actor.ActorWorld;
import java.awt.*;

/**
 * Write a description of class GridBounded here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameGridRunner
{
public static void main(String[]args)
{
World GameWorld=new World();
GameWorld.setGrid(new BoundedGrid<Integer>(10,10)); //makes a 10 x 10 grid
GameWorld.setMessage("Welcome to Hell."); //can be used for directions
GameWorld.show();
System.setProperty("info.gridworld.gui.watermark", "hide"); //hides the version watermark
GameWorld.add(new Location(0,0), new robot()); //adds a Gizmo at (0,0)



}
}

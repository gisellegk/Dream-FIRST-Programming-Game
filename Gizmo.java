import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class Gizmo extends Actor
{
    private int commandCounter;
    private int stepCounter;
    private ArrayList<Button> message;

    public Gizmo(Message m)
    {
        super();
        setColor(null);
        commandCounter = 0;
        stepCounter = 0;
        message = m.getMessage();
    }
    
    private void messageReader(int current)
    {
        if(current == 0) goForward();
        else if(current == 1) turnLeft();
        else if(current == 2) turnRight();
        else if(current == 3) goForwardUntil();  
    }
    
    private boolean sensorChecker(Button e)
    {
        boolean end = false;
        if(e.getCommand() == 4) end = wallSensor();
        else if(e.getCommand() == 5) end = stepCounter(e);
        return end;
    }

    public void act()
    {
        if(commandCounter < message.size())
        {
            //<derp> hi i know how to code </derp>
            System.out.println("Step Count: " + stepCounter + ", Command Count: " + commandCounter);
            int current = message.get(commandCounter).getCommand();
            messageReader(current);
            commandCounter++;
        }
        else System.out.println("Step Count: " + stepCounter + ", Command Count: " + commandCounter);
    }
    
    public void goForward()
    {
        System.out.println("Go Forward"); // tell Gizmo to walk forward.
        Location location = getLocation().getAdjacentLocation(getDirection());
        if(getGrid().isValid(location)) moveTo(location);
        stepCounter++;
    }
    
    public void turnRight()
    {
        System.out.println("Turn Right"); // tell Gizmo to turn right
        setDirection(getDirection() + 90);
    }
    
    public void turnLeft()
    {
        System.out.println("Turn Left"); // tell Gizmo to turn left
        setDirection(getDirection() - 90);
    }
    
    public void goForwardUntil()
    {
        System.out.println("Go forward until");
        WhileButton until = (WhileButton)message.get(commandCounter);
        if(!until.isEndSet()) 
        {
            System.out.println("Error. Please set end of loop.");
            return;
        }
        Button end = until.getEnd();
        if(!sensorChecker(end))
        {
            System.out.print("     ");
            goForward();
            commandCounter--;
        }
        else
        {
            System.out.println("End");
        }
    }
    
    public boolean wallSensor()
    {
        System.out.println("Wall Sensor Checked");
        Grid gr = getGrid();
        Location check = getLocation().getAdjacentLocation(getDirection());
        if(!gr.isValid(check)) return true;
        else if(gr.get(check) == null) return false; // Look in location adjacent to Gizmo using its direction. If there is nothing in front of Gizmo, keep going.
        else return true;
    }
    
    public boolean stepCounter(Button e)
    {
        System.out.println("Step Counter Checked");
        StepCounterButton step = (StepCounterButton)e;
        if(step.getValue() == stepCounter) return true;
        else return false;
    }
    
}
    /*public void whileButton()
    {
        System.out.println("Go forward until");
        WhileButton until = (WhileButton)message.get(stepCounter);
        if(!until.isEndSet()) return;
        
        ArrayList<Button> loop = until.getLoop().getMessage();
        int stepCount = 0;
        while(stepCount < loop.size())
        {
            int current = loop.get(stepCount).getCommand();
            System.out.print("    ");
            messageReader(current);
            stepCount++;
        }
        int end = until.getEnd().getCommand();
        System.out.print("End ");
        messageReader(end);
    }*/

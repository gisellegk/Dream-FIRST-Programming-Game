
public class WhileButton extends Button
{
    private Button end;
    private boolean endIsSet;
    
    public WhileButton() //go forward until
    {
        super(3);
        end = null;
        endIsSet = false;
    }

    private boolean canSetAsEnd(Button button)
    {
        if(button.getCommand() > 3) return true;
        else return false;
    }
    public void setEnd(Button button)
    {
        if(canSetAsEnd(button))
        {
            end = button;
            endIsSet = true;
        }
        else System.out.println("Please choose either Wall Sensor or Step Counter");
    }
    
    public boolean isEndSet()
    {
        return endIsSet;
    }
    public Button getEnd()
    {
        return end;
    }
}

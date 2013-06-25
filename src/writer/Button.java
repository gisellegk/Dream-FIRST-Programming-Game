package writer;
public class Button
{
    /* int command
     * 0 = go forward one
     * 1 = turn left
     * 2 = turn right
     * 3 = go forward until... (while)
     * 4 = wall sensor
     * 5 = step counter */    
    private int command;
    
    public Button(int c)
    {
        command = c;
    }
    public int getCommand()
    {
        return command;
    }
}

package writer;
import java.util.Scanner;

public class OldMessageWriter
{
    private Scanner in;
    private Message message;
    
    public OldMessageWriter()
    {
        in = new Scanner(System.in);
        message = new Message();
    }
    public OldMessageWriter(int[] commands)
    {
        message = new Message();
        for(int i = 0; i < commands.length; i++)
        {
            message.add(commands[i]);
        }
    }
    
    public Message getMessage()
    {
        return message;
    }
    public void write()
    {
        int command = in.nextInt();
        message.add(command);
    }
    public void erase()
    {
        int position = in.nextInt();
        message.remove(position);
    }
    public void clearAll()
    {
        message.clearMessage();
    }
}

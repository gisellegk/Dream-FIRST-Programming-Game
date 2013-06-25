package writer;
import java.util.ArrayList;

public class Message
{
    // instance variables - replace the example below with your own
    private ArrayList<Button> message;

    public Message()
    {
        message = new ArrayList<Button>();
    }

    public void add(Button button)
    {
        message.add(button);
    }
    public void add(int button)
    {
        message.add(new Button(button));
    }
    public void remove(int position)
    {
        message.remove(position);
    }
    public void clearMessage()
    {
        message.clear();
    }
    public ArrayList<Button> getMessage()
    {
        return message;
    }
}

package writer;
public class StepCounterButton extends Button
{
    int value;
    public StepCounterButton(int v)
    {
        super(5);
        value = v;
    }

    public int getValue()
    {
        return value;
    }
    public void changeValue(int n)
    {
        value = n;
    }
}

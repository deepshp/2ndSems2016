package ObserableList_tutorialPoints;

//import  java.util.Observer;
/**
 * Created by shk123 on 3/2/16.
 */
public class BinaryObserver extends  Observer
{
    public BinaryObserver(Subject subject)
    {
        this.subject = subject;
        this.subject.attach((java.util.Observer) this);
    }
    @Override
    public void update()
    {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }

}

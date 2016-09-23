package Observer_pattern_tutorialspoint;

/**
 * Created by shk123 on 3/2/16.
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {

    }
}

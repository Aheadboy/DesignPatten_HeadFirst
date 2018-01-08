package UncleBob.first;


public class Sender {
    private Receiver receiver;

    public Sender(Receiver r) {
        receiver = r;
    }

    public void doSomething() {
        receiver.receiveThis();
    }

    public interface Receiver {
        void receiveThis();
    }
}

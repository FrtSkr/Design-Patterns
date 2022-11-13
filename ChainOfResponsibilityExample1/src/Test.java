import java.util.Random;

public abstract class Test {
    private Test nextTest;
    private boolean isTest;

    public void setNextTest(Test nestTest) {
        this.nextTest = nestTest;
    }

    public Test getNextTest() {
        return nextTest;
    }

    public boolean isTest() {
        return isTest;
    }

    public void setTest(boolean test) {
        isTest = test;
    }

    public abstract void handle();

    protected boolean Do(){
        Random random = new Random();
        boolean luck = random.nextBoolean();
        return luck;

    }
}

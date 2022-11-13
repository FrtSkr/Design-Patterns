public class Main {

    public static void main(String[] args) {
        Test test1 = new Test1();
        Test test2 = new Test2();
        Test test3 = new Test3();

        test1.setNextTest(test2);
        test2.setNextTest(test3);

        test1.handle();

    }
}

import java.util.Random;

public class Test2 extends Test {
    @Override
    public void handle() {
        //Test için ayrı fonksiyon yazılır ve oradan dönen değere göre isTest metodu setlenir. Zincir de buna göre hareket eder.
        // ya da handler metodunda test gerçekleşir ve işleme göre isTest setlenir sonra kontrol yapılır ve zincir buna göre hareket eder.
        setTest(Do());
        if (isTest()){
            System.out.println("TEST2: "+isTest());
            getNextTest().handle();
        }else{
            System.out.println("TEST2: "+isTest());
        }
    }


}

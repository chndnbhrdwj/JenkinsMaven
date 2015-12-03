import org.junit.*;

/**
 * Created by cku04 on 03/12/2015.
 */
public class TestJenkins {

    @BeforeClass
    public static void beforeClassMethod() {
        System.out.println("In a before class");
    }

    @AfterClass
    public static void afterClassMethod() {
        System.out.println("In a after class");
    }

    @Before
    public void beforeMethod(){
        System.out.println("In a before method");
    }

    @After
    public void afterMethod(){
        System.out.println("In a after method");
    }

    @Test
    public void test1(){
        System.out.println("In a test1");
    }

    @Test
    public void test2(){
        System.out.println("In a test2");
    }

    @Test
    public void test3(){
        System.out.println("In a test3");
    }

    @Test
    public void test4(){
        System.out.println("In a test4");
    }

}

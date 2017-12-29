import org.junit.Test;

import static org.junit.Assert.*;

public class letterGrade_EPTest {

    @Test
    public void letterGrade_test1() throws Exception {
        char c = letterGrade.letterGrade(-6);
        System.out.println("equivalence partitioning testing (1) : " + c);
    }

    @Test
    public void letterGrade_test2() throws Exception {
        char c = letterGrade.letterGrade(206);
        System.out.println("equivalence partitioning testing (2) : " + c);
    }

    @Test
    public void letterGrade_test3() throws Exception {
        char c = letterGrade.letterGrade(95);
        System.out.println("equivalence partitioning testing (3) : " + c);
    }

    @Test
    public void letterGrade_test4() throws Exception {
        char c = letterGrade.letterGrade(88);
        System.out.println("equivalence partitioning testing (4) : " + c);
    }

    @Test
    public void letterGrade_test5() throws Exception {
        char c = letterGrade.letterGrade(73);
        System.out.println("equivalence partitioning testing (5) : " + c);
    }

    @Test
    public void letterGrade_test6() throws Exception {
        char c = letterGrade.letterGrade(64);
        System.out.println("equivalence partitioning testing (6) : " + c);
    }

    @Test
    public void letterGrade_test7() throws Exception {
        char c = letterGrade.letterGrade(43);
        System.out.println("equivalence partitioning testing (7) : " + c);
    }
}
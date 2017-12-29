import org.junit.Test;

import static org.junit.Assert.*;

public class letterGrade_BVATest {

    @Test
    public void letterGrade_test1() throws Exception {
        char c = letterGrade.letterGrade(-1);
        System.out.println("boundary value analysis testing (1) : " + c);
    }

    @Test
    public void letterGrade_test2() throws Exception {
        char c = letterGrade.letterGrade(0);
        System.out.println("boundary value analysis testing (2) : " + c);
    }

    @Test
    public void letterGrade_test3() throws Exception {
        char c = letterGrade.letterGrade(1);
        System.out.println("boundary value analysis testing (3) : " + c);
    }

    @Test
    public void letterGrade_test4() throws Exception {
        char c = letterGrade.letterGrade(59);
        System.out.println("boundary value analysis testing (4) : " + c);
    }

    @Test
    public void letterGrade_test5() throws Exception {
        char c = letterGrade.letterGrade(60);
        System.out.println("boundary value analysis testing (5) : " + c);
    }

    @Test
    public void letterGrade_test6() throws Exception {
        char c = letterGrade.letterGrade(61);
        System.out.println("boundary value analysis testing (6) : " + c);
    }

    @Test
    public void letterGrade_test7() throws Exception {
        char c = letterGrade.letterGrade(69);
        System.out.println("boundary value analysis testing (7) : " + c);
    }

    @Test
    public void letterGrade_test8() throws Exception {
        char c = letterGrade.letterGrade(70);
        System.out.println("boundary value analysis testing (8) : " + c);
    }

    @Test
    public void letterGrade_test9() throws Exception {
        char c = letterGrade.letterGrade(71);
        System.out.println("boundary value analysis testing (9) : " + c);
    }

    @Test
    public void letterGrade_test10() throws Exception {
        char c = letterGrade.letterGrade(79);
        System.out.println("boundary value analysis testing (10) : " + c);
    }

    @Test
    public void letterGrade_test11() throws Exception {
        char c = letterGrade.letterGrade(80);
        System.out.println("boundary value analysis testing (11) : " + c);
    }

    @Test
    public void letterGrade_test12() throws Exception {
        char c = letterGrade.letterGrade(81);
        System.out.println("boundary value analysis testing (12) : " + c);
    }

    @Test
    public void letterGrade_test13() throws Exception {
        char c = letterGrade.letterGrade(89);
        System.out.println("boundary value analysis testing (13) : " + c);
    }

    @Test
    public void letterGrade_test14() throws Exception {
        char c = letterGrade.letterGrade(90);
        System.out.println("boundary value analysis testing (14) : " + c);
    }

    @Test
    public void letterGrade_test15() throws Exception {
        char c = letterGrade.letterGrade(91);
        System.out.println("boundary value analysis testing (15) : " + c);
    }

    @Test
    public void letterGrade_test16() throws Exception {
        char c = letterGrade.letterGrade(99);
        System.out.println("boundary value analysis testing (16) : " + c);
    }

    @Test
    public void letterGrade_test17() throws Exception {
        char c = letterGrade.letterGrade(100);
        System.out.println("boundary value analysis testing (17) : " + c);
    }

    @Test
    public void letterGrade_test18() throws Exception {
        char c = letterGrade.letterGrade(101);
        System.out.println("boundary value analysis testing (18) : " + c);
    }


}
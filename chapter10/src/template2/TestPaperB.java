package template2;

/**
 * 学生乙抄的试卷
 *
 * @author kai
 */
public class TestPaperB extends TestPaper {
    // 试题1
    @Override
    public void testQuestion1() {
        super.testQuestion1();
        System.out.println("答案：d");
    }

    // 试题2
    @Override
    public void testQuestion2() {
        super.testQuestion2();
        System.out.println("答案：b");
    }

    // 试题3
    @Override
    public void testQuestion3() {
        super.testQuestion3();
        System.out.println("答案：a");
    }
}

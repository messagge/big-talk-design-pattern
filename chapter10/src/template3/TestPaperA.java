package template3;

/**
 * 学生甲抄的试卷
 *
 * @author kai
 */
public class TestPaperA extends TestPaper {
    @Override
    protected String answer1() {
        return "b";
    }

    @Override
    protected String answer2() {
        return "a";
    }

    @Override
    protected String answer3() {
        return "c";
    }
}

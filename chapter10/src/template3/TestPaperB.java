package template3;

/**
 * 学生乙抄的试卷
 *
 * @author kai
 */
public class TestPaperB extends TestPaper {

    @Override
    protected String answer1() {
        return "d";
    }

    @Override
    protected String answer2() {
        return "b";
    }

    @Override
    protected String answer3() {
        return "a";
    }
}

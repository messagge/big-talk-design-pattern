package prototype4;

/**
 * 工作经历类
 *
 * @author kai
 */
public class WorkExperience implements Cloneable {

    // 工作时间范围
    private String timeArea;
    // 所在公司
    private String company;

    public String getTimeArea() {
        return this.timeArea;
    }

    public void setTimeArea(String value) {
        this.timeArea = value;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String value) {
        this.company = value;
    }

    @Override
    public WorkExperience clone() throws CloneNotSupportedException {
        WorkExperience object = null;
        try {
            object = (WorkExperience) super.clone();
        } catch (CloneNotSupportedException exception) {
            System.err.println("Clone异常。");
        }
        return object;
    }
}

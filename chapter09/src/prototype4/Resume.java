package prototype4;

/**
 * 简历类
 *
 * @author kai
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        // 对这个工作经历对象实例化
        this.work = new WorkExperience();
    }

    // 设置个人信息
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    // 设置工作经历
    public void setWorkExperience(String timeArea, String company) {
        // 给工作经历实例的时间范围赋值
        this.work.setTimeArea(timeArea);
        // 给工作经历实例的公司赋值
        this.work.setCompany(company);
    }

    // 展示简历
    public void display() {
        System.out.println(this.name + " " + this.sex + " " + this.age);
        System.out.println("工作经历 " + this.work.getTimeArea() + " " + this.work.getCompany());
    }

    @Override
    public Resume clone() {
        Resume resume = null;
        try {
            resume = (Resume) super.clone();
            // 克隆 WorkExperience
            // 对克隆对象里的引用也进行克隆，即达到了深克隆的目的
            resume.work = this.work.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Clone异常。");
        }
        return resume;
    }
}

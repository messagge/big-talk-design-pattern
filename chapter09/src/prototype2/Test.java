package prototype2;

public class Test {

    public static void main(String[] args) {

        System.out.println("**********************************************");
        System.out.println("《大话设计模式》代码样例");
        System.out.println();

        Resume resume1 = new Resume("大鸟");
        resume1.setPersonalInfo("男", "29");
        resume1.setWorkExperience("1998-2000", "XX公司");

        Resume resume2 = resume1;

        Resume resume3 = resume1;

        resume1.display();
        resume2.display();
        resume3.display();

        System.out.println();
        System.out.println("**********************************************");

    }
}

package proxy3;

// 追求者类
public class Pursuit implements IGiveGift {

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(this.mm.getName() + "，你好！送你洋娃娃。");
    }

    @Override
    public void giveFlowers() {
        System.out.println(this.mm.getName() + "，你好！送你鲜花。");
    }

    @Override
    public void giveChocolate() {
        System.out.println(this.mm.getName() + "，你好！送你巧克力。");
    }
}

package proxy3;

// 代理类
public class Proxy implements IGiveGift{

    private Pursuit gg;				// 认识追求者

    public Proxy(SchoolGirl mm){	// 也认识被追求者
        // 代理初始化的过程，实际是追求者初始化的过程
        this.gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls(){		// 代理在送礼物
        this.gg.giveDolls();		// 实质是追求者在送礼物
    }

    @Override
    public void giveFlowers(){
        this.gg.giveFlowers();
    }

    @Override
    public void giveChocolate(){
        this.gg.giveChocolate();
    }
}

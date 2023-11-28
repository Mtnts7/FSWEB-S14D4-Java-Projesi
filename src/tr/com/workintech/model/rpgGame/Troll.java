package tr.com.workintech.model.rpgGame;

public class Troll extends Monster implements Bleedable,Posinable{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    double attack() {
        return getDamage()+bleed()+poison();
    }

    @Override
    public double bleed() {
        return super.getDamage()*0.25;//superin methodu olduğu için super yazılabilir , child de benzer method yoksa direkt yazılabilir.
    }

    @Override
    public double poison() {
        return super.getDamage()*0.3;

    }
}

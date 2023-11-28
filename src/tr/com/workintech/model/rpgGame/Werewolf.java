package tr.com.workintech.model.rpgGame;

public class Werewolf extends Monster implements Posinable,Bleedable{
    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    double attack() {
        return getDamage()+bleed()+poison();
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double poison() {
        return getDamage()*0.3;
    }
}

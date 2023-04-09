import java.util.Random;

public abstract class Warrior<T extends Weapon> extends Personage implements Shieldable{
protected static Random rnd = new Random();
private Shield shield = NullShield.getInstance();
    protected T weapon;
    public Warrior(String name, int hp, T weapon, Shield shield) {
        super(name, hp);
        this.weapon = weapon;
        this.shield = shield;
    }
    public int harm(){
        boolean isHit = rnd.nextBoolean();
        int damage = 0;
        if (isHit && shield.armorReserve==0){
            damage = rnd.nextInt(weapon.damage()+1);
            
        } else {
            if (isHit) {
                shield.armorReserve = shield.armorReserve - 1;
            }
        }
        return damage; 
    }

    @Override
    public int sizeShield() {
        return shield.getSize();
    }

        @Override
    public Shield getShield() {
        return shield;
    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Воин \n")
                .append(this.getName())
                .append(String.format("\n\tHp: %d", getHp()))
                .append(String.format("\n\tВооружен: %s", this.weapon))
                .append(String.format("\n\tЗащита: %s", this.shield));
        return res.toString();
    }
}

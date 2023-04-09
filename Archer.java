public class Archer extends Warrior<Throwing>{
    public Archer(String name, int hp, Throwing weapon) {
        super(name, hp, weapon);
    }

    public int range(){
        return rnd.nextInt(this.weapon.range)+1;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

public class Round extends Shield{

    public Round(int size, int armorReserve) {
        super(size, armorReserve);
    }

    @Override
    public String toString() {
        return "Round{" +
                "armorReserve=" + armorReserve +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefTeam = new Team<>();
        archers.addPers(new Archer("Робин", 100, new Bow(20)))
                .addPers(new Archer("Гуд", 100, new Bow(15)));
        thiefTeam.addPers(new Thief("Джек", 150, new Knife()))
                .addPers(new Thief("Потрошитель", 150, new Knife()));
        System.out.println(archers);
        System.out.println();
        System.out.println(thiefTeam);

        Archer robin = new Archer("Робин", 50, new Bow(20));
        Archer gud = new Archer("Гуд", 50, new Bow(50));
        Battle fight = new Battle(robin,gud);
        fight.run();
    }
}
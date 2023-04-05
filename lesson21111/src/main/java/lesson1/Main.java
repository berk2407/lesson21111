package lesson1;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Cross(90), new Water(5), new Wall(7));
        Team team = new Team("Invincible", new Human("Jo"), new Cat("Tiabini"), new Dog("Sharik"));
        c.doIt(team);

        System.out.println("\nWinners:");
        team.passedTheDistance();

        System.out.println("\nResult:");
        team.showResults();
    }
}


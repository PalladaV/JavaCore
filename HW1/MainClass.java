package HW1;

import HW1.Competitors.*;
import HW1.obstacles.*;

public class MainClass {
    public static void main(String[] args) {

        Competitor[] competitors = {new Turtle("Martin"), new Cat("Murzik"), new Wolf("Fang"), new Dragon("Fluff")};
        Obstacle[] obstacles = {new Cross(400), new Wall(2), new Water(1)};

        Team team = new Team("Zoo", competitors);

        System.out.println("============created new team============");
        System.out.println(team.getTeamName());

        System.out.println("============greeting team members============");
        team.showResults();

        // new Course
        Course course = new Course(obstacles);

        System.out.println("============team goes to course============");
        course.doIt(team);

        System.out.println("============show team Results============");
        team.showResults();

        System.out.println("============team members finished course============");
        team.showMembersFinishedCourse();
    }
}

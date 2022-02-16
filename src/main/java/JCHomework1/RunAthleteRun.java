package JCHomework1;

public class RunAthleteRun {
    public static void main(String[] args) {
        Athlete[] athletes = {
                new Athlete("Maks ", 22, 78, 6, 1),
                new Athlete("Gera ", 33, 67, 7, 2),
                new Athlete("Tommi ", 25, 80, 3, 1),
                new Athlete("Anna ", 28, 47, 7, 2),
        };

        for (Athlete athlete : athletes) {
            System.out.println(athlete);
        }

        Team team = new Team("Успешный успех", athletes);

        Course[] course = {
                new Course("dog escape", -1, 6, 0), // только скорость собаки
                new Course("jump over the fence", 1, -1, 0), // значение высоты забора
                new Course("tightrope walking", -1, -1, 79)
        };
        String result = Course.ObstacleCourseStart(team);
        System.out.println(result);
    }
}


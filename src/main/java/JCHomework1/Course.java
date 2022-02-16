package JCHomework1;

public class Course {
    static String result;
    private String title;
    private static int fence_height; // высота забора
    private static int dog_speed; // скорость собаки
    private static int max_load; //максимальная нагрузка каната, тяжелые конкурс не пройдут, он коснется земли

    Course(String title, int fence_height, int dog_speed, int max_load) {
        this.title = title;
        this.fence_height = fence_height;
        this.dog_speed = dog_speed;
        this.max_load = max_load;
    }

    public int getFence_height() {
        return fence_height;
    }

    public int getDog_speed() {
        return dog_speed;
    }

    public int getMax_load() {
        return max_load;
    }

    public String getTitle() {
        return title;
    }

    public static String ObstacleCourseStart(Team team) {
        result = "Команда: " + team.getName() + " ";
        for (Athlete athlete : team.getPeoples()) {
            result += "Участник: " + athlete.getName();
            int value1 = athlete.getM_jump_height();
            jumpOverTheFence(value1);
            int value2 = athlete.getRun_meters_per_sec();
            dogEscape(value2);
            int value3 = athlete.getWeight();
            tightropeWalking(value3);
        }

        return result;
    }

    private static String jumpOverTheFence(int value1) {
        if (value1 < fence_height) {
            System.out.println("Повис на заборе " + '\n');
        }
        else {
            System.out.println("успех! " + '\n');
        }
        return null;
    }

        private static String dogEscape(int value2) {
            if (value2 < max_load) {
                return "fail. ass bitten";
            } else {
                return "Success run";
            }

        }

        private static String tightropeWalking(int value3) {
            if (value3 < dog_speed) {
                return "fail. ass bitten";
            } else {
                return "Success run";
            }
        }
    }




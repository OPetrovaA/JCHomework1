package JCHomework1;

public class Athlete {
        private String name;
        private int age;
        private int weight;
        private int run_meters_per_sec; //running speed скорость бега метры в секунду
        private int m_jump_height; // высота прыжка, метры

        Athlete(String name, int age, int weight, int run_meters_per_sec, int m_jump_height) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.run_meters_per_sec = run_meters_per_sec;
            this.m_jump_height = m_jump_height;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getWeight() {
            return weight;
        }

        public int getRun_meters_per_sec() {
            return run_meters_per_sec;
        }

        public int getM_jump_height() {
            return m_jump_height;
        }

        @Override
        public String toString() {
            return "Athlete:" + name + ", возраст:" + age + ", вес:" + weight + ", может пробежать " + run_meters_per_sec + "м в сек " + ", прыгает в высоту:" + m_jump_height + "m";
        }

    }

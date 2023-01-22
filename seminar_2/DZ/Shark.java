public class Shark extends Animal implements Swimable {

        public Shark(String classAnimal, String name, int box) {
            super(classAnimal, name, box);
        }

        @Override
        public String say() {
            return "Say: Агрррр";
        }
    
        @Override
        public int speedOfSwim() {
            return 100;
        }
    }

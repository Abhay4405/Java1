package q1;

class Background {
    String village = "Sirgaon";
    String favfood = "Burger";

    void methBack() {
        System.out.println("Village: " + village + ", Favorite Food: " + favfood);
    }
}

class Health {
    int age = 25;
    int weight = 75;

    void methHealth() {
        System.out.println("Age: " + age + " years, Weight: " + weight + " kg");
    }
}

class Athlete {  
    Background background;
    Health health;

   
    Athlete() {
        background = new Background();
        health = new Health();
    }

    void infoAth() {
        background.methBack();
        health.methHealth();
    }
}

public class Main {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();  // Fixed typo: "Athelete" -> "Athlete"
        athlete.infoAth();
    }
}


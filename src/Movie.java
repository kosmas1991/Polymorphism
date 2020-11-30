public class Movie {
   private String name;
   private int duration;

    public String getName() {
        return name;
    }

    public void plot(){
        System.out.println("movie ' s plot");
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movie() {
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Movie(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public static Movie randomMovie(int x){
      switch (x){
          case 1:
             // Jaws jaws = new Jaws("Jaws",160);
              return new Jaws("Jaws",70);
          case 2:
              //Scream scream = new Scream("Scream",180);
              return new Scream("Scream", 90);
          case 3:
              //Oliver oliver = new Oliver("Oliver",190);
              return new Oliver("Oliver", 120);
          case 4:
             // Independence independence = new Independence("Independence",200);
              return new Independence("Indepentance",80);
      }
      return null;
    }
}

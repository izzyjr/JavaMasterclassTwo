package com.israelmesa;

class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    private String name;

    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "Shark eats many people";
    }
}

class InpedenceDay extends Movie {

    public InpedenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the Universe";
    }
}

class Forgetable extends Movie {

    public Forgetable() {
        super("Forgetable");
    }

    //No plot method
}

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    ": " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }

    }



    public static Movie randomMovie() {
        int ranmdomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generator: " + ranmdomNumber);

        switch (ranmdomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new InpedenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();

        }

        return null;
    }




}

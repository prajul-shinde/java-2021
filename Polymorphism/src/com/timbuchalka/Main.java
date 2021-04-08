package com.timbuchalka;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "there is no plot";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "kids try and  escape from maze";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgetable extends Movie {

    public Forgetable() {
        super("Forgetable");
    }
    //no plot method will be called here
}

public class Main {

    public static void main(String[] args) {
        for(var i=1;i<11;i++){
            Movie movie=randomMovie();
            System.out.println("movie# "+i +
                    ": "+movie.getName()+ "\n"+ "plot "+movie.plot()+"\n");
        }
    }
    public static Movie randomMovie(){
        int randomNumber= (int) ((Math.random()*5)+1);
        System.out.println("random number generated was "+randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
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

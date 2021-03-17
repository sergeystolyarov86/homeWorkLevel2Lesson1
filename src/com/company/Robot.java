package com.company;

public class Robot implements  RunJump,WallRunRoad {
    String name;
    double maxJumpHeight=1.9;
    double maxRunDist=850;

    public Robot(String name) {
        this.name = name;
    }



    @Override
    public void run() {
        System.out.println("Робот "+name+" побежал");

    }

    @Override
    public void jump() {
        System.out.println("Робот "+name+" прыгнул");
    }

    @Override
    public void runRoad(double h) {
        if (h <= maxRunDist) {
            System.out.println("Робот "+name+" пробежал "+h+" метров");
        } else {
            System.out.println("Робот "+name+" не пробежит такую дистанцию!");
        }
    }
    @Override
    public void jumpWall(double h) {
        if (h <= maxJumpHeight) {
            System.out.println("Робот "+name+" прыгнул через стену "+h+" метров");
        } else {
            System.out.println("Робот "+name+" не перепрыгнет эту стену!");

        }
    }
}


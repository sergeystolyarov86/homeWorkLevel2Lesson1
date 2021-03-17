package com.company;

public class Human implements RunJump,WallRunRoad{
    String name;
    double maxJumpHeight=1.3;
    double maxRunDist=1550;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Человек "+name+" побежал");

    }

    @Override
    public void jump() {
        System.out.println("Человек "+name+" прыгнул");
    }

    @Override
    public void runRoad(double h) {
        if (h <= maxRunDist) {
            System.out.println("Человек "+name+" пробежал "+h+" метров");
        } else {
            System.out.println("Человек "+name+" не пробежит такую дистанцию!");
        }
    }
    @Override
    public void jumpWall(double h) {
        if (h <= maxJumpHeight) {
            System.out.println("Человек "+name+" прыгнул через стену "+h+" метров");
        } else {
            System.out.println("Человек "+name+" не перепрыгнет эту стену!");
        }
    }
}

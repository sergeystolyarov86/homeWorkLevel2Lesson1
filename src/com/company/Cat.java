package com.company;

public class Cat implements RunJump,WallRunRoad {
    String name;
    double maxJumpHeight=2.2;
    double maxRunDist=250;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Кот/кошка "+name+" побежал");

    }

    @Override
    public void jump() {
        System.out.println("Кот/кошка "+name+" прыгнул");
    }

    @Override
    public void runRoad(double h) {
        if (h <= maxRunDist) {
            System.out.println("Кот/кошка "+name+" пробежал "+h+" метров");
        } else {
            System.out.println("Кот/кошка "+name+" не пробежит такую дистанцию!");
        }
    }
    @Override
    public void jumpWall(double h) {
        if (h <= maxJumpHeight) {
            System.out.println("Кот/кошка "+name+" прыгнул через стену "+h+" метров");
        } else {
            System.out.println("Кот/кошка "+name+" не перепрыгнет эту стену!");
        }
    }
}




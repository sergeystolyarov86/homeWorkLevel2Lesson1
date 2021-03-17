package com.company;

public class Main {
    // Основные задания выполнил как понял и как смог
    public static void main(String[] args) {
        Robot robot=new Robot("Бамблби");
        Cat cat=new Cat("Васька");
        Human human=new Human("Игорь");
        WallRunRoad [] participants= {robot,cat,human};
        ;for (WallRunRoad p : participants){
            p.jumpWall(1.8);p.jumpWall(2.2);p.jumpWall(2.1);
            p.runRoad(200);p.runRoad(85);p.runRoad(650);
        }
        //Задание с перечислением :
        System.out.println();
        System.out.println("Задание с определением рабочего дня и рабочих часов:");
        DayOfWeekMain monday=DayOfWeekMain.MONDAY;
        DayOfWeekMain friday=DayOfWeekMain.FRIDAY;
        DayOfWeekMain sunday=DayOfWeekMain.SUNDAY;
        monday.dayInfo();friday.dayInfo();sunday.dayInfo();

    }
}




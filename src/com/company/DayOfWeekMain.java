package com.company;


public enum DayOfWeekMain {
    MONDAY(40 ,"Понедельник рабочий день,"),
    TUESDAY(32 ,"Вторник рабочий день,"),
    WEDNESDAY(24,"Среда рабочий день,"),
    THURSDAY(16,"Четверг рабочий день,"),
    FRIDAY(8,"Пятница рабочий день,"),
    SATURDAY(0,"Суббота нерабочий день,"),
    SUNDAY(0,"Воскресенье нерабочий день,");
    int workingHours;
    String workOrNot;
    DayOfWeekMain(int workingHours,String workOrNot ) {
       this.workingHours=workingHours;
       this.workOrNot=workOrNot;
    }
    void dayInfo(){
        System.out.println(workOrNot+" до конца рабочей недели осталось "+workingHours+" часов");

    }
}


package Enum;

public class Test {
    public static void main(String[] args) {
        Season season1 = Season.WINTER;
        System.out.println(season1);
        Season season2 = Season.SPRING;
        System.out.println(season2);
        Season season3 = Season.SUMMER;
        System.out.println(season3);
        Season season4 = Season.AUTUMN;
        System.out.println(season4);
        System.out.println(season4.ordinal());
    }
}

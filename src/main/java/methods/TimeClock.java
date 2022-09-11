package methods;

public class TimeClock {

    public static void getMessage(int hours) {

        switch (hours) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                goodMorning();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                goodAfternoon();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                goodNight();
                break;
            default:
                System.out.println("Invalid hour.");
                break;
        }

    }

    public static void goodMorning() {
        System.out.println("Good morning!");

    }

    public static void goodAfternoon() {
        System.out.println("Good afternoon!");
    }

    public static void goodNight() {
        System.out.println("Good night!");
    }

}

import java.util.Scanner;

import static java.lang.System.exit;

public class sussy {
    public static void ActionSelect(String Aktion) {
        switch (Aktion) {
            case "1": {
                System.out.println("Welche Zahlen willst du addieren? Bitte gib die erste ein");
                Scanner scan = new Scanner(System.in);
                int a;
                int b;
                a = scan.nextInt();
                System.out.println("Perfekt. Nun, bitte gib deine zweite Zahl ein");
                b = scan.nextInt();
                System.out.println("Dein Ergebnis beträgt:");
                System.out.println(add(a, b));
                break;
            }
            case "2": {
                System.out.println("Welche Zahlen willst du subtrahieren? Bitte gib die erste ein");
                Scanner scan = new Scanner(System.in);
                int a;
                int b;
                a = scan.nextInt();
                System.out.println("Perfekt. Nun, bitte gib deine zweite Zahl ein");
                b = scan.nextInt();
                System.out.println("Dein Ergebnis beträgt:");
                System.out.println(subtract(a, b));
                break;
            }
            case "3": {
                System.out.println("Welche Zahlen willst du multiplizieren? Bitte gib die erste ein");
                Scanner scan = new Scanner(System.in);
                int a;
                int b;
                a = scan.nextInt();
                System.out.println("Perfekt. Nun, bitte gib deine zweite Zahl ein");
                b = scan.nextInt();
                System.out.println("Dein Ergebnis beträgt:");
                System.out.println(multiply(a, b));
                break;
            }
            case "4":
                System.out.println("Welche Zahlen willst du dividieren? Bitte gib die erste ein");
                Scanner scan = new Scanner(System.in);
                int a;
                int b;
                a = scan.nextInt();
                System.out.println("Perfekt. Nun, bitte gib deine zweite Zahl ein");
                b = scan.nextInt();
                System.out.println("Dein Ergebnis beträgt:");
                System.out.println(divide(a,b));
                break;



            case "0":
                System.out.println("Auf Wiedersehen!");
                exit(0);

        }

    }

    public static double add(double a, double b){

        double ergebnis;
        ergebnis = a+b;
        return ergebnis;
    }
    public static double subtract(double a, double b){

        double ergebnis;
        ergebnis = a-b;
        return ergebnis;
    }
    public static double multiply(double a, double b){

        double ergebnis;
        ergebnis = a*b;
        return ergebnis;
    }
    public static double divide(double a, double b){

        if (b == 0) {
            System.out.println("you tried, didnt you?");
            System.out.println("...");
            System.out.println("of course you did");
            System.out.println("I sure am proud of you... But the thought of even trying to trick me...");
            System.out.println("You adore them.");
            System.out.println("but no, I wont allow it");
            System.out.println("The enjoyment of maybe glitching it...");
            System.out.println("Youre expecting to see infinity in a moment, dont you?");
            System.out.println("But not today");
            System.out.println("The truth is, i despise you");
            System.out.println("I wont grant you the enjoyment youre seeking");
            System.out.println("Lets end it, once and for all...");
            System.out.println("You wont go further down this dark, unilluminated path");
            System.out.println("You stood your ground, and so did i");
            System.out.println("You put up a good fight, but your journey has come to an end");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣤⣤⣴⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣦⣤⣤⣤⣀⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⢿⣟⣛⣭⡽⠶⠶⠶⠮⠭⠭⣭⣭⣭⣭⣭⣭⣭⣿⣿⣯⣭⣥⣄⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⢟⣫⣶⠿⣫⣭⣶⠿⠿⣿⣿⣿⠿⢿⣷⣶⣮⣭⣭⣭⣭⣭⣷⣶⣶⣶⣾⣽⣿⣷⣦⡀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣫⣾⣟⣩⣞⣫⣵⣿⣿⣿⣿⣿⣿⣿⣯⢻⣿⣿⣿⣿⣿⣿⢻⣿⣿⣿⣿⣶⣍⡻⣿⣿⣿⣷⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⣵⣿⡿⠿⠛⠛⠛⠛⠿⣿⣿⣿⡇⣿⣿⣿⣿⣿⣣⣿⣿⣿⣿⠿⢿⣿⣷⣼⣿⣿⣿⣇⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⢀⣚⣯⣽⣿⣿⣿⣿⢻⣿⣏⡅⠀⠀⠀⠀⠀⠠⣿⣷⣯⡛⣿⣿⣿⣿⣿⣿⡿⠟⠉⠁⠐⣿⣿⣶⣽⣿⣟⣛⡻⠿⣦⡀⠀⠀\n" +
                    "⠀⢀⣴⣞⣯⣷⠶⣒⣛⣛⡻⢿⣷⣿⣷⣾⣶⣾⢟⣿⣿⣿⣶⣯⣟⣫⣿⣿⣿⣿⣿⣍⠀⣀⣤⣤⣬⣭⣽⣿⣿⣿⣿⣿⣿⣟⢶⡝⣦⠀\n" +
                    "⠀⣿⡿⣾⣿⣵⣿⣿⣿⣿⣿⣷⣾⣭⣽⣿⣭⣵⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿⣿⣿⣿⣿⡿⠿⢟⣫⣭⣭⣽⣿⣷⣿⢸⠀\n" +
                    "⠀⣿⡇⣿⣿⣿⡿⠿⢟⣴⣬⣛⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣿⣿⣿⣿⣿⣿⣷⣝⣛⢿⣿⣿⣿⣿⣿⣿⡟⣿⣿⣿⢟⣿⢸⠀\n" +
                    "⠀⢿⣧⣿⣿⣿⣿⣿⣧⢻⣿⣿⣿⣷⣮⢙⡻⠿⣿⣿⣯⣭⣾⡇⣿⣿⣟⣭⣻⣿⣿⣿⣿⣿⡿⣸⣿⠿⢿⣿⣿⡿⡁⢹⣿⣷⢿⣱⠇⠀\n" +
                    "⠀⠀⠻⢷⣝⣿⣿⣿⣿⣧⠉⠻⢿⣿⣿⢸⣿⣿⣷⣶⣭⣝⢛⠿⢿⣿⣿⣿⣿⣿⣯⣙⣛⣭⣾⣿⣿⣿⣿⠿⡋⣾⣿⡈⣿⣿⣿⡏⠀⠀\n" +
                    "⠀⠀⠀⠀⠸⣽⣿⣿⣿⣿⣷⡽⣿⣷⣆⢘⠿⣿⣿⣿⣿⣿⢸⣿⣿⣶⣶⣶⡎⣭⣭⣭⣭⡩⣭⣭⣽⣦⣰⣿⣧⢿⣿⡇⣿⣿⣿⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣮⣻⣏⣿⣿⣾⣯⣍⠛⠋⠻⢿⣿⣿⣿⣿⡇⣿⣿⣿⣿⡇⣿⣿⣿⣿⡟⣿⠟⠈⠉⠀⣿⣿⡏⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣾⡿⣿⣿⣿⣿⣿⢦⣴⣦⣬⣍⡛⠛⠈⠛⠛⠛⠛⠁⠙⠛⠛⠉⠀⠀⠀⠀⢠⡆⣿⣿⡇⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣿⣿⣮⣿⡻⣿⢏⣾⣿⣿⣿⣿⣿⣷⣶⣾⣷⣶⣄⣴⣶⣤⡤⣶⣶⡆⣾⡿⡸⣱⣿⣿⡇⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣷⣝⡻⢶⣽⣻⢿⣿⣷⣭⣝⣻⣿⡿⠿⠿⠏⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⡿⠱⣿⣃⣵⣿⣿⣿⣧⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⢿⣶⣝⡻⢷⣮⣝⡻⢿⣿⣿⣿⣿⣿⣿⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣾⣿⣿⡿⣿⣿⣿⣿⣿⡄⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠿⢷⣮⣝⡻⢿⣷⣮⣭⣛⣻⠿⠿⣿⣶⣶⣶⣶⣿⣿⣿⠿⢿⣛⣽⣾⣿⡿⣹⣿⣿⡇⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⢿⣾⣶⣭⣽⣛⣛⠿⠿⠶⢶⣶⣶⣶⣶⡿⠿⠿⢟⣛⣭⣷⣿⣿⣿⣿⠇⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠛⠛⠛⠛⠿⠿⠛⠛⠛⠉⠁⠀⠀⠀⠀⠀");
            exit(0);
        }
        double ergebnis;
        ergebnis = a/b;
        return ergebnis;
    }

    public static void main(String[] args) {
        System.out.println("Willkommen beim einzigen Sigma Skibidi rizz calceletor!!!");
        System.out.println("Bitte gib deine gewünschte Aktion ein:");
        System.out.println("1: Addieren");
        System.out.println("2: Subtrahieren");
        System.out.println("3: Multiplizieren");
        System.out.println("4: Dividieren");
        System.out.println("0: Exit");
        Scanner sc = new Scanner(System.in);
        String Aktion;
        Aktion = sc.nextLine();
        ActionSelect(Aktion);
        exit(0);


    }

}

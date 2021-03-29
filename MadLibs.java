import java.util.Scanner;

public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author: Andi
    Date: 27.03.2021
    */

  //  import java.util.Scanner;

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);

        System.out.println("Insert name: ");
        String name1 = eingabe.nextLine();
        System.out.println("Insert adjective: ");
        String adjective1 = eingabe.nextLine();
        System.out.println("Insert adjective: ");
        String adjective2 = eingabe.nextLine();
        System.out.println("Insert adjective: ");
        String adjective3 = eingabe.nextLine();
        System.out.println("Insert verb: ");
        String verb1 = eingabe.nextLine();
        System.out.println("Insert noun: ");
        String noun1 = eingabe.nextLine();
        System.out.println("Insert noun: ");
        String noun2 = eingabe.nextLine();
        System.out.println("Insert noun: ");
        String noun3 = eingabe.nextLine();
        System.out.println("Insert noun: ");
        String noun4 = eingabe.nextLine();
        System.out.println("Insert noun: ");
        String noun5 = eingabe.nextLine();
        System.out.println("Insert noun: ");
        String noun6 = eingabe.nextLine();
        System.out.println("Insert name: ");
        String name2 = eingabe.nextLine();
        System.out.println("Insert number: ");
        int number = eingabe.nextInt();
        System.out.println("Insert place: ");
        String place1 = eingabe.nextLine();
        //The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a " + adjective2 + " day!'\n " +
                "Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores." +
                " They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3 + ".\n" +
                " Concerned, " + name1 + " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ".\n" +
                " " + name1 + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";
        System.out.println(story);
    }
}

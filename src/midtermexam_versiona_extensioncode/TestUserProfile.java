
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author pannu
 */
public class TestUserProfile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Choose your favourite genre:");
        System.out.println("1. Comedy");
        System.out.println("2. Drama");
        System.out.println("3. Action");
        System.out.println("4. Mystery");

        int choice = input.nextInt();
        String genre = "";

        if (choice == 1) {
            genre = "Comedy";
        } else if (choice == 2) {
            genre = "Drama";
        } else if (choice == 3) {
            genre = "Action";
        } else if (choice == 4) {
            genre = "Mystery";
        }

        UserProfile profile = new UserProfile(name, genre);

        System.out.println("Your user profile was created!");
        System.out.println("Name: " + profile.getUserID());
        System.out.println("Favourite Genre: " + profile.getGenre());

    }

}

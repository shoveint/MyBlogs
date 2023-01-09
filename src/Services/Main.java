package Data.Dtos;


import controllers.CreatePostRequest;
import controllers.PostControllers;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    private  static Scanner scanner = new Scanner(System.in);
    private static PostControllers postControllers = new PostControllers();

    public static void main(String[] args) {
        System.out.println("Hello user!");
        displayMainMenu();
    }

    private static void displayMainMenu() {
        String mainMenu = """
                Press 1 for Create post
                Press 2 for post view
                Press 3 to exit
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)){
            case '1' -> createPost();
            case '2' -> viewPost();
            case '3' -> exitFromApp();
        }
    }

    private static void viewPost() {
        String userInput = input("Enter post id or 0 to exit");
        if ("0".equals(userInput)){
            displayMainMenu();
        }
        showPost(userInput);
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
    }
    private static void print(String prompt){
        System.out.println(prompt);
        JOptionPane.showMessageDialog(null, prompt);
    }
    private static void print(Object obj){
        System.out.println(obj);
        JOptionPane.showMessageDialog(null, obj);
    }

    private static void showPost(String postId) {
        try{
            print(postControllers.viewPost(Integer.parseInt(postId)));
        } catch (NumberFormatException e) {
            print("Please enter a valid id");
            viewPost();
        }
            throw  (PostNotFoundException ){
            print("Post not found. Check the id is correct");
            viewPost();
        }
    }

    private static void createPost(){
        String title = input("Enter post title");
        String body = input("Enter post body");
        CreatePostRequest postRequest = new CreatePostRequest();
        postRequest.setTitle(title);
        postRequest.setBody(body);
        print(postControllers.createPost(postRequest));
        displayMainMenu();
    }
    private static void exitFromApp(){
        print("Thanks for using my blog!");
        System.exit(0);
    }



}

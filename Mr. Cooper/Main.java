import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int recipeCounter=0;
    static List<Recipe> recipes=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean exit=false;
        User user=new User(1, "Guru");
        loadData();
        int choice;
        while(!exit){
            System.out.println("1 for upload");
            System.out.println("2 for comment");
            System.out.println("3 for review");
            System.out.println("4 for view recipe");
            System.out.print("Enter option: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    recipeUpload(sc,user);
                    break;
                case 2:
                    addComment(sc,user);
                    break;
                case 3:
                    addReview(sc, user);
                    break;
                case 4:
                    viewAllRecipe();
                    break;
                case 5:
                    saveData();
                    exit=true;
                    break;
            }
        
        }
    }
    // Add these methods at the end of your class
    private static void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("recipes.dat"))) {
            oos.writeObject(recipes);
            oos.writeInt(recipeCounter);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    private static void loadData() {
        File file = new File("recipes.dat");
        if (!file.exists()) {
            System.out.println("No saved data found.");
            return;
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            recipes = (List<Recipe>) ois.readObject();
            recipeCounter = ois.readInt();
            System.out.println("Data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
    public static void recipeUpload(Scanner sc, User user){
        System.out.print("Enter recipe name: ");
        sc.nextLine();
        String name=sc.nextLine();
        Recipe recipe=new Recipe(++recipeCounter, name, user.getUserId());
        recipes.add(recipe);
        user.uploadRecipe(recipe);
    }
    public static void viewAllRecipe(){
        for(Recipe recipe: recipes){
            System.out.println(recipe.getId()+": "+recipe.getName()+" by "+ recipe.getAuthorId());
            System.out.println("Ratings: "+recipe.getRating()+"/5");
            System.out.println("Comments:");
            recipe.listComments();
            System.out.println("-----");
        }
    }
    public static Recipe findRecipeById(int id){
        for(Recipe recipe: recipes){
            if(recipe.getId()==id){
                return recipe;
            }
        }
        return null;
    }

    public static void addComment(Scanner sc, User user){
        System.out.print("Enter recipe id: ");
        sc.nextLine();
        int recipeId=sc.nextInt();
        System.out.print("Enter comment: ");
        sc.nextLine();
        String comment=sc.nextLine();
        Recipe recipe=findRecipeById(recipeId);
        recipe.addComment(user.getUserId(),comment);
    }
    public static void addReview(Scanner sc, User user){
        System.out.print("Enter recipe id: ");
        sc.nextLine();
        int recipeId=sc.nextInt();
        System.out.print("Enter rating (0-5): ");
        sc.nextLine();
        int rating=sc.nextInt();
        Recipe recipe=findRecipeById(recipeId);
        recipe.addReview(user.getUserId(),rating);
    }
}
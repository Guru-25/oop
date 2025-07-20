import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable{
    private int userId;
    private String name;

    private List<Recipe> recipeList=new ArrayList<>();

    public User(int userId, String name){
        this.userId=userId;
        this.name=name;
    }
    public int getUserId(){
        return userId;
    }
    public String getName(){
        return name;
    }
    public List<Recipe> getRecipeList(){
        return recipeList;
    }
    public void uploadRecipe(Recipe recipe){
        System.out.println("Recipe: "+recipe.getName()+" was uploaded successfully by "+recipe.getAuthorId());
    }
    
}

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Recipe implements Serializable{
    private int id;
    private String name;
    private int authorId;
    // private List<Ingredient> ingredients =new ArrayList<>();
    // private List<Instruction> instructions =new ArrayList<>();
    // private List<Review> reviews =new ArrayList<>();
    private List<Comment> comments=new ArrayList<>();
    private List<Review> reviews=new ArrayList<>();

    public Recipe(int id, String name, int authorId){
        this.id=id;
        this.name=name;
        this.authorId=authorId;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAuthorId(){
        return authorId;
    }
    public void listComments(){
        for(Comment comment:comments){
            System.out.println(comment.getComment()+" by "+comment.getAuthorId());
        }
    }
    public void addComment(int userId, String comment){
        Comment cmt=new Comment(comment, userId);
        comments.add(cmt);
        System.out.println("comment was added successfully");
    }
    public void addReview(int authorId, int rating){
        Review rev=new Review(authorId, rating);
        reviews.add(rev);
        System.out.println("review was added successfully");
    }
    public float getRating(){
        int count=0;
        float ratings=0;
        for(Review review: reviews){
            ratings+=review.getRating();
            count++;
        }
        return ratings/count;
    }


}

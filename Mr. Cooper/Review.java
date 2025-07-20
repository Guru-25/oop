import java.io.Serializable;

public class Review implements Serializable{
    private int authorId;
    private int rating;
    public Review(int authorId, int rating){
        this.authorId=authorId;
        this.rating=rating;
    }
    public int getAuthorId(){
        return authorId;
    }
    public int getRating(){
        return rating;
    }
}

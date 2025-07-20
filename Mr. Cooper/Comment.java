import java.io.Serializable;

public class Comment implements Serializable{
    private static final long serialVersionUID = 1L;
    private String comment;
    private int authorId;
    public Comment(String comment, int authorId){
        this.comment=comment;
        this.authorId=authorId;
    }
    public String getComment(){
        return comment;
    }
    public int getAuthorId(){
        return authorId;
    }
}

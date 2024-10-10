import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.setTitle("Почему второй язык программирования выучить проще, чем первый?");
        post.setContent("Если вы научились водить автомобиль на механике, " +
                "вы можете сесть плюс-минус за любой автомобиль и поехать. " +
                "Вам необязательно ездить именно за тем рулём, " +
                "за которым вы учились в автошколе. " +
                "Может быть, первое время вам будет непривычно в новой машине," +
                " но вы быстро освоитесь.");
        post.setTags(new String[]{"Образование", "Карьера в IT"});

        PostComment comment1 = new PostComment();
        comment1.setText("Отличная статья!");
        comment1.setWhoLiked(new String[] { "Lera93", "934Vasya1" });

        PostComment comment2 = new PostComment();
        comment2.setText("Тема не раскрыта :(");
        comment2.setWhoLiked(new String[] { "Petya070707", "Masha90" });

        PostComment comment3 = new PostComment();
        comment3.setText("❤❤❤");

        ArrayList<PostComment> comments = new ArrayList<>();
        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);
        post.setComments(comments);

        System.out.println(post);
    }
}

class Post {
    private String title; // заголовок
    public void setTitle(String title) {
        this.title = title;
    }

    private String content; // содержание

    public void setContent(String content){
        this.content = content;
    }
    private String[] tags; // теги
    public void setTags(String[] tags){
        this.tags=tags;
    }
    private ArrayList<PostComment> comments; //комментарии
    public void setComments(ArrayList<PostComment> comments){
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", content='" + content.length() + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", \ncomments=" + comments +
                '}';
    }
    /* Вывод должен получиться таким:
Post{title='xxx', content.length='x', tags=[x,x],
comments=[PostComment{text='x!', whoLiked=[x, x]},
PostComment{text='x', whoLiked=[x,x]},
PostComment{text='x', whoLiked=null}]} */

}
class PostComment {
    private String text; // содержание комментария

    public void setText(String text) {
        this.text = text;
    }

    private String[] whoLiked; // кто поддержал

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }

    @Override
    public String toString() {
        return "PostComment{" +
                "text='" + text + '\'' +
                ", whoLiked=" + Arrays.toString(whoLiked) +
                '}';
    }
}

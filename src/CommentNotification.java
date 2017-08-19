import java.awt.*;

/**
 * Created by izola on 8/19/2017.
 */
public class CommentNotification extends GenericNotfication  {
    private String name;
    private String post;
    private String comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
      super.setUpNotificationData();

    }

//يعني هذني الاوفر رايد نريد القيم مالتهن نحطها بال كيت وسيت الفوك
    //لذالك نستعدي مثود علمود تحطهن بي

    @Override
    public void setTitle() {
    super.setTitle("New Comment");
    }
    @Override
    public void setContent() {
    super.setContent(name+" has commented on your post "+post+"\""+comment+"\"");
    }
    @Override
    public void setIcon() {
    super.setIcon("comment");
    }

    @Override
    public void setLedColor() {
    super.setLedColor(Color.blue);

    }


}

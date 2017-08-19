import java.awt.*;

/**
 * Created by izola on 8/18/2017.
 */
 abstract public class GenericNotfication {

    private String title;         //each notification content title
    private String content;       //each notification content icon
    private String icon;          //each notification content ledcolor
    private Color ledcolor;       //each notification content content

    abstract public void setTitle();
    abstract public void setIcon();
    abstract public void setLedColor();
    abstract  public  void setContent();


    /*this method use for set all data instead of using name of obj and call for setTitle();
   // setContent();
    setIcon();
    setLedColor();

    commentNotification.setTitle();
commentNotification.setContent();
commentNotification.setLedColor();
commentNotification.setIcon();

using

    public  void setUpNotificationData(){
        setTitle();
        setContent();
        setIcon();
        setLedColor();
    }
    and call for it in each
    for example
     public void setPost(String post) {
        this.post = post;
    }
    public void setName(String name) {
        this.name = name;
    }


    */


//this method are use for when overrideing on method abstrac need to set this value that are enter to
    //origen set so this method are use to set new value oky baby



    public  void setUpNotificationData(){
        setTitle();
        setContent();
        setIcon();
        setLedColor();
    }

    public String getTitle() {
        return title;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Color getLedColor() {
        return ledcolor;
    }

    public void setLedColor(Color ledcolor) {
        this.ledcolor = ledcolor;
    }

}
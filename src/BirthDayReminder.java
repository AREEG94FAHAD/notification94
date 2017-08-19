import java.awt.*;

/**
 * Created by izola on 8/18/2017.
 */
public class BirthDayReminder extends GenericNotfication{
    private String Name;
    private String Bithday;
    private String profilePicture;

    @Override
    public void setTitle() {
super.setTitle("Birthday");
    }

    @Override
    public void setIcon() {
super.setIcon("Birthday Cake");
    }

    @Override
    public void setContent() {
    super.setContent(Name+"Brithday");
    }

    @Override
    public void setLedColor() {
        super.setLedColor(Color.red);

    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
      //  super.setUpNotificationData();
    }

    public String getBithday() {
        return Bithday;
    }

    public void setBithday(String bithday) {
        Bithday = bithday;
    //    super.setUpNotificationData();
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
      //  super.setUpNotificationData();
    }

}

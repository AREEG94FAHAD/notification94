import java.awt.*;

import static java.awt.Color.BLUE;

/**
 * Created by izola on 8/18/2017.
 */
public class Main {
    public static void main(String[] args) {

BirthDayReminder birthDayReminder=new BirthDayReminder();
birthDayReminder.setBithday("1990");
birthDayReminder.setName("Areeg");
birthDayReminder.setProfilePicture("image");
//NotificantionBuilder.issueNotification(birthDayReminder);

CommentNotification commentNotification=new CommentNotification();
commentNotification.setName("Areeg");
commentNotification.setPost("java tutorial");
commentNotification.setComment("رؤؤؤؤؤؤؤؤؤؤؤعه  عاشت الايادي");
NotificantionBuilder.issueNotification(commentNotification);
//commentNotification.setTitle();
//commentNotification.setContent();
//commentNotification.setLedColor();
//commentNotification.setIcon();


    }


}
//friend request
//comment
//group join
//birthday reminder

//notification content
//title
//content
//icon
//led color


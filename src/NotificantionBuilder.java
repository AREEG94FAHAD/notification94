/**
 * Created by izola on 8/18/2017.
 */

//is take all method in GenericNotfication notfication
public class NotificantionBuilder {
    public static void issueNotification(GenericNotfication notfication){

        System.out.println("Blinking :"+notfication.getLedColor());
        System.out.println("Title :"+notfication.getTitle());
        System.out.println("comment :"+notfication.getContent());
        System.out.println("Icon:"+notfication.getIcon());
    }
}

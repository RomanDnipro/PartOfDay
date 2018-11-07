import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    private static OrderLogic logic;

    public static void main(String[] args) throws UnsupportedEncodingException {
        logic = new OrderLogic();
        logic.doOrder();

//        Locale[] locales = Locale.getAvailableLocales();
//        for (Locale locale : locales) {
//            System.out.println(locale);
//        }
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message_resource");
//        System.out.println(new String(resourceBundle.getString("morningMessage").getBytes("ISO-8859-1"), "UTF-8"));
//        System.out.println(resourceBundle.getString("morningMessage"));
        Date date = new Date();
        System.out.println(TimeComparator.partOfDay(date.getHours(), resourceBundle));
    }
}
import java.util.ResourceBundle;

class TimeComparator {
    static String partOfDay(int hour, ResourceBundle resourceBundle) {
        if (hour >= 6 && hour < 9) {
            return resourceBundle.getString("morningMessage");
        }
        if (hour >= 9 && hour < 19) {
            return resourceBundle.getString("dayMessage");
        }
        if (hour >= 19 && hour < 23) {
            return resourceBundle.getString("eveningMessage");
        }
        if (hour == 23 || (hour >= 0 && hour < 6)) {
            return resourceBundle.getString("nightMessage");
        }
        return null;
    }

//    static String partOfDay(int hour) {
//        if (hour >= 6 && hour < 9) {
//            return "morning";
//        }
//        if (hour >= 9 && hour < 19) {
//            return "day";
//        }
//        if (hour >= 19 && hour < 23) {
//            return "evening";
//        }
//        if (hour == 23 || (hour >= 0 && hour < 6)) {
//            return "night";
//        }
//        return null;
//    }
}

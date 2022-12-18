public class App {

    public static void wordcount(String x) {
        Integer did = Integer.parseInt(x.substring(0, 2));
        Integer did2 = Integer.parseInt(x.substring(did+4, did+6));
        System.out.println(did2);
    }
    private static int idLength = 8;
    private static String deviceID = "hello";
    private static int msgLength = 5;
    private static String textMsg = "hello";

    public static boolean isValid() {
        Boolean valid = false;
        if(deviceID.length() == idLength && textMsg.length() == msgLength) {
            valid = true;
        }
        else if (deviceID.length() != idLength ) {
            valid = false;
        }
        else if (textMsg.length() != msgLength ) {
            valid = false;
        }

        return valid;
    }
    public static void main(String[] args) throws Exception {

        String x1 = "09 12345 10 hithguhtgg";
        
        System.out.println(isValid());

    }
}

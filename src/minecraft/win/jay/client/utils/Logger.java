package win.jay.client.utils;

import win.jay.client.ClientBase;

/**
 * Created by Jay
 */
public class Logger {

    static String prefix = "(" + ClientBase.clientName + ")";

    public static void print(Object msg) {
        System.out.println(msg);
    }

    public static void printCategoriedString(String msg, LoggerCategory category) {
        print(prefix + " " + msg);
    }


}

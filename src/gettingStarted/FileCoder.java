package gettingStarted;

import java.io.File;

public class FileCoder {
    void printDirectory() {

        File files = new File("Something");

        File[] fileList = files.listFiles();

        if (fileList != null) {
            System.out.println(fileList.length);
        }
    }
}

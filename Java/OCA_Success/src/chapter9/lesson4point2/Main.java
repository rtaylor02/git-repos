package chapter9.lesson4point2; import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            broken();
        } catch (AskForNewFilenameException afnfe) {
            System.out.println("Exception: " + afnfe.getClass().getName());
            System.out.println("Reason: " + afnfe.getMessage());
        }
    }

    public static void broken() throws AskForNewFilenameException {
        boolean success = false;
        int retries = 2;

        while(!success) {
            try {
                if(!isGettingFileSuccessful()) {
                    System.out.println("Getting the file...");
                    throw new FileNotFoundException();
                }
                success = true;
                System.out.println("File found!");
            } catch(FileNotFoundException fnfe) {
                System.out.println("Cannot find the file.");
                System.out.println("Retrying..Total retry: " + retries);
                if(retries-- == 0) {
                    System.out.println("Too many retries. Exiting now...");
                    throw new AskForNewFilenameException("Error getting the file");
                }
            } finally {
                System.out.println("======================");
            }
        }
    }

    private static boolean isGettingFileSuccessful() { return Math.random() > 0.8; }
}

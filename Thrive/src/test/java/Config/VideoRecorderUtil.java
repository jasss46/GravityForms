package Config;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VideoRecorderUtil {

    private static ATUTestRecorder recorder;

    // Start recording
    public static String startRecording(String testName) throws ATUTestRecorderException {
        DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
        Date date = new Date();
        String filePath = System.getProperty("user.dir") + "/src/test/java/Videos/";
        String movFileName = testName + "-" + dateFormat.format(date) + ".mov";
    //Clean up old video files
        File videoFolder = new File(filePath);
        if (videoFolder.exists() && videoFolder.isDirectory()) {
            File[] files = videoFolder.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isFile()) {
                        if (f.delete()) {
                            System.out.println("Deleted old file: " + f.getName());
                        } else {
                            System.err.println("Failed to delete: " + f.getName());
                        }
                    }
                }
            }
        }
        recorder = new ATUTestRecorder(filePath, testName + "-" + dateFormat.format(date), false);
        recorder.start();
        System.out.println("Recording started for test: " + testName);

        return filePath + movFileName;
    }

    // Stop recording
    public static void stopRecording() throws Exception {
        if (recorder != null) {
            recorder.stop();
            System.out.println("Recording stopped");
        }
    }


    public static String convertMovToMp4(String movFilePath) {
        String mp4FilePath = movFilePath.replaceAll("\\.mov$", ".mp4");
        String command = String.format(
                "ffmpeg -y -hide_banner -loglevel error -i \"%s\" -vcodec libx264 \"%s\"",
                movFilePath, mp4FilePath
        );

        try {
            Process process = Runtime.getRuntime().exec(command);

            // consume output & error streams in background to prevent hanging
            consumeStream(process.getInputStream(), false);
            consumeStream(process.getErrorStream(), true);

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Converted video: " + mp4FilePath);

                // delete .mov file
                File movFile = new File(movFilePath);
                if (movFile.exists() && movFile.delete()) {
                    System.out.println("Deleted original .mov file: " + movFilePath);
                } else {
                    System.err.println("Failed to delete .mov file: " + movFilePath);
                }
            }
            else
            {
                System.err.println("FFmpeg failed with exit code " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return mp4FilePath;
    }

    private static void consumeStream(InputStream stream, boolean isError) {
        new Thread(() -> {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(stream))) {
                String line;
                while ((line = br.readLine()) != null) {

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

}

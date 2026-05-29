import org.opencv.core.*;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;

public class EmotionDetection {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {

        VideoCapture camera = new VideoCapture(0);

        if (!camera.isOpened()) {
            System.out.println("Camera not found!");
            return;
        }

        CascadeClassifier faceDetector =
                new CascadeClassifier("haarcascade_frontalface_default.xml");

        Mat frame = new Mat();

        while (true) {
            camera.read(frame);

            if (frame.empty()) {
                break;
            }

            MatOfRect faces = new MatOfRect();
            faceDetector.detectMultiScale(frame, faces);

            for (Rect rect : faces.toArray()) {

                Imgproc.rectangle(frame,
                        new Point(rect.x, rect.y),
                        new Point(rect.x + rect.width,
                                  rect.y + rect.height),
                        new Scalar(0, 255, 0), 2);

                // Dummy emotion detection logic
                String emotion = "Happy";

                Imgproc.putText(frame,
                        "Emotion: " + emotion,
                        new Point(rect.x, rect.y - 10),
                        Imgproc.FONT_HERSHEY_SIMPLEX,
                        0.7,
                        new Scalar(255, 0, 0), 2);
            }

            HighGui.imshow("Emotion Detection", frame);

            if (HighGui.waitKey(1) == 27) { // ESC key
                break;
            }
        }

        camera.release();
        HighGui.destroyAllWindows();
    }
}

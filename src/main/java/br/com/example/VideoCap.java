package br.com.example;
//-Djava.library.path="C:\opencv\build\java\x86"

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class VideoCap {
	public static void main(String[] args) throws IOException {
		loadLibraries();
		System.out.println("Hello, OpenCV");
		VideoCapture camera = new VideoCapture(0);
		
		camera.open(0);
		if (!camera.isOpened()) {
			System.out.println("Camera Error");
		} else {
			System.out.println("Camera OK?");
		}

		Mat frame = new Mat();
		camera.read(frame);
		System.out.println("Frame Obtained");
		System.out.println("Captured Frame Width " + frame.width());
		Imgcodecs.imwrite("camera.jpg", frame);
		System.out.println("OK");
		
		Mat image = Imgcodecs.imread("camera.jpg"); 

		// Encoding the image
		MatOfByte matOfByte = new MatOfByte();
		Imgcodecs.imencode(".jpg", image, matOfByte);

		// Storing the encoded Mat in a byte array
		byte[] byteArray = matOfByte.toArray();

		// Preparing the Buffered Image
		InputStream in = new ByteArrayInputStream(byteArray);
		BufferedImage bufImage = ImageIO.read(in);

		// Instantiate JFrame
		JFrame framex = new JFrame();

		// Set Content to the JFrame
		framex.getContentPane().add(new JLabel(new ImageIcon(bufImage)));
		framex.pack();
		framex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framex.setVisible(true);

		System.out.println("Image Loaded");
	}

	private static void loadLibraries() {

		try {
			String osName = System.getProperty("os.name");
			String opencvpath = System.getProperty("user.dir");
			if (osName.startsWith("Windows")) {
				int bitness = Integer.parseInt(System.getProperty("sun.arch.data.model"));
				if (bitness == 32) {
					opencvpath = opencvpath + "\\opencv\\build\\java\\x86\\";
				} else if (bitness == 64) {
					opencvpath = opencvpath + "\\opencv\\build\\java\\x64\\";
				}
			} else if (osName.equals("Mac OS X")) {
				opencvpath = opencvpath + "Your path to .dylib";
			}
			System.out.println(opencvpath);
			System.load(opencvpath + Core.NATIVE_LIBRARY_NAME + ".dll");
		} catch (Exception e) {
			throw new RuntimeException("Failed to load opencv native library", e);
		}
	}

}
package br.com.example;

import org.opencv.core.Core;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class VideoCap2 {

	public static void main(String[] args) {
		loadLibraries();
		VideoCapture camera = new VideoCapture("bike.avi");
		MatOfByte frame = new MatOfByte();
		int i = 0;
		
		while(true){
	        if (camera.read(frame)){
	            System.out.println("Frame Obtained");
	            System.out.println("Captured Frame Width " +
	            frame.width() + " Height " + frame.height());
	            System.out.println(frame.dump());
	            Imgcodecs.imwrite("camera" +(i++)+ ".jpg", frame);
	        }else{
	        	break;
	        }
	    }
		camera.release();		

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

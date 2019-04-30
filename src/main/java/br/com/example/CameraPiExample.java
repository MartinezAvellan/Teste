package br.com.example;

import org.opencv.core.Core;

import br.com.example.network.NetworkUtilities;
import br.com.example.util.CameraPi;
import br.com.example.util.ExposureMode;
import br.com.example.util.Picture;
import br.com.example.util.PictureConfig;
import br.com.example.util.Tools;
import br.com.example.util.Video;

/**
 * Example of use of the Camera Pi.
 * 
 * @see CameraPi
 * https://www.programcreek.com/java-api-examples/?code=Raspoid/raspoid/raspoid-master
 * @author Julien Louette &amp; Ga&euml;l Wittorski
 * @version 1.0
 */
public class CameraPiExample {
    
    /**
     * Private constructor to hide the implicit public one.
     */
    private CameraPiExample() {
    }
    
    /**
     * CameraPi features examples.
     * @param args input args. Unused here.
     */
    public static void main(String[] args) {
    	loadLibraries();
        // PREVIEW
        CameraPi.preview(5000);
        
        // PICTURES
        Picture picture1 = CameraPi.takePicture();
        Tools.log("New picture: " + picture1.getFilePath());
        
        PictureConfig pictureConfig = new PictureConfig("snowy_scenery", 2592, 1944);
        pictureConfig.setExposureMode(ExposureMode.SNOW);
        Picture picture2 = CameraPi.takePicture(pictureConfig);
        Tools.log("New picture: " + picture2.getFilePath());
        
        // VIDEOS
        Video video = CameraPi.takeVideo(5000);
        Tools.log("New video: " + video.getFilePath());
        String convertedVideoFilePath = video.convertToMP4();
        Tools.log("Converted file: " + convertedVideoFilePath);
        
        // STREAMING
        CameraPi.startGStreamerServer(NetworkUtilities.getIpAddresses().get(0), 
                NetworkUtilities.getAvailablePort(), 640, 360, true, true, 2500000, true, false);
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
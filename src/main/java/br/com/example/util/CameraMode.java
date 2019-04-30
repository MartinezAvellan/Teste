package br.com.example.util;

/**
 * <b>This enum lists the different camera mode that can be applied to the image.</b>
 * 
 * @author Julien Louette &amp; Ga&euml;l Wittorski
 * @version 1.0
 */
public enum CameraMode {
    /**
     * Disabled camera mode.
     */
    DISABLED("disabled"),
    
    /**
     * Automatic selection (default).
     */
    MODE_0("0"),
    
    /**
     * Size: 1920x1080 | Aspect ratio: 16:9 | Frame rates: 1-30fps | FOV: Partial | Binning: None.
     */
    MODE_1("1"),
    
    /**
     * Size: 2592x1944 | Aspect ratio: 4:3 | Frame rates: 1-15fps | FOV: Full | Binning: None
     */
    MODE_2("2"),
    
    /**
     * Size: 2592x1944 | Aspect ratio: 4:3 | Frame rates: 0.1666-1fps | FOV: Full | Binning: None
     */
    MODE_3("3"),
    
    /**
     * Size: 1296x972 | Aspect ratio: 4:3 | Frame rates: 1-42fps | FOV: Full | Binning: 2x2
     */
    MODE_4("4"),
    
    /**
     * Size: 1296x730 | Aspect ratio: 16:9 | Frame rates: 1-49fps | FOV: Full | Binning: 2x2
     */
    MODE_5("5"),
    
    /**
     * Size: 640x480 | Aspect ratio: 4:3 | Frame rates: 42.1-60fps | FOV: Full | Binning: 2x2 plus skip
     */
    MODE_6("6"),
    
    /**
     * Size: 640x480 | Aspect ratio: 4:3 | Frame rates: 60.1-90fps | FOV: Full | Binning: 2x2 plus skip
     */
    MODE_7("7");
    
    String mode;
    
    CameraMode(String mode) {
        this.mode = mode;
    }
    
    /**
     * Get the value corresponding to this CameraMode.
     * @return the command line option value corresponding to this camera mode.
     */
    public String getValue() {
        return mode;
    }
}
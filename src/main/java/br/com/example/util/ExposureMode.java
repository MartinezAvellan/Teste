package br.com.example.util;

/**
 * <b>Exposure modes.</b>
 * 
 * <p>Note that not all of these settings may be implemented,
 * depending on camera tuning.</p>
 * 
 * @author Julien Louette &amp; Ga&euml;l Wittorski
 * @version 1.0
 */
public enum ExposureMode {
    
    /**
     * Use automatic exposure mode.
     */
    AUTO("auto"),
    
    /**
     * Select setting for night shooting.
     */
    NIGHT("night"),
    
    /**
     * nightpreview.
     */
    NIGHT_PREVIEW("nightpreview"),
    
    /**
     * Select setting for back lit subject.
     */
    BACKLIGHT("backlight"),
    
    /**
     * spotlight.
     */
    SPOTLIGHT("spotlight"),
    
    /**
     * Select setting for sports (fast shutter etc).
     */
    SPORT("sports"),
    
    /**
     * Select setting optimised for snowy scenery.
     */
    SNOW("snow"),
    
    /**
     * Select setting optimised for beach.
     */
    BEACH("beach"),
    
    /**
     * Select setting for long exposures.
     */
    VERYLONG("verylong"),
    
    /**
     * Constrain fps to a fixed value.
     */
    FIXEDFPS("fixedfps"),
    
    /**
     * Antishake mode.
     */
    ANTISHAKE("antishake"),
    
    /**
     * Select settings.
     */
    FIREWORKS("fireworks");
    
    String mode;
    
    ExposureMode(String mode) {
        this.mode = mode;
    }
    
    /**
     * Get the value corresponding to this ExposureMode.
     * @return the command line option value corresponding to this exposure mode.
     */
    public String getValue() {
        return mode;
    }
}
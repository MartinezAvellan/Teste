package br.com.example.util;

/**
 * <b>Automatic White Balance (AWB) modes.</b>
 * 
 * <p>Note that not all of these settings may be implemented,
 * depending on camera type.</p>
 * 
 * @author Julien Louette &amp; Ga&euml;l Wittorski
 * @version 1.0
 */
public enum AWBMode {
    
    /**
     * Turn off white balance calculation.
     */
    OFF("off"),
    
    /**
     * Automatic mode (default).
     */
    AUTO("auto"),
    
    /**
     * Sunny mode.
     */
    SUN("sun"),
    
    /**
     * Cloudy mode.
     */
    CLOUD("cloud"),
    
    /**
     * Shaded mode.
     */
    SHADE("shade"),
    
    /**
     * Tungsten lighting mode.
     */
    TUNGSTEN("tungsten"),
    
    /**
     * Fluorescent lighting mode.
     */
    FLUORESCENT("fluorescent"),
    
    /**
     * Incandescent lighting mode.
     */
    INCANDESCENT("incandescent"),
    
    /**
     * Flash mode.
     */
    FLASH("flash"),
    
    /**
     * Horizon mode.
     */
    HORIZON("horizon");
    
    String mode;
    
    AWBMode(String mode) {
        this.mode = mode;
    }
    
    /**
     * Get the value corresponding to this AWBMode.
     * @return the command line option value corresponding to this AWB mode.
     */
    public String getValue() {
        return mode;
    }
}
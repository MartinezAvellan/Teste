package br.com.example.util;

/**
 * <b>Image effects that can be applied to the Camera Pi images.</pi>
 * 
 * <p>Note that not all of these settings may be available in all
 * circumstances.</p>
 * 
 * @author Julien Louette &amp; Ga&euml;l Wittorski
 * @version 1.0
 */
public enum ImageEffect {
    
    /**
     * NO effect (default).
     */
    NONE("none"),
    
    /**
     * Negate the image.
     */
    NEGATIVE("negative"),
    
    /**
     * Solarise the image.
     */
    SOLARISE("solarise"),
    
    /**
     * Posterise the image.
     */
    POSTERISE("posterise"),
    
    /**
     * Whiteboard effect.
     */
    WHITEBOARD("whiteboard"),
    
    /**
     * Blackboard effect.
     */
    BLACKBOARD("blackboard"),
    
    /**
     * Sketch style effect.
     */
    SKETCH("sketch"),
    
    /**
     * Denoise the image.
     */
    DENOISE("denoise"),
    
    /**
     * Emboss the image.
     */
    EMBOSS("emboss"),
    
    /**
     * Apply an oil paint style effect.
     */
    OILPAINT("oilpaint"),
    
    /**
     * Hatch sketch style.
     */
    HATCH("hatch"),
    
    /**
     * gpen
     */
    GPEN("gpen"),
    
    /**
     * A pastel style effect.
     */
    PASTEL("pastel"),
    
    /**
     * A watercolour style effect.
     */
    WATERCOLOUR("watercolour"),
    
    /**
     * Film grain style effect.
     */
    FILM("film"),
    
    /**
     * Blur the image.
     */
    BLUR("blur"),
    
    /**
     * Colour saturate the image.
     */
    SATURATION("saturation");
    
    String effect;
    
    ImageEffect(String effect) {
        this.effect = effect;
    }
    
    /**
     * Get the value corresponding to this ImageEffect.
     * @return the command line option value corresponding to this image effect.
     */
    public String getValue() {
        return effect;
    }
}

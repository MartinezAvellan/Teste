package br.com.example.util;

/**
 * <b>H264 profile to use for encoding.</b>
 * 
 * @author Julien Louette &amp; Ga&euml;l Wittorski
 * @version 1.0
 */
public enum H264Profile {
    /**
     * Baseline.
     */
    BASELINE("baseline"),
    
    /**
     * Main.
     */
    MAIN("main"),
    
    /**
     * High.
     */
    HIGH("high");
    
    String profile;
    
    H264Profile(String profile) {
        this.profile = profile;
    }
    
    /**
     * Get the value corresponding to this H264Profile.
     * @return the command line option value corresponding to this H264 profile.
     */
    public String getValue() {
        return profile;
    }
}
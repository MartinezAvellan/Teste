package br.com.example.util;

/**
 * <b>Available rotations applicable to the pictures/videos.</b>
 * 
 * <p>Due to hardware constraints only 0, 90, 180 and 270 degree 
 * rotations are supported.</p>
 * 
 * @author Julien Louette &amp; Ga&euml;l Wittorski
 * @version 1.0
 */
public enum RotationDegree {
    
    /**
     * 0°.
     */
    ANGLE_0("0"),
    
    /**
     * 90°.
     */
    ANGLE_90("90"),
    
    /**
     * 180°.
     */
    ANGLE_180("180"),
    
    /**
     * 270°.
     */
    ANGLE_270("270");
    
    String degree;
    
    RotationDegree(String degree) {
        this.degree = degree;
    }
    
    /**
     * Get the value corresponding to this RotationDegree.
     * @return the command line option value corresponding to this RotationDegree.
     */
    public String getValue() {
        return degree;
    }
}

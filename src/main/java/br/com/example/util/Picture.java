package br.com.example.util;

import java.io.File;

/**
 * <b>Abstraction for a picture taken by the camera pi using the Raspoid
 * raspistill wrapper.</b>
 * 
 * @author Julien Louette &amp; Ga&euml;l Wittorski
 * @version 1.0
 */
public class Picture {
    
    private PictureConfig config;
    private String filePath;
    
    /**
     * Constructor for a new Picture, using a specific PictureConfig and
     * the file path of the picture on the system.
     * @param config the PictureConfig used to take this picture.
     * @param filePath the complete file path of the picture on the system.
     */
    public Picture(PictureConfig config, String filePath) {
        this.config = config;
        this.filePath = filePath;
    }
    
    /**
     * Get the PictureConfig used to take this Picture.
     * @return the PictureConfig used to take this Picture.
     */
    public PictureConfig getConfig() {
        return config;
    }
    
    /**
     * Get the complete file path of the picture file on the system.
     * @return the complete file path of the picture file on the system.
     */
    public String getFilePath() {
        return filePath;
    }
    
    /**
     * Get the abstract representation of the picture file.
     * @return the java.io.File instance corresponding to the picture file.
     */
    public File getFile() {
        return new File(this.filePath);
    }
    
    @Override
    public String toString() {
        return "(Picture) Config: " + config.getCommand() +
                " | file path: " + filePath;  
    }
}
package br.com.example.util;

/**
 * <b>Available encodings to use for new picture output files.</b>
 * 
 * <p>Valid options are jpg, bmp, gif and png. Note that unaccelerated image types (gif, png, bmp)
 * will take much longer to save than JPG which is hardware accelerated.</p>
 * 
 * @author Julien Louette &amp; Ga&euml;l Wittorski
 * @version 1.0
 */
public enum PictureEncoding {
    
    /**
     * jpg.
     */
    JPG("jpg"),
    
    /**
     * bmp.
     */
    BMP("bmp"),
    
    /**
     * gif.
     */
    GIF("gif"),
    
    /**
     * png.
     */
    PNG("png");
    
    String encoding;
    
    PictureEncoding(String encoding) {
        this.encoding = encoding;
    }
    
    /**
     * Get the value corresponding to this PictureEncoding.
     * @return the command line option value corresponding to this picture encoding.
     */
    public String getValue() {
        return encoding;
    }
}

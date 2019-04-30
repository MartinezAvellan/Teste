package br.com.example.util;

/**
 * <b>Available initial states on camera startup with raspivid.</b>
 * 
 * @author Julien Louette &amp; Ga&euml;l Wittorski
 * @version 1.0
 */
public enum InitialState {
    
    /**
     * Start recording.
     */
    RECORD("record"),
    
    /**
     * Start in pause mode.
     */
    PAUSE("pause");
    
    String state;
    
    InitialState(String state) {
        this.state = state;
    }
    
    /**
     * Get the value corresponding to this InitialState.
     * @return the command line option value corresponding to this initial state.
     */
    public String getValue() {
        return state;
    }
}
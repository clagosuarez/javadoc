/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

/**
 *  Class Mouse (instance typeMouse)
 * @author clagosuarez
 */
public class Mouse {
    private String typeMouse;
    
    /**
     * Default constructor without parameters
     */
    public Mouse(){
    
    }

    /**
     * Default constructor with parameters
     * @param type Mouse type (trackball, optical, wireless...)
     */
    public Mouse(String type){
        this.typeMouse = type;
    }
    
    /**
     * Get the value of typeMouse (class Mouse)
     * @return Mouse type (trackball, optical, wireless...)
     */
    public String getTypeMouse(){
        return typeMouse;
    }

    /**
     * Set the value of typeMouse (class Mouse)
     * @param typeMouse Mouse type (trackball, optical, wireless...)
     */
    public void setTypeMouse(String typeMouse){
        this.typeMouse = typeMouse;
    }
}

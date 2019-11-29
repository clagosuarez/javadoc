/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

/**
 * Class PC (instance objMouse, objScreen and objCpu)
 * @author clagosuarez
 */
public class PC {
     /**
     * Instance the private variables objMouse, objScreen and objCpu
     */
    private Mouse objMouse;
    private Screen objScreen;
    private Cpu objCpu;
    
    /**
     * Default constructor without parameters
     */
    public PC(){
    
    }

    /**
     * Default constructor with parameters
     * @param objMouse
     * @param objScreen
     * @param objCpu
     */
    public PC(Mouse objMouse, Screen objScreen, Cpu objCpu){
        this.objMouse = objMouse;
        this.objScreen = objScreen;
        this.objCpu = objCpu;
    }
    
    /**
     * Get the value of objMouse (class Mouse)
     * @return objMouse (returns typeMouse)
     */
    public Mouse getMouse(){
        return objMouse;
    }

    /**
     * Get the value of objScreen (class Screen)
     * @return
     */
    public Screen getScreen(){
        return objScreen;
    }

    /**
     * Get the value of objCpu (class Cpu)
     * @return
     */
    public Cpu getCpu(){
        return objCpu;
    }

    /**
     * Set the value of objMouse (class Mouse)
     * @param objMouse (returns typeMouse)
     */
    public void setMouse(Mouse objMouse){
        this.objMouse = objMouse;
    }

    /**
     * Set the value of objScreen (class Screen)
     * @param objScreen
     */
    public void setScreen(Screen objScreen){
        this.objScreen = objScreen;
    }

    /**
     * Set the value of objCpu (class Cpu)
     * @param objCpu
     */
    public void setCpu(Cpu objCpu){
        this.objCpu = objCpu;
    }
    /**
     * Returns the type and mark in a single string
     * @return 
     */
    @Override
    public String toString(){
        return("type: " + objMouse.getTypeMouse() + "\nMark " + objScreen);
    }
//    public void amosar(){
//        System.out.println("Tipo rato: "+objMouse.getTipo()+"\n Marca pantalla: "+objScreen.getMarca()+"\n Pulgadas pantalla: "+objScreen.getPulgadas()+"\n Velocidade cpu: "+objCpu.getVelocidade()+"\n Memoria cpu: "+objCpu.getMemoria());
//    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

/**
 * Class Cpu (instance speed and memory)
 * @author clagosuarez
 */
public class Cpu {
    private int speed;
    private int memory
;    
    /**
     * Default constructor without parameters
     */
    public Cpu(){
        
    }

    /**
     * Default constructor with parameters
     * @param speed
     * @param memory
     */
    public Cpu(int speed, int memory){
        this.speed = speed;
        this.memory = memory;
    }
    
    /**
     * Get the value of speed (int)
     * @return
     */
    public int getSpeed(){
        return speed;
    }

    /**
     * Get the value of memory (int)
     * @return
     */
    public int getMemory(){
        return memory;
    }

    /**
     * Set the value of speed (int)
     * @param speed
     */
    public void setSpeed(int speed){
        this.speed = speed;
    }

    /**
     * Set the value of memory (int)
     * @param memory
     */
    public void setMemory(int memory){
        this.memory = memory;
    }
}

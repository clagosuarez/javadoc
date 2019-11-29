/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

/**
 * Class Screen (inches)
 * @author clagosuarez
 */
public class Screen {
    /**
     * Instance the private variables brand and pulgada1
     */
    private String brand;
    private float inches;
    /**
     * Default constructor without parameters
     */
    public Screen(){
        
    }
    /**
     * Default constructor with parameters
     * @param brand
     * @param inches 
     */
    public Screen(String brand, float inches){
        this.brand = brand;
        this.inches = inches;
    }
    /**
     * Get the value of brand (string)
     * @return 
     */
    public String getBrand(){
        return brand;
    }
    /**
     * Get the value of inches (float)
     * @return 
     */
    public float getInches(){
        return inches;
    }
    /**
     * Change the brand to the value we assign by parameter when calling the method
     * @param brand 
     */
    public void setBrand(String brand){
        this.brand = brand;
    }
    /**
     * Change the inches to the value we assign by parameter when calling the method
     * @param inches 
     */
    public void setInches(float inches){
        this.inches = inches;
    }
    /**
     * Get the brand and inches inside the same string
     * @return
     */
    @Override
    public String toString(){
        return(brand+inches);
    }
}

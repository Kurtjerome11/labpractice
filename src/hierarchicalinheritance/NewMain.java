/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hierarchicalinheritance;

/**
 *
 * @author Mhacee Caryl
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Bark();
        dog.Eat();
        
        Cat cat = new Cat();
        cat.Meow();
        cat.Eat();
        
        Pig pig = new Pig();
        pig.Oink();
        pig.Eat();
    }
    
}

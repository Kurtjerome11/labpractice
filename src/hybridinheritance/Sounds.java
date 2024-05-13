/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hybridinheritance;

/**
 *
 * @author Mhacee Caryl
 */
public class Sounds implements Cat,Pig{

    @Override
    public void Bark() {
        System.out.println("Barking");
    }

    @Override
    public void Meow() {
        System.out.println("Meowing");
    }

    @Override
    public void Oink() {
        System.out.println("Oinking");
    }
    
}

package Subsystem;

public class CPU{
    public CPU(){
        System.out.println("Creating CPU...");
    }

    public void freeze(){
        System.out.println("CPU frozen...");
    }

    public void jump(int position){
        System.out.println("Jumping to instruction " + position + "...");
    }

    public void execute(){
        System.out.println("Executing instruction...");
    }
}
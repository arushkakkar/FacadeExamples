package Client;

import Facade.ComputerFacade;

public class Client {
    public static void main(String[] args){
        ComputerFacade myComputer = new ComputerFacade();
        myComputer.start();
    }
}
package Facade;

import Subsystem.CPU;
import Subsystem.Memory;
import Subsystem.HardDrive;

public class ComputerFacade{
    CPU processor;
    Memory RAM;
    HardDrive hdd;

    public ComputerFacade(){
        processor = new CPU();
        RAM = new Memory();
        hdd = new HardDrive();
    }

    public void start(){
        processor.freeze();
        RAM.load(0, hdd.read(1, 100));
        processor.jump(0);
        processor.execute();
    }
}
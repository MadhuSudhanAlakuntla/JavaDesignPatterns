package StructuralDesignPatterns.AdapterDesign.ClassAndObjectAdapterPattern;

public class Client {


        public static void main(String[] args) {

            // using the constructor for composite implementation is called as Object Adapter Pattern this one is preferred

            ElectricCar electricCar = new ElectricCar();
            Car electricCarAdapter = new ElectricCarAdapter(electricCar);

            System.out.println("Testing electric car through adapter:");
            electricCarAdapter.startEngine();
            electricCarAdapter.accelerate();
            electricCarAdapter.stopEngine();
        }


        // without using the constructor  of adapter class is called as ClassAdapter pattern

//            Car car = new ElectricCarAdapter();
//            car.startEngine();
//            car.accelerate();
//            car.stopEngine();
        }



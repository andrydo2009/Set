
import AllDrivers.BusDriver;
import AllDrivers.CarDriver;
import AllDrivers.TruckDriver;
import AllMechanics.Mechanic;
import AllMechanics.VehicleRepairSpecification;
import AllTransport.*;

import java.util.*;


public class Main {

    public static void checkDiagnosis(Transport... transports) {
        for (Transport transport : transports)
            try {
                transport.getDiagnosisTransport ();
            } catch (CantDiagnosisException e) {
                System.out.println ( e.getMessage () );
            }
    }

    public static void main(String[] args) {


        Car car1 = new Car ( "Lada" , "Granta" , 1.7 , BodyType.SEDAN );
        Car car2 = new Car ( "Audi" , "A8 50 L TDI quattro" , 3.0 , BodyType.UNIVERSAL );
        Car car3 = new Car ( "BMW" , "Z8" , 3.0 , BodyType.COUPE );
        Car car4 = new Car ( "KIA" , "Sportage" , 2.4 , BodyType.CROSSOVER );


        Bus bus1 = new Bus ( "Volvo" , "B12" , 12.5 , Seats.EXTRA_SMALL );
        Bus bus2 = new Bus ( "Golden Dragon" , "XML6127" , 10.5 , Seats.BIG );
        Bus bus3 = new Bus ( "MAN" , "Lion's Coach" , 11.0 , Seats.EXTRA_BIG );
        Bus bus4 = new Bus ( "Scania" , "Irizar" , 10.6 , Seats.EXTRA_SMALL );

        Truck truck1 = new Truck ( "Mercedes-Benz" , "Actros" , 12.8 , Carrying.N2 );
        Truck truck2 = new Truck ( "Freightliner" , "FLD" , 14.0 , Carrying.N2 );
        Truck truck3 = new Truck ( "Daf" , "XF" , 13.2 , Carrying.N1 );
        Truck truck4 = new Truck ( "Volvo" , "FH" , 12.8 , Carrying.N3 );


        CarDriver<Car> Ivan = new CarDriver<> ( "Ivan Ivanovich Ivanov" , "B" , 5 );
        BusDriver<Bus> Oleg = new BusDriver<> ( "Oleg Petrovich Petrov" , "D" , 10 );
        TruckDriver<Truck> Semen = new TruckDriver<> ( "Semen Semenovich Semenov" , "C" , 20 );
        CarDriver<Car> Ivan2 = new CarDriver<> ( "Ivan Ivanovich Ivanov" , "B" , 5 );
        BusDriver<Bus> Oleg2 = new BusDriver<> ( "Oleg Petrovich Petrov" , "D" , 10 );
        TruckDriver<Truck> Semen2 = new TruckDriver<> ( "Semen Semenovich Semenov" , "C" , 20 );



        Car car5 = new Car ( "Lada" , "Granta" , 1.7 , BodyType.SEDAN );
        Car car6 = new Car ( "Audi" , "A8 50 L TDI quattro" , 3.0 , BodyType.UNIVERSAL );
        Car car7 = new Car ( "BMW" , "Z8" , 3.0 , BodyType.COUPE );
        Car car8 = new Car ( "KIA" , "Sportage" , 2.4 , BodyType.CROSSOVER );

        Bus bus5 = new Bus ( "Volvo" , "B12" , 12.5 , Seats.EXTRA_SMALL );
        Bus bus6 = new Bus ( "Golden Dragon" , "XML6127" , 10.5 , Seats.BIG );
        Bus bus7 = new Bus ( "MAN" , "Lion's Coach" , 11.0 , Seats.EXTRA_BIG );
        Bus bus8 = new Bus ( "Scania" , "Irizar" , 10.6 , Seats.EXTRA_SMALL );

        Truck truck5 = new Truck ( "Mercedes-Benz" , "Actros" , 12.8 , Carrying.N2 );
        Truck truck6 = new Truck ( "Freightliner" , "FLD" , 14.0 , Carrying.N2 );
        Truck truck7 = new Truck ( "Daf" , "XF" , 13.2 , Carrying.N1 );
        Truck truck8 = new Truck ( "Volvo" , "FH" , 12.8 , Carrying.N3 );

        Mechanic mechanic1 = new Mechanic ( "Fedor" , "Fedorov" , "MegaCar" , VehicleRepairSpecification.SPECIFICATION_CAR );
        Mechanic mechanic2 = new Mechanic ( "Ivan" , "Ivanov" , "MegaTruck" , VehicleRepairSpecification.SPECIFICATION_TRUCK );
        Mechanic mechanic3 = new Mechanic ( "Sergei" , "Sergeev" , "MegaBus" , VehicleRepairSpecification.SPECIFICATION_BUS );
        Mechanic mechanic4 = new Mechanic ( "Andrew" , "Andreev" , "MegaAvto" , VehicleRepairSpecification.SPECIFICATION_UNIVERSAL );
        Mechanic mechanic5 = new Mechanic ( "Petr" , "Petrov" , "MegaCar" , VehicleRepairSpecification.SPECIFICATION_CAR );

        HashSet<Mechanic> mechanicHashSet=new HashSet<> ();
        mechanicHashSet.add ( mechanic1 );
        mechanicHashSet.add ( mechanic1 );
        mechanicHashSet.add ( mechanic2 );
        mechanicHashSet.add ( mechanic3 );
        mechanicHashSet.add ( mechanic1 );
        mechanicHashSet.add ( mechanic5 );
        mechanicHashSet.add ( mechanic2 );
        mechanicHashSet.add ( mechanic4 );
        mechanicHashSet.add ( mechanic5 );

        System.out.println ("Проверяем не выводятся ли дубли");

        for (Mechanic mechanic : mechanicHashSet) {
            System.out.println (mechanic);
        }

        System.out.println ("Выводим итератор через итератор");

        Iterator<Mechanic> iterator=mechanicHashSet.iterator ();
        while (iterator.hasNext ())
        {
            System.out.println (iterator.next ());
        }






    }



}

//THE END


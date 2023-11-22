// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Airpurifier f = new Airpurifier("Xiaomi Pro", "K69");
        f.turnOn(2.5);
        System.out.println("----turn on-----");
        System.out.print("Power: ");System.out.println(f.power);
        System.out.print("PM: ");System.out.println(f.PM);
        System.out.print("SpeedFan: ");System.out.println(f.SpeedFan);
        System.out.print("Mode: ");System.out.println(f.Mode);
        f.turnOff();
        System.out.println("----turn of-----");
        System.out.print("Power: ");System.out.println(f.power);
        System.out.print("PM: ");System.out.println(f.PM);
        System.out.print("SpeedFan: ");System.out.println(f.SpeedFan);
        System.out.print("Mode: ");System.out.println(f.Mode);
        f.turnOn(2.5);
        System.out.println("----SetSpeedFan-----");
        System.out.println(f.SpeedFan);
        f.SetSpeedFan();
        System.out.println(f.SpeedFan);
        f.SetSpeedFan();
        System.out.println(f.SpeedFan);
        System.out.println("----SetMode-----");
        System.out.println(f.Mode);
        f.SetMode();
        System.out.println(f.Mode);
        f.SetMode();
        System.out.println(f.Mode);
        System.out.println("----ShowModelCount-----");
        Airpurifier.ShowModelCount();
        Airpurifier a = new Airpurifier("Xiaomi Pro", "K69");
        Airpurifier.ShowModelCount();
        Airpurifier b = new Airpurifier("Xiaomi Pro", "K69");
        Airpurifier.ShowModelCount();
    }
}
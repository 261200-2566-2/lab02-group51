import java.util.Objects;
public class Airpurifier {
    String model;
    String serialNo;
    boolean power;
    String Mode;
    int SpeedFan;
    double PM;
    public void turnOn(double x) {
        power = true;
        PM = x;
        SpeedFan = 1;
        Mode = "NormalMode";
    };
    void turnOff() {
        power = false;
        this.PM = 0;
        this.SpeedFan = 0;
        Mode = "";
    };
    void SetSpeedFan() {
        SpeedFan++;
        if (SpeedFan > 5) {
            SpeedFan = 1;
        }
    };
    void SetMode() {
        if (Objects.equals(Mode, "NormalMode")) {
            Mode = "AutoMode";
        } else if (Objects.equals(Mode, "AutoMode")) {
            Mode = "SleepMode";
        } else if (Objects.equals(Mode, "SleepMode")) {
            Mode = "NormalMode";
        }

    };
    static int modelCount;
    static void ShowModelCount(){
        System.out.println(Airpurifier.modelCount);
    }

    Airpurifier(String model, String serialNo) {

        this.model = model;
        this.serialNo = serialNo;
       modelCount++;
    }
}

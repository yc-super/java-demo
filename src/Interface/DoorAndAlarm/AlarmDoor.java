package Interface.DoorAndAlarm;

public class AlarmDoor extends Door implements Alarm {
    @Override
    public void alarmimg() {
        System.out.println("报警");
    }

    @Override
    public void open() {
        System.out.println("开门功能");
    }

    @Override
    public void close() {
        System.out.println("关门功能");
    }
}

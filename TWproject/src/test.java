public class test{
    public static void main(String[] args) {
        Wristband wristband=new Wristband();
        wristband.sensor.Set_Heartrhythm(140);  
        System.out.println(wristband.sensor.Get_Heartrhythm());
        System.out.println(Controller.Record_Heart_Rhythm(wristband.sensor.Get_Heartrhythm()));
    }
 }
 
public class test{
    public static void main(String[] args) {
        Wristband wristband=new Wristband();
        wristband.sensor.Set_Heartrhythm(140);  
        System.out.println(wristband.sensor.Get_Heartrhythm());
        System.out.println(Controller.Record_Heart_Rhythm(wristband.sensor.Get_Heartrhythm()));
        System.out.println(Controller.Get_Message());
        wristband.sensor.Set_Heartrhythm(90);
        System.out.println(wristband.sensor.Get_Heartrhythm());
        Controller.Record_Heart_Rhythm(wristband.sensor.Get_Heartrhythm());
        SendMsg.Decrease_n(false);
        
        System.out.println(Controller.Get_Message());
        wristband.blood_oxy.Set_blood_oxy(98);
        System.out.println(wristband.blood_oxy.Get_bloodoxy());
    }
 }
 
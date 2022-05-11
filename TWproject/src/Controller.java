import java.sql.SQLException;

import javax.swing.text.html.HTMLDocument.BlockElement;

public class Controller  {
    private static int heart_rhythm;
    private double longgps;
    private double latigps;
    private boolean button;
    private int light_time_h;
    private int light_time_m;
    private boolean notify_accept;
    static boolean haveproblem;
    

    private int Abnomrmal_Heart_Rythm;
   
    public static int Get_Heartrhythm(){
        return heart_rhythm;
    }
    public double Get_LongGPS(){
        return longgps;
    }
    public double Get_LatutudeGPS(){
        return latigps;
    }

    public static String Record_Heart_Rhythm(int heart_rhythm){
        return Determine_health_condition.Determine(heart_rhythm);
    }
    public static String Get_Message(){
        return SendMsg.Send_Message();
    }
    public boolean Get_Light(){
        return true;
    }
    public Boolean Get_Result(){
        return true;
    }
    public String Get_Sos(){
        return "";
    }
    public static void main(String[] args) throws SQLException {
        Wristband wristband=new Wristband();
        Mysqlmanager mysqlmanager=new Mysqlmanager();
        wristband.sensor.Set_Heartrhythm(140);  
        System.out.println(wristband.sensor.Get_Heartrhythm());
        System.out.println(Controller.Record_Heart_Rhythm(wristband.sensor.Get_Heartrhythm()));
        System.out.println(Controller.Get_Message());
        wristband.sensor.Set_Heartrhythm(90);
        System.out.println(wristband.sensor.Get_Heartrhythm());
        Controller.Record_Heart_Rhythm(wristband.sensor.Get_Heartrhythm());
        SendMsg.Decrease_n(false);
        System.out.println(Controller.Get_Message());
        wristband.sensor.Set_Heartrhythm(60);
        System.out.println(wristband.sensor.Get_Heartrhythm());
        Controller.Record_Heart_Rhythm(wristband.sensor.Get_Heartrhythm());
        SendMsg.Decrease_n(true);
        
        System.out.println(Controller.Get_Message());
        wristband.blood_oxy.Set_blood_oxy(98);
        System.out.println(wristband.blood_oxy.Get_bloodoxy());
        wristband.gps.Set_GPS(40.123456789,60.12345678);
        System.out.println(wristband.gps.Get_LatutudeGPS());
        System.out.println(wristband.gps.Get_LongGPS());
        mysqlmanager.connect();
        mysqlmanager.Insert_Condition(wristband.sensor.Get_Heartrhythm(), wristband.blood_oxy.Get_bloodoxy(), Controller.Get_Message(), wristband.gps.Get_LongGPS(), wristband.gps.Get_LatutudeGPS());
        
    }
}

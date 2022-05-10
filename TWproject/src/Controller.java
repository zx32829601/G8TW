import javax.swing.text.html.HTMLDocument.BlockElement;

public class Controller  {
    private int heart_rhythm;
    private double longgps;
    private double latigps;
    private boolean button;
    private int light_time_h;
    private int light_time_m;
    private boolean notify_accept;
    static boolean haveproblem;
    

    private int Abnomrmal_Heart_Rythm;
   
    public int Get_Heartrhythm(){
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
}

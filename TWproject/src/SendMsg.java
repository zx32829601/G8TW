import java.sql.Blob;

public class SendMsg{
    private static int n;
    
    public static String Send_Message(){
        if(n==10){
        return "abnormal";

        }else if(n>0){
            return "normal but have condition previous";
        }
        else{
            return "normal";
        }
    }
    public static void Set_n(){
        
            n=10;
        
    }
    public void Decrease_n(boolean notify_accept){
        if(notify_accept == false){
            n-=1;
        }else if(notify_accept == true){
            n=0;
        }
    }
}

 class Lightset{
    
    public boolean setLight(int light_time_h, int light_time_m){
        return true;
    }
}

 class Determine_health_condition{

    public static String Determine(int heart_rhythm){
        if(heart_rhythm <= 60 || heart_rhythm>=100){
            SendMsg.Set_n();
            return "abnormal";
            
            

        }else{
            return "normal";
            
            
            
        }
    }
}

 class SOS{
    
    public String Sos_msg(boolean Button){
        if(Button == true){
            return "Emergency";
        }
        return null;
    }
}
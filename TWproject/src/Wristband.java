public class Wristband {
    private boolean light_sw;
    private boolean lock;
    private Emergency_button emergency_button =new Emergency_button();
    private GPS gps=new GPS();
    Sensor sensor=new Sensor();
    private Blood_oxy blood_oxy=new Blood_oxy();

    public boolean Set_Light(boolean light){
        if (light == true){
            return true;
        }else{
            return false;
        }
    }
    public boolean Lock_Switch(){
        return true;
    }
}
 class Sensor{
    public int heartrhythm;
        
    public int Get_Heartrhythm(){
        return heartrhythm;
    }
    public void Set_Heartrhythm(int h){
        this.heartrhythm=h;
    }
}
 class GPS{
    public double longgps;
    public double latitudegps;
 
    public double Get_LongGPS(){
        return longgps;
        
    }
    public double Get_LatutudeGPS(){
        return latitudegps;
    }
    public void Set_GPS(double longps,double latu){
        this.longgps=longps;
        this.latitudegps=latu;
    }
}
 class Emergency_button{
    public boolean button;

    public boolean Needhelp(){
        return true;
    }
}
class Blood_oxy{
    public float bloodoxy;

    public void Set_bloodoxy(float blood){
        this.bloodoxy=blood;

    }
    public float Get_bloodoxy(){
        return this.bloodoxy;
    }
}







public class Stove {
	private Pan pan;
    public boolean State;
    public Pan Pan;// { set { pan = value; } get { return pan; } }
    
    public void setPan (Pan value){
    	pan=value;                     //{ set { pan = value; }
    }
    
    public Pan getPan (){
    	return pan;             // get { return pan; }
    }
        
    public void Cook()
    {
        if (State)
        {
            while (!pan.IsReady())
            {
                pan.GetHeat();
            }
        }
    }
}

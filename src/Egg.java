
public class Egg {
	 public int countEggs;
   //  public int has_ready = 0;
     private int dirty = 10;
     public boolean Have_salt;

     public boolean Mixed;
     public boolean Mixed_with_salt;
     public boolean Have_shell;
     public int Has_ready=0;
    

     public int Dirty =10;
     public int getDirty() { 
         return this.Dirty;
      }
      public void setDirty(int dirty) { 
    	  if (dirty > -1 && dirty < 11) //{ set { if (value > -1 && value < 11) dirty = value; } get { return dirty; } }
         this.Dirty=dirty;
      }
      
    
     public void GetHeat()
     {
         if (Has_ready < 10)
         {
             Has_ready++;
         }
         else return;        		 
     }
}

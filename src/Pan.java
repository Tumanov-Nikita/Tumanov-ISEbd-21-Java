
public class Pan {
	private Milk[] milk;
    private Water[] water;
    private Egg[] eggs;
    private Salt salt;
    public boolean ReadyToGo;
    public boolean getReadyToGo() {
    	return Check();
    }
    
    
    public void Init(int countEggs, int CountMilk)
    {
        water = new Water[3];
        eggs = new Egg[countEggs];
        milk = new Milk[CountMilk];
    }


    public void AddEggs(Egg e)
    {
        for (int i = 0; i < eggs.length; i++)
        {
            if (eggs[i] == null)
            {
                eggs[i] = e;
                return;
            }
        }
    }

    public boolean Check()
    {
     
        if (eggs.length == 0)
        {
            return false;
        }         
        for (int i = 0; i < eggs.length; ++i)
        {
            if (eggs[i] == null)
            {
                return false;
            }
        }
        return true;
    }

    public void AddSalt(Salt s)
    {
                salt = s;
    }

    public void AddMilk(Milk m)
    {
        for (int i = 0; i < milk.length; i++)
        {
            if (milk == null)
            {
                milk[i] = m;
                return;
            }
        }         
    }

    public void GetHeat()
    {
        if (!Check())
        {
            return;
        }
        if (eggs.length > 0)
        {
            for (int i=0; i < eggs.length; i++)
            {
                eggs[i].GetHeat();
            }
        }
    }


    public boolean IsReady()
    {
        for (int i=0; i < eggs.length; i++)
        {
            if (eggs[i].Has_ready < 10)
            {
                return false;
            }
        }
        return true;
    }

    public Egg[] GetEggs()
    {
        return eggs;
    }
}

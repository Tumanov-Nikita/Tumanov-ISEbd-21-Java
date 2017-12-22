
public class WaterTap {

        public boolean State; 
        public void Wash(Egg p)
        {
            if (State)
            {
                p.Dirty = 0;
            }
        }
}

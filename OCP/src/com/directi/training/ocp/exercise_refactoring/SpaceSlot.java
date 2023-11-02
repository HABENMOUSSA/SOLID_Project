package com.directi.training.ocp.exercise;

public class SpaceSlot extends Variable
{
	protected int resourceId;


    private void markSpaceSlotFree(int resourceId)
    {
    }


    private void markSpaceSlotBusy(int resourceId)
    {
    }

    private int findFreeSpaceSlot()
    {
        return 0;
    }

    public void allocate()
    {
    	resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
    }
    
    public  void free(int a) 
    {
    	markSpaceSlotFree(a);
    }
}

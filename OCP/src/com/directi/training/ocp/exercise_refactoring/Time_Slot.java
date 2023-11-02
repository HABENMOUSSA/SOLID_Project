package com.directi.training.ocp.exercise;

public class TimeSlot extends Variable 
{
   
	private int resourceId;

    private void markTimeSlotFree(int resourceId)
    {
    }


    private void markTimeSlotBusy(int resourceId)
    {
    }

    private int findFreeTimeSlot()
    {
        return 0;
    }
    
    public void allocate()
    {
    	resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
    }
    
    public  void free(int a) 
    {
    	 markTimeSlotFree(a);
    }

 
}

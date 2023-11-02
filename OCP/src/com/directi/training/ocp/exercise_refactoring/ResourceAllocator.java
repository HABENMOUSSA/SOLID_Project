package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Variable var)
    {
        
             if (var.resourceId = INVALID_RESOURCE_ID) 
             { System.out.println("ERROR: Attempted to allocate invalid resource");}
            else {
            var.allocate();
            }
        }
        return var.resourceId;
    

    public void free(Variable var, int resourceId)
    {
        
            var.free(resourceId);
    }
    
}

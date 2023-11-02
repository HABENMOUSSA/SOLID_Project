package com.directi.training.ocp.example_refactored;

public abstract class Variable
{	       

	protected int resourceId;

    public int getId ()
    {
        return resourceId ;
    }
    
    public abstract  void allocate() ;
    public abstract void free(int) ;
    
    
}

package com.leatcode.trappingwater;
public class TrappingRainWater{

	
	    public int trap(int[] height) {
	      // Input: [0,1,0,2,1,0,1,3,2,1,2,1]
	      // Output: 6
	        if(height.length==0) return 0;
	        int lftMax = 0;
	        int rgtMax = 0;
	        int lft = 0;
	        int rgt = height.length-1;
	        int trappedUnit = 0;
	        while(lft<rgt){
	            if(height[lft] > lftMax) lftMax = height[lft];
	            if(height[rgt] > rgtMax) rgtMax = height[rgt];
	            if(lftMax < rgtMax){
	                trappedUnit+=Math.max(0,lftMax-height[lft]);
	                lft++;

	            }else{
	                trappedUnit+=Math.max(0,rgtMax-height[rgt]);
	                rgt--;
	            }
	        }
	        return trappedUnit;
	        
	    }
	    
	    
	    
	
}

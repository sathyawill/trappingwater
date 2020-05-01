package com.leatcode.trappingwater;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class TrappingRainWaterTest {

	int height[] = {};
	int trappedUnit = 0;
	TrappingRainWater trappingRainWater = new TrappingRainWater();
    
    @Parameters(name="{index}: Test with url={0}, result: {1}")
    public static Iterable<Object[]> data() {
    	return Arrays.asList(new Object[][] {
    		{new int[] {1,0,2},1},
    		{new int[] {1,2},0},
    		{new int[] {1,1,1},0},
    		{new int[] {2,0,1},1},
    		{new int[] {0,1,0,2,1,0,1,3,2,1,2,1},6}
   		
    	});
    }
    
    public TrappingRainWaterTest(int[] height, int expected) {
    	this.height = height;
    	this.trappedUnit = expected;
    }
    
    @Test
    public void testUrlServiceResults() {
    	assertEquals(trappedUnit,trappingRainWater.trap(height));
    }
    

    
}

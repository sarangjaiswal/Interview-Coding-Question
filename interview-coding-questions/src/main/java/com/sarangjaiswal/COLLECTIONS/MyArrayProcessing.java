package com.sarangjaiswal.COLLECTIONS;

import org.junit.Assert;
import org.junit.Test;

public class MyArrayProcessing {
    public static int[] whatAmIdoing(int[] input){
         
        int j = 0;
        int i = 1;
        
        if(input.length < 2){
            return input;
        }
        while(i < input.length){
            if(input[i] == input[j]){
                i++;
            }else{
                input[++j] = input[i++];
            }   
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = input[k];
        }
         
        return output;
    }
    
    
    @Test
    public void testWhatAmIDoing_happypath() {
    	int[] arr_input = {1, 2, 2, 3};
    	int[] arr_actuals = whatAmIdoing(arr_input);
    	int[] arr_expected = {1, 2, 3};
    	Assert.assertArrayEquals(arr_actuals, arr_expected);
    }
    
    @Test
    public void testWhatAmIDoing_boundaryvalue() {
    	int[] arr_input = {1};
    	int[] arr_actuals = whatAmIdoing(arr_input);
    	int[] arr_expected = {1};
    	Assert.assertArrayEquals(arr_actuals, arr_expected);
    }    
    
    
    public static void main(String[] args) {
    	
    	int[] array = {1, 2, 2, 3};
    	int[] test = whatAmIdoing(array);
    	
    	for(int i=0;i<test.length;i++) {
    		System.out.println(test[i]);
    	}
    }
    
}

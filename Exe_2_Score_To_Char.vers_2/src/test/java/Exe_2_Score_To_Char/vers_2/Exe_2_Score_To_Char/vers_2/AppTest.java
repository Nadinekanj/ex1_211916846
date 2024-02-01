package Exe_2_Score_To_Char.vers_2.Exe_2_Score_To_Char.vers_2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
	public void exe_2_Partition_B_min() {
		
		String result = App.NumberToChar(80);
		String expected_result="B";
		org.junit.Assert.assertEquals(expected_result,result);
	}
	@Test
	public void exe_2_Partition_B_min_plus1() {
		
		String result = App.NumberToChar(81);
		String expected_result="B";
		org.junit.Assert.assertEquals(expected_result,result);
	}
	@Test
	public void exe_2_Partition_B_Nominal() {
		
		String result = App.NumberToChar(85);
		String expected_result="B";
		org.junit.Assert.assertEquals(expected_result,result);
	}
	@Test
	public void exe_2_Partition_B_Max() {
		
		String result = App.NumberToChar(89);
		String expected_result="B";
		org.junit.Assert.assertEquals(expected_result,result);
	}
	
	@Test
	public void exe_2_Partition_B_Max_minus1() {
		
		String result = App.NumberToChar(88);
		String expected_result="B";
		org.junit.Assert.assertEquals(expected_result,result);
	}
}

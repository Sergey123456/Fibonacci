/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritms;

/**
 *
 * @author Sergey
 */
public class FibonacciLoops {

	public static int getFib(int index) {
		if (index < 0) {
			return -1;
		}
		
		if (index == 0 || index == 1) {
			return 1;
		}
		
		int fibValue = 1, lastValue = 1;
		for (int i = 2; i <= index; i++) {
			int tmp = fibValue;
			fibValue = lastValue + fibValue;
			lastValue = tmp;
		}
		return fibValue;
	}
	
}

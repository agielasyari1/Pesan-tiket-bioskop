/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bioskop;

/**
 *
 * @author Agiel Asy'ari
 */
public class RandomOrder {
    public int RandomOrdNum (int OrderNo) {
    int num1;
    num1 = 66325 + (int) (Math.random() * 4238);
    OrderNo += num1 + 66325;
        return OrderNo;
	}
}

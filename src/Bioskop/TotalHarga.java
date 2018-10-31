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
public class TotalHarga {
    int sweet, velvet, gold, reg;
    private int total;
    public int total (int total) {
    setHarga();
    Main obj1 = new Main();
    Main obj2 = new Main();
    Main obj3 = new Main();
    Main obj4 = new Main();
        
    this.total = (sweet * (obj1.getSweet()) + (velvet * (obj2.getVelvet())) + (gold * (obj3.getGold())) + (reg * (obj4.getReg())));
        return total;
}
public int getTotal() {
    return total;
}
public void setHarga(){
    Main Harga = new Main();
    if (Harga.getSelectedDay().equals("Senin")) {
        sweet = 92000;
        velvet = 67000;
        gold = 42000;
        reg = 32000;
}
    else {
        sweet = 100000; 
        velvet = 75000;
        gold = 50000;
        reg = 40000;
}
}
}

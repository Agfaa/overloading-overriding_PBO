/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;

public class vector { 
    private int[] cost = new int[3];

    public vector (int a, int b, int c) {
        this.cost[0] = a;
        this.cost[1] = b;
        this.cost[2] = c;
    }

    public void setCost (int in, int val) {
        this.cost[in] = val;
    }

    public int getCost (int in) {
        return this.cost[in];
    }

    public int increase (vector vec) {
        int result = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print(result+" + (" +this.cost[i] + "," +this.cost[i]+ ") = " );
            result += this.getCost(i) * vec.getCost(i);
            System.out.print(result);
        }
        return result;
    }

    public void display () {
        System.out.println("(" + this.cost[0] + ","+ this.cost[1] + ","+ this.cost[2] +")");
    }

    public vector increase (int scal) {
        vector res = new vector(0, 0, 0);
        for (int i = 0; i < 3; i++) {
            res.setCost(i, this.getCost(i) * scal);
        }
        return res;
    }
}
    

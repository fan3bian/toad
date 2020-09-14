package concurrency.thread;

import lombok.Data;

@Data
public class BaeldungSynchronizedMethods {
 
    private int sum = 0;
 
    public void calculate() {
        setSum(getSum() + 1);
    }
 
    // standard setters and getters
}
import java.util.*;

class RandomNumberGenerator extends Thread{
    public void start(){
        Random random = new Random();

        for(int i = 0; i<10; i++){
            int randomInt = random.nextInt(10);

            if(randomInt % 2==0){
                SquareThread st = new SquareThread(randomInt);
                st.start();
            }else{
                CubeThread ct = new CubeThread(randomInt);
                ct.start();
            }

            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
}

class SquareThread extends Thread{
    int n;

    SquareThread(int num){
        this.n = num;
    }

    public void start(){
        System.out.println("Square of "+n+" is "+n*n);
    }
}

class CubeThread extends Thread{
    int n;

    CubeThread(int num){
        this.n = num;
    }

    public void start(){
        System.out.println("Cube of "+n+" is "+n*n*name);
    }
}

public class AppletExample{
    public static void main(String args[]){
        RandomNumberGenerator rn = new RandomNumberGenerator();
        rn.start();
    }
}
        

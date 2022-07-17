import java.util.Scanner;

class Time {
    int hours;
    int minutes;
    Scanner sc = new Scanner ( System.in);

    void getdetails(){
        System.out.println(" enter hours:");
        hours=sc.nextInt();

        System.out.println(" enter minutes:");
        minutes=sc.nextInt();

    }

    Time addtime(Time t2){
        Time t3= new Time();
        t3.hours=hours+t2.hours;
        t3.minutes=minutes+t2.minutes;

        if(t3.minutes>=60){
            t3.hours++;
            t3.minutes-=60;

        }
        return t3;
    }
    void display(){
        System.out.println("Total Time = "+hours+" h and "+minutes+ " m");
    }
}

class Timedemo{
    public static void main(String[] args){
        Time t1=new Time();
        Time t2= new Time ();
        Time t3;

        t1.getdetails();
        t2.getdetails();
        t3=t1.addtime(t2);
        t3.display();
    }

}

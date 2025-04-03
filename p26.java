class firstthread extends Thread{
    public void run(){
        for(int i=1;i<=199;i+=2){
                System.out.println("first thread i="+i);
                try{
                    sleep(100);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            
        }
    }
}
class secondthread extends Thread{
    public void run(){
        for(int i=2;i<=200;i+=2){
            System.out.println("second thread i="+i);
            try{
                sleep(100);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class p26 {
    public static void main(String[] args) {
        firstthread t1=new firstthread();
	    secondthread t2=new secondthread();
        t1.start();
	    t2.start();
    }
}
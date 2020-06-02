
public class ProxyPattern_Test {
	public static void main(String[] args) {
        Proxy myProxy = new Proxy();
        myProxy.authenticate("Invalid", "Credentials");            
        System.out.println("Current Balance : " + myProxy.getAccBalance(100));
        System.out.println("Updating Balance by 100 ");
        myProxy.updateAccBalance(100, 100);
        System.out.println("Current Balance : " + myProxy.getAccBalance(100));
        System.out.println();
        myProxy.authenticate("myUsername", "myPassword");
        System.out.println("Current Balance : " + myProxy.getAccBalance(100));
        System.out.println("Updating Balance by 100 ");
        myProxy.updateAccBalance(100, 100);
        System.out.println("New Balance : " + myProxy.getAccBalance(100));
        System.out.println();
        
	}	
}

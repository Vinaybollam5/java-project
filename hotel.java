import java.util.Scanner;
public class hotel {
    public void menu(){
        String items[]={"Tea","Idli","Dosa","Biryani","VegMeals"};
        int prices[]={10,30,40,150,120};
        int totalbill=0;
        int amount=0;
        double gst=0.0;
        String orderdetails=" ";
        System.out.println("Select Items From The List Below");
        while(true){
            System.out.println(" ");
            System.out.println("<<<< HOTEL MENU CARD >>>>");
            System.out.println("------------------ -----");
            for(int i=0;i<items.length;i++){
                System.out.println(i+1+"."+items[i]+" "+"--->"+" "+prices[i]);
            }
            System.out.println("0 .EXIT");
            Scanner sc=new Scanner(System.in);
            int ch;
            ch=sc.nextInt();
            if(ch==0){
                break;
            }
            if(ch<1){
                System.out.println("Sorry you entered invalid items,Please Try Again !!!!");
                continue;
            }
            System.out.println("Enter the Quantity You Need :");
            int qnt;
            qnt=sc.nextInt();
             amount=prices[ch-1]*qnt;
        totalbill=totalbill+amount;
        gst=0.02*totalbill+totalbill;
        orderdetails=orderdetails+"\n"+items[ch-1]+" "+prices[ch-1]+" x "+"(qnty)"+qnt+" = "+amount;
        
        }
        
        System.out.println(" ");
        System.out.println("<<<<<  YOUR ORDER DETAILS >>>>");
        System.out.println("---------------------------------------------------------");
        System.out.println(orderdetails);
        System.out.println("Amount : "+totalbill+" + 2% GST = "+gst);
        System.out.println("TOTAL BILL = "+gst);
        System.out.println("HAVE OUR FRESH FOOD");
      

    }
public static void main(String[] args){
    hotel order=new hotel();
    order.menu();
    
  
}
}

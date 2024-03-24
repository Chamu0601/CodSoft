import java.util.*;
class Atmp1{ 
public static void main(String args[]){
int PIN=1020;
Scanner sc=new Scanner(System.in);
System.out.print("ENTER THE  PIN:");
int pin=sc.nextInt();
do{
if(pin !=PIN){
System.out.print("PLEASE ENTER THE VALID PIN:");
pin=sc.nextInt();
}
}while(pin!=PIN);

int balance=5000,withdraw,deposite;
 System.out.println("\n********** ");
System.out.println("1.CHECK BALANCE");
System.out.println("2.DEPOSITE ");
System.out.println("3.WITHDRAW");
System.out.println("4.EXIT");
 System.out.println("********** ");
System.out.print("enter your choice:");
int choice=sc.nextInt();
switch(choice){
              case 1:
                     System.out.print("YOUR CURRENT BALANCE IS:"+balance);
                     break;
              case 2:
                     System.out.print("ENTER THE AMOUNT YOU WANT TO DEPOSITE:");   
                     deposite=sc.nextInt();
                     balance+=deposite;
                     System.out.println("YOUR AMOUNT IS SUCCESSFULLY DEPOSITED ");
                     System.out.println("YOUR CURRENT ACCOUNT BALANCE IS: "+balance);
                     break;  
             case 3:
                     System.out.print("ENTER THE AMOUNT YOU WANT TO WITHDRAW:");   
                     withdraw=sc.nextInt();
                     balance -= withdraw;
                     if(withdraw>balance){
                      System.out.println("INSUFFICIENT BALANCE");
                      }
                     System.out.println("YOUR AMOUNT IS SUCCESSFULLY WITHDRAW ");
                     System.out.println("YOUR CURRENT ACCOUNT BALANCE IS: "+balance); 
                     break; 
            case 4:
                        System.out.println("*THANK YOU FOR VISITING* ");
                        
                    System.exit(0);
             default:
                     System.out.print("INVALID CHOICE please enter valid choice");
}
}
}
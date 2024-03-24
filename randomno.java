import java.util.*;
class randomno{
public static void main(String args[]){
Random  random=new Random();
int rno=random.nextInt(100)+1;
int limit=0;
Scanner sc=new Scanner(System.in);
System.out.println("\t\t\tWELCOME TO RANDOM GUESS NUMBER GAME !!!");
System.out.println("Your Limit Is:5");

for(limit=0;limit<=4;limit++){
System.out.println("\n\nplease enter your guess(between 1 to 100):");
int no=sc.nextInt();
if(no==rno){
System.out.print("CONGRATULATIONS !! You guess correct number   :"+no);
break;
}

else if(no>rno){
System.out.print("the number is greater TRY AGAIN!!");
}

else{
System.out.print("the number is smaller TRY AGAIN!!");
}


}
}
}


















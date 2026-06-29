import java.util.*;
public class Calculator{
    public static double add(double first,double second){
        return first+second;
    }
    public static double sub(double first,double second){
        return first-second;
    }
    public static double mul(double first,double second){
        return first*second;
    }
    public static double divide(double first,double second){
        if(second==0){
            return 0;
        }
        return first/second;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a choice");
        int choice;
        do{
            choice=sc.nextInt();
            if(choice>=1 && choice<=4){
                System.out.println("Enter the first number");
                double first=sc.nextDouble();
                System.out.println("Enter a second number");
                double second=sc.nextDouble();
                switch(choice){
                    case 1:
                        System.out.println("Result "+add(first,second));
                        break;
                    
                    case 2:
                        System.out.println("Result "+sub(first,second));
                        break;
                    case 3:
                        System.out.println("Result "+mul(first,second));
                        break;
                    case 4:
                        System.out.println("Result "+divide(first,second));
                        break;


                    
                }


            }
            else if(choice==5){
                System.out.println("Exit");
            }
            else{
                System.out.println("Give correct inputs");
            }
        }while(choice!=5);
        sc.close();
        }
    }
        
        
    

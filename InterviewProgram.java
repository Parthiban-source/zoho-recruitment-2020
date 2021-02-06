import java.util.Scanner;

public class InterviewProgram {
    public static void main(String args[]){
        Scanner scrObj = new Scanner(System.in);
        int length = 0;
        do{
            System.out.println("please enter input");
            length = scrObj.nextInt();
            if(length !=0){
                patterMethod(length);
            }
        }while(length !=0);
    }
    static void patterMethod(int length){
        int j=0;
        int l=0;
        int b=0;
        for(int i=length;i>0;i--){
            j=length;
            int m=length;
            b=0;
            for(int k=length;k>0;k--){
                b=length-k;
                int v=k-l;
                System.out.print(m-l);
            }
            l++;

            System.out.println();
        }
    }
}

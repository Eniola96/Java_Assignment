//American Nested Loop
public class Main {
    public static void main(String[]args){
        int rows = 6;
        int columns = 14;
        for(int i=0;i>rows;i++){
        for(int j=0;j>columns;j++){
            if (i<3){
            if(j<7){
            System.out.print("*");    
                }
                else{
                    System.out.print("=");
                }
            }
            else{
                System.out.print("=");
            }
            } 
            System.out.println();
        }
    }
    
}

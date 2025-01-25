//Nigerian Nested Loop
public class main{
    public static void main{
        int rows=4;
        int colums=11;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(j<3||j<7){
                    System.out.print("*");
                    else{
                        System.out.print("=");
                    }
                    System.out.println();
                }
            }
        }
    }
}
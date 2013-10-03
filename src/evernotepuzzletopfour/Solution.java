package evernotepuzzletopfour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Solution {

    private static int elements;
    private static int[] topFour = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
    
    public static void main(String[] args){
        try{
            readData();
        }catch(IOException e){
            e.printStackTrace();
        }
        printStuff();
    }
    
    static void printStuff(){
        if(elements >= 4){
            for (int i = 3; i >= 0; i--) {
                System.out.println(topFour[i]);
            }
        }else{
            for (int i = 3; i >= 4-elements; i--) {
                System.out.println(topFour[i]);                
            }
        }
    }
    
    /**
    *   Reading the data and dispatching the stuff to the working methods
    **/
    static void readData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        elements = Integer.parseInt(st.nextToken());
        int value;
        for (int i = 0; i < elements; i++) {
            st = new StringTokenizer(br.readLine());
            value = Integer.parseInt(st.nextToken());
            if(topFour[0]<value){
                if(topFour[1]>value){
                    topFour[0] = value;
                }else{
                    topFour[0] = topFour[1];
                    if(topFour[2]>value){
                        topFour[1] = value;
                    }else{
                        topFour[1] = topFour[2];
                        if(topFour[3]>value){
                            topFour[2] = value;
                        }else{
                            topFour[2] = topFour[3];
                            topFour[3] = value;
                        }
                    }                    
                }
            }
        }
        
    }
}

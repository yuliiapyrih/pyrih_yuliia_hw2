package sample;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static float a=1,b=2,c=3;

    public static void check_brigs(float temp){
        if (Math.max(Math.max(a,b),Math.max(b,c))<=temp)
            System.out.println("Цегла проходить у прямокутний отвір");
        else
            System.out.println("Цегла не проходить у прямокутний отвір");
    }

    public static void main(String[] args) {
            System.out.println("-----------1----------");

            float x=1,y=5;
            if(x>=y)
                check_brigs(x);
            else
                check_brigs(y);

            System.out.println("-----------2----------");

            int n=1234;
            int nn=n*n;
            ArrayList<Integer> arr_n = new ArrayList<>();
            ArrayList<Integer> arr_nn = new ArrayList<>();

            while (n>0){
                arr_n.add(0, n%10);
                n= n / 10;
            }

            while (nn>0){
                arr_nn.add(0, nn%10);
                nn= nn / 10;
            }

            System.out.println("-----------2.1----------");

            if(arr_nn.indexOf("3")==-1)
                System.out.println("Цифри 3 немає у числі n^2");
            else
                System.out.println("Цифри 3 є у числі n^2");

            System.out.println("-----------2.2----------");

            Collections.reverse(arr_n);
            System.out.println(arr_n.toString().replaceAll("[\\[\\]\\,\\ ]", ""));

            System.out.println("-----------2.3----------");

            int temp;
            temp=arr_n.get(0);
            arr_n.set(0,arr_n.get(arr_n.size()-1));
            arr_n.set(arr_n.size()-1,temp);

            System.out.println(arr_n.toString().replaceAll("[\\[\\]\\,\\ ]", ""));

            System.out.println("-----------2.4----------");

            arr_n.add(0,1);
            arr_n.add(arr_n.size(), 1);

            System.out.println(arr_n.toString().replaceAll("[\\[\\]\\,\\ ]", ""));
    }
}

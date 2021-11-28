import Tree.*;

public class TreeMain {
    public static void main(String[] args){
        //**第一年有一根枝**

        /*具体某一年计算
        Tree tree = new Tree(1);
        System.out.println(Count.count);
        */

        //循环二十次
        for (int i=1; i<=20; i++) {
            Tree tree = new Tree(i);
            System.out.print(Count.count+", ");
            Count.reset();
        }
    }
}

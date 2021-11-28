package Tree;

import java.util.ArrayList;

public class Tree {
    boolean growth;
    ArrayList son;

    public Tree(int year){
        son=new ArrayList();
        growth=false;

        while (1 < year) {
            year--;
            if (!growth) {
                growth = true;
                continue;
            }

            //子又有子
            son.add(new Tree(year));
        }

        //计算接上树枝总数
        Count.count+=son.size();
    }
}

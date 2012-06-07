package demo.intellij.completions;

import java.util.ArrayList;
import java.util.List;

public class Completions {

    public void ctrl_j_iter() {
        List<String> s = new ArrayList<String>();
        List<Integer> i = new ArrayList<Integer>();
        List<Long> l = new ArrayList<Long>();
    }                  

    public void ctrl_shift_j_template() {
        String s = "Hei";
    }
    
    public void introduce(){
        //Ctrl + alt + v
        new String();
        //Ctrl + alt + p
        new String();
        //Ctrl + alt + f
        new String();
    }
    

}

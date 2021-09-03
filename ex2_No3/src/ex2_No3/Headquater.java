package ex2_No3;

import java.util.ArrayList;

public class Headquater implements Source{
    private final ArrayList<MyObserver> list;
    private String somedata;

    public Headquater() {
        this.list = new ArrayList<MyObserver>();
    }

    public void setSomeData(String adata){
        somedata = adata;
        notifyObserver();
    }

    public String getSomeData(){
        return somedata;
    }

    public void register(MyObserver observer){
        list.add(observer);
    }

    public void notifyObserver() {
        for(int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
        }
    }

}

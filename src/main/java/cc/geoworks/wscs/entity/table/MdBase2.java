package cc.geoworks.wscs.entity.table;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class MdBase2 {
    private Map<Integer,String> map;

    public MdBase2(Map<Integer, String> map) {
        this.map = map;
    }

    public MdBase2(int count){
        this.map = new HashMap<>();
        for (int i = 1; i <= count; i++) {
            this.map.put(i, "");
        }
    }

    public String getData(int key) {
        return this.map.get(key);
    }

    public void setData(int key, String data) {
        this.map.put(key, data);
    }
}

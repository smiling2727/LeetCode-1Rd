public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> map1  = new HashMap<Integer,Integer>(); // hashMap的key都是不一样的
       HashMap<Integer,Integer> map2  = new HashMap<Integer,Integer>();
       List<Integer> list = new ArrayList<Integer>();
       for(int i: nums1){
          if(map1.containsKey(i)){ map1.put(i,map1.get(i)+1);}//map.get(i)取key i对应的value
          else { map1.put(i,1);}}
       for(int i: nums2){
          if(map2.containsKey(i)){map2.put(i,map2.get(i)+1); }
          else {map2.put(i,1);}}
       if(map1.size()<=map2.size()){//哪个小遍历哪个
       Iterator iter = map1.entrySet().iterator();
       while(iter.hasNext()){
           Map.Entry entry = (Map.Entry) iter.next();//(Map.Entry) cast
           int i = (int)entry.getKey();//entry.getKey() 返回的是object类型的
           if(map2.containsKey(i)){
               if(map1.get(i)<=map2.get(i)){
                   for(int j =0;j<map1.get(i);j++){ list.add(i); }
               }else{for(int j =0;j<map2.get(i);j++){ list.add(i);}}
           }}}
        else{
          Iterator iter = map2.entrySet().iterator();
          while(iter.hasNext()){
           Map.Entry entry = (Map.Entry) iter.next();//(Map.Entry) cast
           int i = (int)entry.getKey();
           if(map1.containsKey(i)){
               if(map1.get(i)<=map2.get(i)){
                   for(int j =0;j<map1.get(i);j++){ list.add(i); }
               }else{for(int j =0;j<map2.get(i);j++){ list.add(i);}}
           }}}  
        int[] a = new int[list.size()];
        for(int i=0;i<list.size();i++){a[i] = list.get(i); }
        return a;
    }
          
    }

// 981 Time Based Key-Value Store

// // Using TreeMap in Java
// class TimeMap {
//     Map<String, TreeMap<Integer, String>> map = new HashMap<>();

//     public TimeMap() {
        
//     }
    
//     public void set(String key, String value, int timestamp) {
//         if (!map.containsKey(key)) {
//             map.put(key, new TreeMap<>());
//         }
        
//         TreeMap<Integer, String> tm = map.get(key);
//         tm.put(timestamp, value);
//     }
    
//     public String get(String key, int timestamp) {
//         if (!map.containsKey(key)) return "";

//         TreeMap<Integer, String> tm = map.get(key);
//         Integer smallestTimeStamp = tm.floorKey(timestamp);
//         if (smallestTimeStamp == null) return "";

//         return tm.get(smallestTimeStamp);
//     }
// }

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */

// Using binary tree
class TimeMap {
    class TimeValue {
        int timestamp;
        String value;

        public TimeValue(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    Map<String, List<TimeValue>> map = new HashMap();

    public TimeMap () {

    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) map.put(key, new ArrayList<>());
        
        List<TimeValue> list = map.get(key);
        list.add(new TimeValue(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";

        List<TimeValue> list = map.get(key);
        
        int start = 0, end = list.size() - 1;

        while (start + 1 < end) {
            int mid = (start + end) / 2;
            TimeValue midTimeValue = list.get(mid);
            
            if (midTimeValue.timestamp == timestamp) return midTimeValue.value;
            else if (midTimeValue.timestamp < timestamp) start = mid;
            else end = mid;
        }

        if(list.get(end).timestamp <= timestamp) return list.get(end).value;
        else if(list.get(start).timestamp <= timestamp) return list.get(start).value;
        else return "";
    }
}


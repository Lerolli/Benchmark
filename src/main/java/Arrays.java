import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Arrays {
    ArrayList<String> arrayListString;
    ArrayList<Integer> arrayListNumber;

    LinkedList<String> linkedListString;
    LinkedList<Integer> linkedListNumber;

    HashMap<String, Integer> hashMap;
    public Arrays(){
        arrayListString = new ArrayList<>();
        arrayListNumber = new ArrayList<>();

        linkedListString = new LinkedList<>();
        linkedListNumber = new LinkedList<>();

        hashMap = new HashMap<>();
    }

    public void fillArrayList(String str){
        var arrayString = str.split("[ \n\r\t]");
        for (String string : arrayString) {
            var index = arrayListString.indexOf(string);
            if (index != -1) {
                arrayListNumber.set(index, arrayListNumber.get(index) + 1);
            } else {
                arrayListString.add(string);
                arrayListNumber.add(1);
            }

        }
    }

    public int countFindNumberArrayList(String str){
        var index = arrayListString.indexOf(str);
        if (index != -1) {
            return arrayListNumber.get(index);
        }
        return 0;
    }

    public void fillLinkedList(String str){
        var arrayString = str.split("[ \n\r\t]");
        for (String s : arrayString) {
            var index = linkedListString.indexOf(s);
            if (index != -1) {
                linkedListNumber.set(index, linkedListNumber.get(index) + 1);
            } else {
                linkedListString.add(s);
                linkedListNumber.add(1);
            }

        }
    }

    public int countFindNumberLinkedList(String str){
        var index = linkedListString.indexOf(str);
        if (index != -1) {
            return linkedListNumber.get(index);
        }
        return 0;
    }

    public void fillHashMap(String str){
        var arrayString = str.split("[ \n\r\t]");
        for (String s : arrayString) {
            if (hashMap.containsKey(s)) {
                var count = hashMap.get(s);
                hashMap.remove(s);
                hashMap.put(s, count + 1);
            } else
                hashMap.put(s, 1);
        }
    }

    public int countFindNumberHashMap(String str){
        var result = hashMap.get(str);
        if (result == null)
            return 0;
        return result;
    }
}

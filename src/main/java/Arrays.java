import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Arrays {
    ArrayList<String> arrayListString;
    ArrayList<Integer> arrayListNumber;

    LinkedList<String> linkedListString;
    LinkedList<Integer> linkedListNumber;

    HashMap<String, Integer> hashMap;

    MyArrayList<String> myArrayListString;
    MyArrayList<Integer> myArrayListNumber;

    MyLinkedList<String> myLinkedListString;
    MyLinkedList<Integer> myLinkedListNumber;
    public Arrays(){
        arrayListString = new ArrayList<>();
        arrayListNumber = new ArrayList<>();

        linkedListString = new LinkedList<>();
        linkedListNumber = new LinkedList<>();

        hashMap = new HashMap<>();

        myArrayListString = new MyArrayList<>();
        myArrayListNumber = new MyArrayList<>();

        myLinkedListString = new MyLinkedList<>();
        myLinkedListNumber = new MyLinkedList<>();
    }

    public void fillArrayList(String str){
        var arrayString = str.split("[ \n\r\t]");
        for (String string : arrayString) {
            if (string.length() > 3) {
                var index = arrayListString.indexOf(string);
                if (index != -1) {
                    arrayListNumber.set(index, arrayListNumber.get(index) + 1);
                } else {
                    arrayListString.add(string);
                    arrayListNumber.add(1);
                }
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
            if (s.length() > 3) {
                var index = linkedListString.indexOf(s);
                if (index != -1) {
                    linkedListNumber.set(index, linkedListNumber.get(index) + 1);
                } else {
                    linkedListString.add(s);
                    linkedListNumber.add(1);
                }
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
            if (s.length() > 3) {
                if (hashMap.containsKey(s)) {
                    var count = hashMap.get(s);
                    hashMap.remove(s);
                    hashMap.put(s, count + 1);
                } else
                    hashMap.put(s, 1);
            }
        }
    }

    public int countFindNumberHashMap(String str){
        var result = hashMap.get(str);
        if (result == null)
            return 0;
        return result;
    }

    public void fillMyArrayList(String str){
        var arrayString = str.split("[ \n\r\t]");
        for (String string : arrayString) {
            if (string.length() > 3) {
                var index = myArrayListString.indexOf(string);
                if (index != -1) {
                    myArrayListNumber.update(index, myArrayListNumber.get(index) + 1);
                } else {
                    myArrayListString.add(string);
                    myArrayListNumber.add(1);
                }
            }
        }
    }

    public int countFindNumberMyArrayList(String str){
        var index = myArrayListString.indexOf(str);
        if (index != -1) {
            return myArrayListNumber.get(index);
        }
        return 0;
    }

    public void fillMyLinkedList(String str){
        var arrayString = str.split("[ \n\r\t]");
        for (String s : arrayString) {
            if (s.length() > 3) {
                var index = myLinkedListString.getIndexByElement(s);
                if (index != -1) {
                    myLinkedListNumber.set(index, myLinkedListNumber.getElementByIndex(index) + 1);
                } else {
                    myLinkedListString.add(s);
                    myLinkedListNumber.add(1);
                }

            }
        }
    }

    public int countFindNumberMyLinkedList(String str){
        var index = myLinkedListString.getIndexByElement(str);
        if (index != -1) {
            return myLinkedListNumber.getElementByIndex(index);
        }
        return 0;
    }
}

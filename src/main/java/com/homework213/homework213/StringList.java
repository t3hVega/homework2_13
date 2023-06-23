package com.homework213.homework213;

public class StringList{


    private String[] stringArray;

    public StringList(int size) {
        this.stringArray = new String[size];
        for (int i = 0; i < size; i++) {
            stringArray[i] = " ";
        }
    }

    public String add(String item) {
        boolean isFull = true;

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(" ")) {
                isFull = false;
            }
        }

        if(isFull == true) {
            throw new ArrayIndexOutOfBoundsException("Массив заполнен.");
        }

        for (int i = 0; i < stringArray.length; i++) {
            if(stringArray[i].equals(" ")) {
                stringArray[i] = item;
                break;
            }
        }

        return item;
    }


    public String add(int index, String item) {

        if (index > stringArray.length) {
            throw new ArrayIndexOutOfBoundsException("Номер элемента превышает размер массива.");
        }

        for (int i = stringArray.length - 1; i > index - 1; i--) {
            stringArray[i] = stringArray[i - 1];
        }

        stringArray[index - 1] = item;

        return item;
    }

    public String set(int index, String item) {

        if (index > stringArray.length) {
            throw new ArrayIndexOutOfBoundsException("Номер элемента превышает размер массива.");
        }


        stringArray[index - 1] = item;


        return item;
    }

    public String remove(String item) {

        if(!this.contains(item)) {
            throw new ItemDoesntExist("Элемент отсутствует");
        }

        int num = -1;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(item)) {
                num = i + 1;
            }
        }
        for (int i = num - 1; i < stringArray.length - 1; i++) {
            stringArray[i] = stringArray[i + 1];
        }
        stringArray[stringArray.length - 1] = " ";

        return item;
    }
    public String remove(int index) {

        if (index > stringArray.length) {
            throw new ArrayIndexOutOfBoundsException("Номер элемента превышает размер массива.");
        }

        String item = stringArray[index - 1];
        for (int i = index - 1; i < stringArray.length - 1; i++) {
            stringArray[i] = stringArray[i + 1];
        }

        stringArray[stringArray.length - 1] = " ";

        return item;
    }

    public boolean contains(String item) {
        boolean isPresent = false;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(item)) {
                isPresent = true;
            }
        }
        return isPresent;
    }

    public int indexOf(String item) {

        if(!this.contains(item)) {
            throw new ItemDoesntExist("Элемент отсутствует");
        }

        int number = -1;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(item)) {
                number = i + 1;
            }
        }
        return number;
    }

    public int lastIndexOf(String item) {

        if(!this.contains(item)) {
            throw new ItemDoesntExist("Элемент отсутствует");
        }

        int number = -1;
        for (int i = stringArray.length - 1; i > 0; i--) {
            if (stringArray[i].equals(item)) {
                number = i + 1;
            }
        }
        return number;
    }

    public String get(int index) {

        if (index > stringArray.length) {
            throw new ArrayIndexOutOfBoundsException("Номер элемента превышает размер массива.");
        }

        String item = stringArray[index - 1];
        return item;
    }

    public boolean equals(StringList otherList) {
        boolean isEqual = true;
        if(this.stringArray.length != otherList.stringArray.length) {
            isEqual = false;
        }
        for (int i = 0; i < this.stringArray.length; i++) {
            if(!this.stringArray[i].equals(otherList.stringArray[i])) {
                isEqual = false;
            }
        }
        return isEqual;
    }

    public int size() {
        return stringArray.length;
    }

    public boolean isEmpty() {
        boolean isEmpty = true;
        for (int i = 0; i < stringArray.length; i++) {
            if(!stringArray[i].equals(" ")) {
                isEmpty = false;
            }
        }
        return isEmpty;
    }

    public void clear() {
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = " ";
        }
    }


    public String[] toArray() {
        String [] array = new String[this.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = stringArray[i];
        }
        return array;
    }
}

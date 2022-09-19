package com.patikadev;

import java.util.Arrays;

public class MyList <T> {
    private int size;
    private int capacity;
    private T[] arr;
    private T[] arr2;

    public MyList(){
        this.capacity = 10;
        this.arr = (T[]) new Object[capacity];

    }
    public MyList(int capacity){
        this.capacity = capacity;
        this.arr = (T[]) new Object[this.getCapacity()];


    }
    int i=0;
    public void add(T data){
        if(i>=getCapacity()){
            this.arr2 = this.arr; //kendi arrayimizdeki değerler kaybolmasın diye geçici bir arraya aktarıyoruz.
            setCapacity(getCapacity()*2);
            this.arr = (T[]) new Object[getCapacity()]; // boş arrayin kapasitesini artırıyoruz.
            this.arr = Arrays.copyOf(this.arr2,getCapacity()); //değerleri tekrar ilk arrayimize aktarıyoruz yeni kapasite ile birlikte
        }
        arr[i] = data;
        i++;
    }

    public T get(int index){
        if(index <0 || index>=arr.length){
            return null;
        }
        else {
            return arr[index];
        }
    }

    public void remove(int index){
        if(index == arr.length-1){
            arr[index] = null;
            arr[arr.length-1] = null;
            return;
        }
        for(int j=index; j< arr.length-1; j++){
            arr[j] = arr[j+1];

        }
        if(index<0 || index >= arr.length){
            System.out.println("Geçersiz indis.");
            return;
        }
    }

    public void set(int index, T data){
        if(index<0 || index >= arr.length){
            System.out.println("Geçersiz indis.");
            return;
        }
        else{
            arr[index] = data;
        }
    }

    public void toStringg(){
        System.out.println("-----Array-----");
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            if(arr[i] != null) {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println(" ]");
    }

    public int indexOf(T data){

        for(int j=0; j<arr.length; j++){
            if (arr[j] == data) {
                return j;
            }
            else continue;
        }
        return -1;
    }

    public int lastIndexOf(T data){
        int a=0;
        int sameValueIndex [] = new int[arr.length];
        for(int j=0; j<arr.length; j++){
            if(arr[j] == data){
                a++;
                sameValueIndex[a] = j;

            }
        }
        return sameValueIndex[a];
    }

    public boolean isEmptyy(){

        for(int i=0; i<arr.length; i++){
            if(arr[i] != null){
                return false;
            }
        }
        return true;
    }

    public T[] toArray(){
        return this.arr;
    }

    public void clear(){
        for(int i=0; i<arr.length; i++){
            arr[i] = null;
        }
        System.out.println("Tüm ögeler silindi.");
    }

    public MyList<T> subList(int start, int finish){
        MyList<T> altList = new MyList<>();

        if(start<0 || start >arr.length || finish<0 || finish>arr.length){
            return null;
        }
        for(int i=start; i<=finish; i++){
            altList.add(arr[i]);
        }
        return altList;
    }


    public int size(){
        return arr.length;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {

        return this.capacity;
    }

    public void setCapacity(int capacity) {

        this.capacity = capacity;
        this.arr = (T[]) new Object[this.capacity];

    }

    public boolean contains(T data){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == data){
                return true;
            }
        }
        return false;

    }



}

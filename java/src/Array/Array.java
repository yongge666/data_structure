package src.Array;

/**
 * 实现动态数组
 *
 * java数组使用方式
 * 1.声明
 *   int[] arr = new int[20];
 * 1.1赋值
 *         for (int i = 0; i < arr.length; i++) {
 *             arr[i] = i;
 *         }
 *
 * 2.声明并赋值
 *         int[] scores = new int[]{1,2,3,4,5,6,7,8};
 *2.1 for迭代
 *         for (int i = 0; i < scores.length; i++) {
 *             System.out.println(scores[i]);
 *         }
 *
 * 2.2 foreach迭代
 *         for (int score: scores){
 *             System.out.println(score);
 *         }
 *
 */

public class Array {
    private int[] data;
    private int size;//元素个数需要此类维护，外部不能直接修改
    public static void main(String[] argv){
//        arrayBase();

    }

    public  Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    public  Array(){
        this(10);
    }

//    public void Array(int[] data){
//        this.data = data;
//    }

    public int getCapacity() {
        return  data.length;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    //从首部追加
    public boolean unshift(int e){
        return insert(0,e);
    }

    //从首部删除
    public int shift(){
        return remove(0);
    }

    //从尾部追加
    public void push(int e){
        if (size==data.length){
            throw new IllegalArgumentException("超过最大容量");
        }
        data[size] = e;
        size++;
    }

    //从尾部删除
    public int pop(){
        return remove(size-1);
    }

    //任意位置插入
    public boolean insert(int index,int e){
        if (size==data.length){
            throw new IllegalArgumentException("超过最大容量");
        }
        if (index<0 || index>size){
            throw new IllegalArgumentException("参数异常");
        }
        for (int i = size-1; i >= index ; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
        return true;
    }

    public int get(int index){
        if (index<0 || index>=size){
            throw new IllegalArgumentException("get faild,index is illegal");
        }
        return data[index];
    }

    public void set(int index,int e){
        if (index<0 || index>=size){
            throw new IllegalArgumentException("get faild,index is illegal");
        }
        data[index] = e;

    }

    public int remove(int index){
        if (index<0 || index>size-1){
            throw new IllegalArgumentException("get faild,index is illegal");
        }
        int ret = data[index];

        for (int i = index; i < size; i++) {
            data[i] = data[i+1];
        }
        size--;
        return ret;
    }

    public boolean contains(int e){
        for (int i = 0; i < size; i++) {
            if (data[i] == e)
                return true;
        }
        return false;
    }

    public int find(int e){
        for (int i = 0; i < size; i++) {
            if (data[i] == e)
                return i;
        }
        return -1;
    }




    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Array:size = %d; capacity = %d",size,data.length));
        stringBuilder.append('[');
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (i != size-1){
                stringBuilder.append(", ");
            }

        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }





}

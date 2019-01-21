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

    public void Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    public void Array(int[] data){
        this.data = data;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize(){
        return data.length;
    }

    public boolean isEmpty(){
        return capacity==0;
    }

    //从首部追加
    public unshift(int e){
        insert(0,e);
    }

    //从首部删除
    public shift(){

    }

    //从尾部追加
    public void push(int e){
        if (capacity==data.length){
            throw new IllegalArgumentException("超过最大容量");
        }
        data[capacity] = e;
        capacity++;
    }

    //从尾部删除
    public pop(){


    }

    //任意位置插入
    public void insert(int index,int e){
        if (capacity==data.length){
            throw new IllegalArgumentException("超过最大容量")
        }
        if (index<0 || index>capacity){
            throw new IllegalArgumentException("参数异常");
        }
        for (int i = capacity-1; i >= index ; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        capacity++;
    }





}

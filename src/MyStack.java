public class MyStack {
    private String[] arr;
    private int size;
    private int index = 0;

    public MyStack(int size){
        this.size = size;
        arr = new String[this.size];
    }
    public void push(String element){
        if (isFull()){
            throw new StackOverflowError("Ngăn xếp đầy, không thể thêm phần tử: " + element);
        }else {
            arr[index] = element;
            index++;
            //System.out.println("Đã thêm " + element + " vào ngăn xếp");
        }
    }
    public String pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Ngắn xếp rỗng");
        }
        return arr[--index];
    }
    public int size(){
        return this.index;
    }
    public boolean isEmpty(){
        if (this.index == 0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if (this.index == size) {
            return true;
        }
        return false;
    }
}

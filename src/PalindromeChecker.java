public class PalindromeChecker {
    public static void main(String[] args) throws Exception {
        String input = "able was I ere I saw elba";
        System.out.println("Kiểm tra: " + input);
        String[] checkPalidrome = input.split("");

        MyQueue queue = new MyQueue(checkPalidrome.length);
        MyStack stack = new MyStack(checkPalidrome.length);

        for (String character : checkPalidrome){
            queue.enQueue(character);
            stack.push(character);
        }

        boolean isPalidrome = true;
        for (int i = 0; i<checkPalidrome.length;i++){
            if (!stack.pop().equals(queue.deQueueString())){
                isPalidrome = false;
            break;
            }
        }
        if (isPalidrome){
            System.out.println("Là chuỗi Palindrome");
        }else System.out.println("Không phải là chuỗi Palindrome");
    }
}

public class Main {
    public static void main(String[] args) {
        String myWord = "топот";
        StringBuffer buffer = new StringBuffer(myWord);
        buffer.reverse();
        String data = buffer.toString();
        if (myWord.equals(data)){
            System.out.println("Слово является палиндромом");
        }else {
            System.out.println("Слово НЕ является палиндромом");
        }
    }
}
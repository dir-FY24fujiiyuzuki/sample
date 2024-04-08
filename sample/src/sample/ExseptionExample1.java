package sample;

public class ExseptionExample1 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println("処理開始");
        
        
        try {
            System.out.println("割り算開始");
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("ArithmeticExceptionが発生:" + e.getMessage());
        }finally {
            System.out.println("割り算終了");
        }
        
        System.out.println("処理終了");

            
        }

    }



package Programs.Task_10.SubTask_1;

public class SubMain {
    protected static void main(){
        int naturalNumber = Input.getPositiveInt("Enter natural number: ");
        recursiveTriangleOut(1,naturalNumber);
    }
    private static void recursiveTriangleOut(int current,int end){
        for (int i = 1; i <= current; i++){
            System.out.print(current + ( i == current? "" : "\t"));
        }
        if (current == end) return;
        System.out.println("");
        recursiveTriangleOut(++current, end);
    }
}

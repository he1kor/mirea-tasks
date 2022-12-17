package Programs.Task_16.SubTask_1;

public class SubMain {
    protected static void main(){
        askForDeck(5,"Раздайте карты первому игроку пьяницы!","Ошибка!");
    }

    private static int[] askForDeck(int deckSize,String question,String errorMessage){
        final int MINIMAL_VALUE = 0;
        final int MAXIMAL_VALUE = 9;
        int[] numbers = Input.getInts(question,errorMessage,deckSize);
        while (true){
            if (hasRangedInts(numbers,MINIMAL_VALUE,MAXIMAL_VALUE)) return numbers;

            System.out.println(errorMessage);
            numbers = Input.getInts(Input.NO_QUESTION,errorMessage,deckSize);
        }
    }
    private static boolean hasRangedInts(int[] numbers,int from, int to){
        for (int number : numbers) {
            if (from > number || number > to){
                return false;
            }
        }
        return true;
    }
}

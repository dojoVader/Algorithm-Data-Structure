import java.util.Stack;
import java.util.Iterator;



/**
 * You're now a baseball game point recorder.
 * 
 * Given a list of strings, each string can be one of the 4 following types:
 * 
 * Integer (one round's score): Directly represents the number of points you get
 * in this round. "+" (one round's score): Represents that the points you get in
 * this round are the sum of the last two valid round's points. "D" (one round's
 * score): Represents that the points you get in this round are the doubled data
 * of the last valid round's points. "C" (an operation, which isn't a round's
 * score): Represents the last valid round's points you get were invalid and
 * should be removed. Each round's operation is permanent and could have an
 * impact on the round before and the round after.
 * 
 * You need to return the sum of the points you could get in all the rounds.
 */

public class BaseBallGame {
    int sum = 0;

    Stack<Integer> stackDataSet;

    public BaseBallGame() {
        stackDataSet = new Stack<Integer>();
    }

    public int getSummation() {
        return sum;
    }

    public static void main(String[] args) {
        BaseBallGame game = new BaseBallGame();
        String[] stringArgs = { "5","-2","4","C","D","9","+","+"};
        int totalSum = game.calPoints(stringArgs);
        System.out.format("The Total Sum is %d \n", totalSum);
    }

    public int calPoints(String[] ops) {

        for (String op : ops) {
            switch (op) {
            case "+":
                // We get the last 2 points and add them together
                int lastPoint = stackDataSet.pop();
                System.out.format("item peeked: %d \n", lastPoint);
                int lastPointPoint = stackDataSet.pop();
                System.out.format("item peeked: %d \n", lastPoint);
                sum += (lastPoint + lastPointPoint);
                stackDataSet.push(lastPointPoint);
                stackDataSet.push(lastPoint);
                
                stackDataSet.push((lastPoint + lastPointPoint));
                break;

            case "D":
                // Double the data which is the last data , Peek looks at the top
                System.out.format("item peeked: %d \n", stackDataSet.peek());
                int opsValues = (stackDataSet.peek() * 2);
                sum += opsValues;
                stackDataSet.push(opsValues);
                break;

            case "C":
                // We will minus this from the last point we got
                lastPoint = stackDataSet.pop();
                sum -= lastPoint;
                break;

            default:
                // It means this is a string integer so we simply store it
                int opsValue = Integer.valueOf(op);
                sum += opsValue;
                stackDataSet.push(opsValue);

                break;
            }
        }
        Iterator<Integer> iterator = stackDataSet.iterator();
        while(iterator.hasNext()){
            System.out.format("item [%d] \n",iterator.next());
        }
        return sum;
    }
}
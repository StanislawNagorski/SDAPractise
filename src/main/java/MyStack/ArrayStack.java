package MyStack;

public class ArrayStack implements myStack {
    private int buffor = 100;
    protected String[] stackData = new String[buffor];
    private int counter = 0;

    private String[] increaseStack(String[] oldstack, int buffor) {
        String[] biggerStack = new String[buffor];
        for (int i = 0; i < oldstack.length; i++) {
            biggerStack[i] = oldstack[i];
        }
        return biggerStack;
    }

    @Override
    public void push(String data) {
        if (counter >= buffor) {
            buffor = buffor * 2;
            String[] tempStackData = increaseStack(stackData, buffor);
            stackData = tempStackData;
        }
        stackData[counter] = data;
        counter++;
    }

    @Override
    public String pop() throws Exception {
        if (counter-1 < 0){
            throw new Exception("my great myStack is empty!");
        }
        String result = stackData[counter - 1];
        counter--;
        return result;
    }

    @Override
    public String peek() {
        return stackData[counter - 1];
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }
}

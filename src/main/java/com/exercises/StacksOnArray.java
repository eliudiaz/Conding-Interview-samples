package com.exercises;

/**
 * Created by eliud on 7/3/2017.
 */
public class StacksOnArray {

    /**
     * 1. define array with default size of 3
     * 2. define 3 indexes variables to store boundaries for every stack
     * 3. define method pop which receives stack number
     * 4. define method push which receives stack number
     * 5. define method peek which receives stack number
     * 6. define method isEmpty which receives stack number
     *
     * @param args
     */

    public static void main(String[] args) {

    }

    static class StackInfo {
        private int id;
        private int starPos;
        private int depth;

        public StackInfo(int id, int starPos, int depth) {
            this.id = id;
            this.starPos = starPos;
            this.depth = depth;
        }
    }

    static class Item {
        Object data;

        public Item(Object data) {
            this.data = data;
        }
    }

    private Item[] stack = new Item[3];
    private Item[] topItems = new Item[3];
    private static final int STACK_ONE = 0;
    private static final int STACK_TWO = 1;
    private static final int STACK_THREE = 2;
    private static int STACK_ONE_POS = 0;
    private static int STACK_TWO_POS = 1;
    private static int STACK_THREE_POS = 2;
    private static int STACK_ONE_DEPTH = 0;
    private static int STACK_TWO_DEPTH = 0;
    private static int STACK_THREE_DEPTH = 0;

    public void push(int stackNumber, Object item) {
        StackInfo info = null;
        switch (stackNumber) {
            case STACK_ONE:
                info = new StackInfo(STACK_ONE, STACK_ONE_POS, STACK_ONE_DEPTH);
                break;
            case STACK_TWO:
                info = new StackInfo(STACK_TWO, STACK_TWO_POS, STACK_TWO_DEPTH);
                break;
            case STACK_THREE:
                info = new StackInfo(STACK_THREE, STACK_THREE_POS, STACK_THREE_DEPTH);
                break;
            default:
                throw new RuntimeException("No stack found!");
        }

        if (stack[info.starPos] == null) {
            stack[info.starPos] = new Item(item);
            topItems[info.id] = stack[info.starPos];
        }else{
            Item[] newArray=new Item[stack.length+1];
            if(info.starPos==0){
                info.depth++;
            }
        }

    }


    public Object pop(int stack) {
        return null;
    }

    public Object peek(int stack) {
        return null;
    }


}

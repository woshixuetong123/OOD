import java.util.LinkedList;


//https://leetcode.com/problems/design-snake-game/
//https://www.geeksforgeeks.org/design-snake-game/



///We have used Linked List to store the body because we can add a cell in O(1).
//Grow method will be called when it eats the food.
public class Snake {
    private LinkedList<Cell> snakeList = new LinkedList<>();
    private Cell head;

    public Snake(Cell initPos) {
        head = initPos;
        snakeList.add(head);
        head.setCellType(CellType.SNAKE_NODE);
    }

    public void grow() {
        snakeList.add(head);
    }

    public void move(Cell nextCell) {
        System.out.println("Snake is moving to " + nextCell.getRow() + nextCell.getCol());

        Cell tail = snakeList.removeLast();
        tail.setCellType(CellType.EMPTY);

        head = nextCell;
        head.setCellType(CellType.SNAKE_NODE);
        snakeList.addFirst(head);
    }

    public boolean checkCrash(Cell nextCell) {
        System.out.println("Going to check for Crash");
        for(Cell cell : snakeList) {
            if(cell == nextCell) {
                return true;
            }
        }
        return false;
    }

    public LinkedList<Cell> getSnakeList() {
        return snakeList;
    }



    public void setSnakeList(LinkedList<Cell> snakeList) {
        this.snakeList = snakeList;
    }

    public void
    setSnakePartList(LinkedList<Cell> snakePartList)
    {
        this.snakeList = snakeList;
    }

    public Cell getHead() { return head; }

    public void setHead(Cell head) { this.head = head; }
}


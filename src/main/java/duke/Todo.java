package duke;

public class Todo extends Task{
    public Todo(String description, boolean done) {
        super(description, done);
    }
    @Override
    public String toString() {
        return String.format("[T]%s", super.toString());
    }
}
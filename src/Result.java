public class Result {
    private int[] board;

    public Result(int[] board) {
        this.board = board;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for (int i = 0; i < board.length; i++) {
            builder.append(board[i]);
            if (i < board.length -1) {
                builder.append(", ");
            }
        }
        builder.append(']');
        return builder.toString();
    }
}

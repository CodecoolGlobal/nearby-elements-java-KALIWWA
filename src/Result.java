public class Result {
    private int[] tablica;

    public Result(int[] tablica) {
        this.tablica = tablica;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for (int i = 0; i < tablica.length; i++) {
            builder.append(tablica[i]);
            if (i < tablica.length -1) {
                builder.append(", ");
            }
        }
        builder.append(']');
        return builder.toString();
    }
}

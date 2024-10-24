package Task2;


public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];
        this.seats[0][0] = "X"; // Set director's seat

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                if (i != 0 || j != 0) { // Exclude the director's seat
                    this.seats[i][j] = "O";
                }
            }
        }
    }

    public int getRows(){
        return seats.length;
    }

    public int getSeats(){
        return seats[0].length;
    }


    public boolean reserve(int row, int seat){
        if (row >= 0 && row < getRows() && seat >= 0 && seat < getSeats() && seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat){
        if (row >= 0 && row < getRows() && seat >= 0 && seat < getSeats() && seats[row][seat].equals("X")) {
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    public String toString(){
        String result = "";
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}

public class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int numberOfLamps, int numberOfWindows) {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;

    }
        public int getNumberOfLamps() {
            return numberOfLamps;
        }

        public void setNumberOfLamps (int NumberOfLamps){
            this.numberOfLamps = numberOfLamps;
        }

        public int getNumberOfWindows(){
            return numberOfWindows;
        }

        public void setNumberOfWindows (int NumberOfWindows){
            this.numberOfWindows = numberOfWindows;
        }

}

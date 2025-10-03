import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       Room room1 = new Room (1, 2);
       Room room2 = new Room (2, 3);
       Room room3 = new Room (3, 1);
        //Add the three rooms to a collection
       ArrayList <Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        Building building = new Building (roomList, 2);

        System.out.println("Samlet antal Lamper: " + countLampsInBuilding(building));
        System.out.println("Samlet antal Rooms: " + countRoomsInBuilding(building));
        System.out.println("Samlet antal Vinduer: " + countWindowsInBuilding(building));

    }
    public static int countLampsInBuilding(Building building){
        int total = 0;
        for(Room r: building.getRooms()){
            total += r.getNumberOfLamps();
        }
        return total;
    }

    public static int countWindowsInBuilding(Building building) {
        int total = 0;
        for (Room r : building.getRooms()) {
            total += r.getNumberOfWindows();
        }

        return total;
    }
    public static int countRoomsInBuilding(Building building){
        return building.getRooms().size();

      //  private static int monsterCount(Building building, )
    }


}
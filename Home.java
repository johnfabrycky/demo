public class Home {
    private String address;
    private int numberRooms;
    private int squareFoot;

    public Home(String address, int numberRooms, int squareFoot) {
        this.address = address;
        this.numberRooms = numberRooms;
        this.squareFoot = squareFoot;
        
    }

    public String getAddress() {
        return address;
    }

    public int getNumberRooms() {
        return numberRooms;
    }
    
    public int getSquareFoot(){
        return squareFoot;
    }

    public float getSquareFeetPerRoom (){
        float averageSize = squareFoot/numberRooms;
        return averageSize;
    }

    public static void main(String[] args){
        Home gAndG = new Home("1476 Aaron Dr", 8, 3000);

        System.out.println("Address: " + gAndG.getAddress());
        System.out.println("Rooms: " + gAndG.getNumberRooms());
        System.out.println("Square Footage " + gAndG.getSquareFoot());
        System.out.println("Average Square Footage: " + gAndG.getSquareFeetPerRoom());

    
    }
}
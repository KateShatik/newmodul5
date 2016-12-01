/**
 * Created by Катя on 28.11.2016.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    public Room[] findRooms() ;
}

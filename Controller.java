/**
 * Created by Катя on 28.11.2016.
 */
public class Controller {

    public API apis[] = new API[3];

    public Controller() {
        this.apis[0] = new BookingComAPI();
        this.apis[1] = new GoogleAPI();
        this.apis[2] = new TripAdvisorAPI();

    }

    Room[] requstRooms(int price, int persons, String city, String hotel) {
        int count =0;
        for(API api:apis){
            count=api.findRooms(price, persons, city, hotel).length;
        }



        Room[] roomRequested = new Room[count];
        int index=0;

        for (API api: apis) {
            for(Room r: api.findRooms(price,persons,city,hotel)){
          roomRequested[index]=r;
                index++;
            }
        }
        return roomRequested;
    }

    Room[] check(API api1, API api2){

        int count=0;


        Room[] api1room = api1.findRooms();
        Room[] api2room = api2.findRooms();
        for(int i=0;i<api1room.length;i++){
            for(int j=0; i<api2room.length; j++){
                if (api1room[i].equals(api2room[j]))
                {

                   count++;
                }

            }
        }
        Room[] checked = new Room[count];
        for (int i=0; i< api1room.length; i++) {

            for(int j=0; j<api2room.length;j++) {
                if (api1room[i].equals(api2room[j]))
                {

                    checked[i]=api1room[i];
                }
            }
        }
        return checked;
    }

}

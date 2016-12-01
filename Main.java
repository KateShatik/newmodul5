/**
 * Created by Катя on 28.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.requstRooms(135,3,"Boston","KingsHouse");
        controller.requstRooms(120,2,"LA","Paradise");
        controller.requstRooms(110,2,"NewYork","BigAppleSuit");

        for(Room r: controller.requstRooms(135,3,"Boston","KingsHouse") ){
            System.out.println(r.getId());
        }
       API api1=new BookingComAPI();
        API api2=new GoogleAPI();
        controller.check(api1,api2);


    }
}

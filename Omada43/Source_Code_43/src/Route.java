
public class Route {  // NOPMD by Admin on 10/2/2013 8:44 ��
    private int busName;  // NOPMD by Admin on 10/2/2013 8:44 ��
    private int time;  // NOPMD by Admin on 10/2/2013 8:44 ��
    private int seats;  // NOPMD by Admin on 10/2/2013 8:44 ��
    private String day;  // NOPMD by Admin on 10/2/2013 8:44 ��
    private int ticketPrice;  // NOPMD by Admin on 10/2/2013 8:44 ��
    private String route;  // NOPMD by Admin on 10/2/2013 8:44 ��

    public void setAll(int busName ,int time , int seats , String day ,int ticketPrice , String route ){  // NOPMD by Admin on 10/2/2013 8:44 ��
        this.busName = busName;
        this.day=day;
        this.time = time;
        this.ticketPrice = ticketPrice;      
          this.route = route;     
          this.seats = seats;
    }
   
    public int getBusName() {
        return busName;
    }

     public int getTime() {
        return time;
    }

    public int getSeats() {
        return seats;
    }

    public String getDay() {
        return day;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }


    public String getRoute() {
        return route;
    }

   
}


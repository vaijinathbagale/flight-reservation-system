 package Classes;

/**
 *
 * @author vaiju
 */
public class FlightSection {

    private SeatClass seatClass;
    
    //constructor 01
    public FlightSection() {
        this.seatClass = null;
    }  
    
    //constructor 02
    public FlightSection(SeatClass seatClass) {
        this.seatClass = seatClass;
    }

    public void setSeatClass(SeatClass seatClass) {
        this.seatClass = seatClass;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }


    @Override
    public String toString() {
        return "Seat Class: " + seatClass ;
    }
    
    
    
    
    

    
}

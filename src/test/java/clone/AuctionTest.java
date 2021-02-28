package clone;



import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;


class AuctionTest {

    @Test
    public void testClone() {
        Auction auction = new Auction(5, LocalDateTime.parse("2018-01-01T12:00"),
                new User("Joe"),
                new Product("Computer"));
        Auction another = new Auction(auction);

        assertEquals(5, another.getPrice());
        assertEquals(LocalDateTime.parse("2018-01-01T12:00"), another.getStart());
        assertEquals( "Joe",another.getUser().getName());
        assertEquals("Computer" ,another.getProduct().getName());

        auction.getUser().setName("Jack");
        assertEquals( "Jack", auction.getUser().getName());
        auction.getProduct().setName("Computer2");
        /*assertEquals( "Joe", another.getUser().getName());
        ez nem fog lefutni mert ugyan rra mutat mind a kettő és ha az eredeti változik akkor a másolat is fog
         */
        auction.setPrice(10);
        assertEquals(5, another.getPrice());
        assertEquals(10, auction.getPrice());
        assertEquals("Computer2", auction.getProduct().getName());
    }

}
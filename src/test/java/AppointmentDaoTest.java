import org.junit.Test;
import org.me.learn_ssm.dao.AppointmentDao;
import org.me.learn_ssm.entity.Appointment;
import org.springframework.beans.factory.annotation.Autowired;

public class AppointmentDaoTest extends BaseTest {

    @Autowired
    private AppointmentDao appointmentDao;

    @Test
    public void testInsertAppointment() {
        long bookId = 1000;
        long studentId = 12345678910L;
        int insert = appointmentDao.insertAppointment(bookId, studentId);
        System.out.println("insert=" + insert);
    }

    @Test
    public void testQueryByKeyWithBook() throws Exception {
        long bookId = 1000;
        long studentId = 12345678910L;
        Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
        System.out.println(appointment);
        System.out.println(appointment.getBook());
    }

    @Test
    public void testMyListByKeyWithBoo() throws Exception {
        long bookId = 1000;
        long studentId = 12345678910L;
        Appointment appointment = appointmentDao.myListByKeyWithBoo(bookId, studentId);
        System.out.println(appointment);
        System.out.println(appointment.getBook());
    }
}

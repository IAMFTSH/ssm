import org.junit.Test;
import org.me.learn_ssm.dto.AppointExecution;
import org.me.learn_ssm.service.BaseBookService;
import org.me.learn_ssm.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImplTest extends BaseTest {

    /*只能向上转型*/
    @Autowired
    private BaseBookService bookServiceImpl;

    @Test
    public void testAppoint() throws Exception {
        long bookId = 1002;
        long studentId = 12345678910L;
        AppointExecution execution = bookServiceImpl.appoint(bookId, studentId);
        System.out.println(execution);
    }

}

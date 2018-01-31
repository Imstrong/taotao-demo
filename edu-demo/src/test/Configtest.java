import com.alibaba.druid.filter.config.ConfigTools;
import org.junit.Test;

public class Configtest {
    @Test
    public void testEncrypt()throws Exception{
        String str = ConfigTools.encrypt("123456");
        System.out.println(str);
    }
}

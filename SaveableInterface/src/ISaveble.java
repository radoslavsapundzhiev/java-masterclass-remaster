import java.util.ArrayList;
import java.util.List;

public interface ISaveble {
    List<String> write();
    void read(List<String> values);
}

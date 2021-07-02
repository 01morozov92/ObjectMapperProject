
package ApiModel;

import java.util.List;

import com.google.gson.annotations.Expose;
import lombok.Data;

@Data
public class RandomUserMain {

    private Info info;
    private List<Result> results;
}

import org.springframework.context.annotation.Scope;
import org.springframework.core.convert.Property;

@Scope("prototype")
public class Cat {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

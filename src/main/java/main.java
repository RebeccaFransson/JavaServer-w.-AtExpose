import com.atexpose.AtExpose;
import com.atexpose.api.datatypes.DataType;
import com.atexpose.dispatcherfactories.WebServerBuilder;
import io.schinzel.basicutils.configvar.ConfigVar;

public class main {
    static final String PORT = ConfigVar.create(".env").getValue("PORT");
    public static void main(String[] args){
        AtExpose atExpose= AtExpose.create();
        // Set different arguments used in the calls
        atExpose.getAPI()
                .addArgument("a", DataType.INT, "First number")
                .addArgument("b", DataType.INT, "Second number");
        atExpose.expose(API.Math.class)
                .start(WebServerBuilder.create().port(Integer.valueOf(PORT)).cacheFilesInRAM(false).build());
    }
}

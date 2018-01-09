package API;

import com.atexpose.Expose;

public class Math {
    @Expose(
            arguments = {"a", "b"},
            requiredArgumentCount = 2
    )
    public int add(int a, int b){
        return a + b;
    }
}

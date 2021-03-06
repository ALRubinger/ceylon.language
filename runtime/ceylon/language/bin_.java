package ceylon.language;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.Method;
import com.redhat.ceylon.compiler.java.metadata.Name;

@Ceylon(major = 3)
@Method
public final class bin_
{
    public static long bin(@Name("number") String number) {
        // FIXME: validation and sign (in particular parseLong expects a signed number
        // but we want it to be unsigned, so we need a lot more validation
        return java.lang.Long.parseLong(number.value, 2);
    }
    private bin_(){}
}

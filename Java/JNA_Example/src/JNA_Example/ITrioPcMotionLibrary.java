package JNA_Example;

import com.sun.jna.Library;

public interface ITrioPcMotionLibrary extends Library {
    //ITrioPcMotionLibrary INSTANCE =
            //(ITrioPcMotionLibrary) Native.loadLibrary("C:\\Program Files\\TrioMotion\\TrioPCMotion\\TrioPC_NET.dll", ITrioPcMotionLibrary.class);

    //void printf(String format, Object... args);
    void SetHost(String host);
    boolean Open(short portType, short portMode);
    boolean SetVr(short variable, double value);
    boolean GetVr(short variable, double value);
    boolean Close();
}

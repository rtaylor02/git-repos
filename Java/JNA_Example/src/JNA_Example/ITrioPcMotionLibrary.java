package JNA_Example;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface ITrioPcMotionLibrary extends Library {
    ITrioPcMotionLibrary INSTANCE =
            (ITrioPcMotionLibrary) Native.load("C:\\Program Files\\TrioMotion\\TrioPCMotion\\TrioPC_NET.dll", ITrioPcMotionLibrary.class);

    //void printf(String format, Object... args);
    String HostAddress = "127.0.0.2";
    void SetHost(String host);
    boolean Open(int portType, int portMode);
    boolean SetVr(short variable, double value);
    boolean GetVr(short variable, double value);
    boolean Close();
}

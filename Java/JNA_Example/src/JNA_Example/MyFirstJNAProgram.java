package JNA_Example;

import com.sun.jna.Native;

// Now we call the printf function...
public class MyFirstJNAProgram {
    public static void main(String args[]) {
        ITrioPcMotionLibrary INSTANCE =
                (ITrioPcMotionLibrary) Native.load("C:\\Program Files\\TrioMotion\\TrioPCMotion\\TrioPC_NET", ITrioPcMotionLibrary.class);

        //CRuntimeLibrary.INSTANCE.printf("Hello World from JNA !");
        INSTANCE.SetHost("127.0.0.2");
        INSTANCE.Open((short)2, (short)3240);
        INSTANCE.SetVr((short)1, (double)3.14);
        double temp = 0.0d;
        INSTANCE.GetVr((short)1, temp);
        INSTANCE.Close();
    }
}
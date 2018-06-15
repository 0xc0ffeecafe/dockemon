package example.dokemonster;

public class Segment {
    static{
        System.loadLibrary("7segment");

    }

    public native boolean SegmentControl(int data);
    public native boolean SegmentIOControl(int data);

      public boolean display(int data) {
            if(data < 0)
                data = 0;
            SegmentControl(data);
            return true;
      }

}

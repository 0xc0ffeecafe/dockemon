package example.dokemonster;

public class DotMatrix {
    static {
        System.loadLibrary("dotMatrix");
    }

    public native int DotMatrixControl(String data);

    void display(String data){
        int i, j, ch = 0;
        char buf[] = data.toCharArray();
        String result = "00000000000000000000";
        for (i = 0; i < data.length(); i++){
            ch = (int) buf[i];
            if (ch < 32 || ch > 126){
                break;
            }
            ch -= 0x20;
            for (j = 0; j < 5; j++) {
                String str = Integer.toHexString(font[ch][j]);
                if (str.length() < 2) {
                    result += "0";
                }
                result += str;
            }
            result += "00";
        }
        result += "00000000000000000000";
        for (i = 0; i < (result.length() - 18) / 2; i++) {
            for (j = 0; j < 10; j++) {
                DotMatrixControl(result.substring(2 * i, 2 * i + 20));
            }
        }
        DotMatrixControl("00000000000000000000");

    }

    private int font[][] = {
            {0x00, 0x00, 0x00, 0x00, 0x00}, /* 0x20 space */
            {0x00, 0x00, 0x4f, 0x00, 0x00}, /* 0x21 ! */
            {0x00, 0x07, 0x00, 0x07, 0x00}, /* 0x22 " */
            {0x14, 0x7f, 0x14, 0x7f, 0x14}, /* 0x23 # */
            {0x24, 0x2a, 0x7f, 0x2a, 0X12}, /* 0x24 $ */
            {0x23, 0x13, 0x08, 0x64, 0x62}, /* 0x25 % */
            {0x36, 0x49, 0x55, 0x22, 0x50}, /* 0x26 & */
            {0x00, 0x05, 0x03, 0x00, 0x00}, /* OX2? ' */
            {0x00, 0x1c, 0x22, 0x41, 0x00}, /* 0x28 ( */
            {0x00, 0x41, 0x22, 0x1c, 0x00}, /* 0x29 1 */
            {0x14, 0x08, 0x3e, 0x08, 0x14}, /* 0x2a * */
            {0x08, 0x08, 0x3e, 0x08, 0x08}, /* 0x2b + */
            {0x00, 0x50, 0x30, 0x00, 0x00}, /* 0x20 , */
            {0x08, 0x08, 0x08, 0x08, 0x08}, /* 0x2d - */
            {0x00, 0x60, 0x60, 0x00, 0x00}, /* 0x2e _ */
            {0x20, 0x10, 0x08, 0x04, 0x02}, /* Ox2f 1 */
            {0x3e, 0x51, 0x49, 0x45, 0x3e}, /* 0x30 0 */
            {0x00, 0x42, 0x7f, 0x40, 0x00}, /* 0x31 1 */
            {0x42, 0x61, 0x51, 0x49, 0x46}, /* 0x32 2 */
            {0x21, 0x41, 0x45, 0x4b, 0x31}, /* 0x33 3 */
            {0x18, 0x14, 0x12, 0x7f, 0x10}, /* 0x34 4 */
            {0x27, 0x45, 0x45, 0x45, 0x39}, /* 0x35 5 */
            {0x30, 0x4a, 0x49, 0x49, 0x30}, /* 0x36 6 */
            {0x01, 0x71, 0x09, 0x05, 0x03}, /* OX3? 7 */
            {0x36, 0x49, 0x49, 0x49, 0x36}, /* 0x38 8 */
            {0x06, 0x49, 0x49, 0x29, 0x1e}, /* 0x39 9 */
            {0x00, 0x36, 0x36, 0x00, 0x00}, /* 0x3a : */
            {0x00, 0x56, 0x36, 0x00, 0x00}, /* 0x3b ; */
            {0x08, 0x14, 0x22, 0x41, 0x00}, /* 0x3c ( */
            {0x14, 0x14, 0x14, 0x14, 0x14}, /* 0x3d : */
            {0x00, 0x41, 0x22, 0x14, 0x08}, /* 0x3e ) */
            {0x02, 0x01, 0x51, 0x09, 0x06}, /* 0x3f ? */
            {0x32, 0x49, 0x79, 0x41, 0x3e}, /* 0x40 @ */
            {0x7e, 0x11, 0x11, 0x11, 0x7e}, /* 0x41 A */
            {0x7f, 0x49, 0x49, 0x49, 0x36}, /* 0x42 B */
            {0x3e, 0x41, 0x41, 0x41, 0x22}, /* 0x43 C */
            {0x7f, 0x41, 0x41, 0x22, 0x1c}, /* 0x44 D */
            {0x7f, 0x49, 0x49, 0x49, 0x41}, /* 0x45 E */
            {0x7f, 0x09, 0x09, 0x09, 0x01}, /* 0x46 F */
            {0x3e, 0x41, 0x49, 0x49, 0x7a}, /* 0x47 G */
            {0x7f, 0x08, 0x08, 0x08, 0x7f}, /* 0x48 H */
            {0x00, 0x41, 0x7f, 0x41, 0x00}, /* 0x49 I */
            {0x20, 0x40, 0x41, 0x3f, 0x01}, /* 0x4a J */
            {0x7f, 0x08, 0x14, 0x22, 0x41}, /* 0x4b K */
            {0x7f, 0x40, 0x40, 0x40, 0x40}, /* 0x4c L */
            {0x7f, 0x02, 0x0c, 0x02, 0x7f}, /* 0x4d M */
            {0x7f, 0x04, 0x08, 0x10, 0x7f}, /* 0x4e N */
            {0x3e, 0x41, 0x41, 0x41, 0x3e}, /* 0x4f O */
            {0x7f, 0x09, 0x09, 0x09, 0x06}, /* 0x50 P */
            {0x3e, 0x41, 0x51, 0x21, 0x5e}, /* 0x51 Q */
            {0x7f, 0x09, 0x19, 0x29, 0x46}, /* 0x52 R */
            {0x26, 0x49, 0x49, 0x49, 0x32}, /* 0x53 S */
            {0x01, 0x01, 0x7f, 0x01, 0x01}, /* 0x54 T */
            {0x3f, 0x40, 0x40, 0x40, 0x3f}, /* 0x55 U */
            {0x1f, 0x20, 0x40, 0x20, 0x1f}, /* 0x56 V */
            {0x3f, 0x40, 0x38, 0x40, 0x3f}, /* 0x57 W */
            {0x63, 0x14, 0x08, 0x14, 0x63}, /* 0x58 X */
            {0x07, 0x08, 0x70, 0x08, 0x07}, /* 0x59 Y */
            {0x61, 0x51, 0x49, 0x45, 0x43}, /* 0x5a Z */
            {0x00, 0x7f, 0x41, 0x41, 0x00},  /* 0x5b [*/
            {0x02, 0x04, 0x08, 0x10, 0x20}, /* 0x50 \ */
            {0x00, 0x41, 0x41, 0x7f, 0x00}, /* 0x5d ] */
            {0x04, 0x02, 0x01, 0x02, 0x04}, /* 0x5e " */
            {0x40, 0x40, 0x40, 0x40, 0x40}, /* 0x5r _ */
            {0x00, 0x01, 0x02, 0x04, 0x00}, /* 0x60 ‘ */
            {0x20, 0x54, 0x54, 0x54, 0x78}, /* 0x61 a */
            {0x7f, 0x48, 0x44, 0x44, 0x38}, /* 0x62 b */
            {0x38, 0x44, 0x44, 0x44, 0x20}, /* 0x63 c */
            {0x38, 0x44, 0x44, 0x48, 0x7f}, /* 0x64 d */
            {0x38, 0x54, 0x54, 0x54, 0x18}, /* 0x65 e */
            {0x08, 0x7e, 0x09, 0x01, 0x02}, /* 0x66 f */
            {0x0c, 0x52, 0x52, 0x52, 0x3e}, /* 0x6? g */
            {0x7f, 0x08, 0x04, 0x04, 0x78}, /* 0x68 h */
            {0x00, 0x04, 0x7d, 0x00, 0x00}, /* 0x69 i */
            {0x20, 0x40, 0x44, 0x3d, 0x00}, /* 0x6aj */
            {0x7f, 0x10, 0x28, 0x44, 0x00}, /* 0x6b k*/
            {0x00, 0x41, 0x7f, 0x40, 0x00}, /* 0x60 I */
            {0x7c, 0x04, 0x18, 0x04, 0x7c}, /* 0x6d m */
            {0x7c, 0x08, 0x04, 0x04, 0x78}, /* 0x6e n */
            {0x38, 0x44, 0x44, 0x44, 0x38}, /* 0x6f 0 */
            {0x7c, 0x14, 0x14, 0x14, 0x08}, /* 0xT0 p */
            {0x08, 0x14, 0x14, 0x18, 0x7c}, /* 0xT1 q */
            {0x7c, 0x08, 0x04, 0x04, 0x08}, /* 0xT2 r*/
            {0x48, 0x54, 0x54, 0x54, 0x20}, /* 0x73 s */
            {0x04, 0x3f, 0x44, 0x40, 0x20}, /* 0x74 t */
            {0x3c, 0x40, 0x40, 0x20, 0x7c}, /* 0x75 u */
            {0x1c, 0x20, 0x40, 0x20, 0x1c}, /*0x76v*/
            {0x3c, 0x40, 0x30, 0x40, 0x3c}, /* 0x78 x */
            {0x44, 0x28, 0x10, 0x28, 0x44}, /* 0X7? W */
            {0x0c, 0x50, 0x50, 0x50, 0x3c}, /* 0x79 y */
            {0x44, 0x64, 0x54, 0x4c, 0x44}, /* 0x7a z */
            {0x00, 0x08, 0x36, 0x41, 0x00}, /*0x7b {*/
            {0x00, 0x00, 0x77, 0x00, 0x00}, /*0x7c |*/
            {0x00, 0x41, 0x36, 0x08, 0x00}, /*0x7d }*/
            {0x08, 0x04, 0x08, 0x10, 0x08}  /*0x7e ~*/
    };

}



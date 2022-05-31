// created by JCOMGen
// from TypeLib at F:\github\jdm\lib\3.1233\dm.dll
// check for latest version at http://www.simtel.net

package Dm;

import com.develop.jawin.*;

public class Idmsoft extends DispatchPtr {
    static public final GUID proxyIID = new GUID("{F3F54BC2-D6D1-4A85-B943-16287ECEA64C}");


    static public final int iidToken;

    static {
        iidToken = IdentityManager.registerProxy(proxyIID, Idmsoft.class);
    }

    public int getGuidToken() {
        return iidToken;
    }

    public Idmsoft() throws COMException {
        super();
    }
    public Idmsoft(String progid) throws COMException {
        super(progid);
    }
    public Idmsoft(IUnknown other) throws COMException {
        super(other);
    }
    public Idmsoft(GUID ClsID) throws COMException {
        super(ClsID);
    }
    public String Ver() throws COMException {
        return (String) invoke("Ver");
    }
    public int SetPath(String path) throws COMException {
        return ((Integer) invokeN("SetPath", new Object[]{path}, 1)).intValue();
    }
    public String Ocr(int x1, int y1, int x2, int y2, String color, double sim) throws COMException {
        return (String) invokeN("Ocr", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), color, new Double(sim)}, 6);
    }
    public int FindStr(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y) throws COMException {
        return ((Integer) invokeN("FindStr", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), str, color, new Double(sim), x, y}, 9)).intValue();
    }
    public int GetResultCount(String str) throws COMException {
        return ((Integer) invokeN("GetResultCount", new Object[]{str}, 1)).intValue();
    }
    public int GetResultPos(String str, int index, Object x, Object y) throws COMException {
        return ((Integer) invokeN("GetResultPos", new Object[]{str, new Integer(index), x, y}, 4)).intValue();
    }
    public int StrStr(String s, String str) throws COMException {
        return ((Integer) invokeN("StrStr", new Object[]{s, str}, 2)).intValue();
    }
    public int SendCommand(String cmd) throws COMException {
        return ((Integer) invokeN("SendCommand", new Object[]{cmd}, 1)).intValue();
    }
    public int UseDict(int index) throws COMException {
        return ((Integer) invokeN("UseDict", new Object[]{new Integer(index)}, 1)).intValue();
    }
    public String GetBasePath() throws COMException {
        return (String) invoke("GetBasePath");
    }
    public int SetDictPwd(String pwd) throws COMException {
        return ((Integer) invokeN("SetDictPwd", new Object[]{pwd}, 1)).intValue();
    }
    public String OcrInFile(int x1, int y1, int x2, int y2, String pic_name, String color, double sim) throws COMException {
        return (String) invokeN("OcrInFile", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), pic_name, color, new Double(sim)}, 7);
    }
    public int Capture(int x1, int y1, int x2, int y2, String file) throws COMException {
        return ((Integer) invokeN("Capture", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), file}, 5)).intValue();
    }
    public int KeyPress(int vk) throws COMException {
        return ((Integer) invokeN("KeyPress", new Object[]{new Integer(vk)}, 1)).intValue();
    }
    public int KeyDown(int vk) throws COMException {
        return ((Integer) invokeN("KeyDown", new Object[]{new Integer(vk)}, 1)).intValue();
    }
    public int KeyUp(int vk) throws COMException {
        return ((Integer) invokeN("KeyUp", new Object[]{new Integer(vk)}, 1)).intValue();
    }
    public int LeftClick() throws COMException {
        return ((Integer) invoke("LeftClick")).intValue();
    }
    public int RightClick() throws COMException {
        return ((Integer) invoke("RightClick")).intValue();
    }
    public int MiddleClick() throws COMException {
        return ((Integer) invoke("MiddleClick")).intValue();
    }
    public int LeftDoubleClick() throws COMException {
        return ((Integer) invoke("LeftDoubleClick")).intValue();
    }
    public int LeftDown() throws COMException {
        return ((Integer) invoke("LeftDown")).intValue();
    }
    public int LeftUp() throws COMException {
        return ((Integer) invoke("LeftUp")).intValue();
    }
    public int RightDown() throws COMException {
        return ((Integer) invoke("RightDown")).intValue();
    }
    public int RightUp() throws COMException {
        return ((Integer) invoke("RightUp")).intValue();
    }
    public int MoveTo(int x, int y) throws COMException {
        return ((Integer) invokeN("MoveTo", new Object[]{new Integer(x), new Integer(y)}, 2)).intValue();
    }
    public int MoveR(int rx, int ry) throws COMException {
        return ((Integer) invokeN("MoveR", new Object[]{new Integer(rx), new Integer(ry)}, 2)).intValue();
    }
    public String GetColor(int x, int y) throws COMException {
        return (String) invokeN("GetColor", new Object[]{new Integer(x), new Integer(y)}, 2);
    }
    public String GetColorBGR(int x, int y) throws COMException {
        return (String) invokeN("GetColorBGR", new Object[]{new Integer(x), new Integer(y)}, 2);
    }
    public String RGB2BGR(String rgb_color) throws COMException {
        return (String) invokeN("RGB2BGR", new Object[]{rgb_color}, 1);
    }
    public String BGR2RGB(String bgr_color) throws COMException {
        return (String) invokeN("BGR2RGB", new Object[]{bgr_color}, 1);
    }
    public int UnBindWindow() throws COMException {
        return ((Integer) invoke("UnBindWindow")).intValue();
    }
    public int CmpColor(int x, int y, String color, double sim) throws COMException {
        return ((Integer) invokeN("CmpColor", new Object[]{new Integer(x), new Integer(y), color, new Double(sim)}, 4)).intValue();
    }
    public int ClientToScreen(int hwnd, Object x, Object y) throws COMException {
        return ((Integer) invokeN("ClientToScreen", new Object[]{new Integer(hwnd), x, y}, 3)).intValue();
    }
    public int ScreenToClient(int hwnd, Object x, Object y) throws COMException {
        return ((Integer) invokeN("ScreenToClient", new Object[]{new Integer(hwnd), x, y}, 3)).intValue();
    }
    public int ShowScrMsg(int x1, int y1, int x2, int y2, String msg, String color) throws COMException {
        return ((Integer) invokeN("ShowScrMsg", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), msg, color}, 6)).intValue();
    }
    public int SetMinRowGap(int row_gap) throws COMException {
        return ((Integer) invokeN("SetMinRowGap", new Object[]{new Integer(row_gap)}, 1)).intValue();
    }
    public int SetMinColGap(int col_gap) throws COMException {
        return ((Integer) invokeN("SetMinColGap", new Object[]{new Integer(col_gap)}, 1)).intValue();
    }
    public int FindColor(int x1, int y1, int x2, int y2, String color, double sim, int dir, Object x, Object y) throws COMException {
        return ((Integer) invokeN("FindColor", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), color, new Double(sim), new Integer(dir), x, y}, 9)).intValue();
    }
    public String FindColorEx(int x1, int y1, int x2, int y2, String color, double sim, int dir) throws COMException {
        return (String) invokeN("FindColorEx", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), color, new Double(sim), new Integer(dir)}, 7);
    }
    public int SetWordLineHeight(int line_height) throws COMException {
        return ((Integer) invokeN("SetWordLineHeight", new Object[]{new Integer(line_height)}, 1)).intValue();
    }
    public int SetWordGap(int word_gap) throws COMException {
        return ((Integer) invokeN("SetWordGap", new Object[]{new Integer(word_gap)}, 1)).intValue();
    }
    public int SetRowGapNoDict(int row_gap) throws COMException {
        return ((Integer) invokeN("SetRowGapNoDict", new Object[]{new Integer(row_gap)}, 1)).intValue();
    }
    public int SetColGapNoDict(int col_gap) throws COMException {
        return ((Integer) invokeN("SetColGapNoDict", new Object[]{new Integer(col_gap)}, 1)).intValue();
    }
    public int SetWordLineHeightNoDict(int line_height) throws COMException {
        return ((Integer) invokeN("SetWordLineHeightNoDict", new Object[]{new Integer(line_height)}, 1)).intValue();
    }
    public int SetWordGapNoDict(int word_gap) throws COMException {
        return ((Integer) invokeN("SetWordGapNoDict", new Object[]{new Integer(word_gap)}, 1)).intValue();
    }
    public int GetWordResultCount(String str) throws COMException {
        return ((Integer) invokeN("GetWordResultCount", new Object[]{str}, 1)).intValue();
    }
    public int GetWordResultPos(String str, int index, Object x, Object y) throws COMException {
        return ((Integer) invokeN("GetWordResultPos", new Object[]{str, new Integer(index), x, y}, 4)).intValue();
    }
    public String GetWordResultStr(String str, int index) throws COMException {
        return (String) invokeN("GetWordResultStr", new Object[]{str, new Integer(index)}, 2);
    }
    public String GetWords(int x1, int y1, int x2, int y2, String color, double sim) throws COMException {
        return (String) invokeN("GetWords", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), color, new Double(sim)}, 6);
    }
    public String GetWordsNoDict(int x1, int y1, int x2, int y2, String color) throws COMException {
        return (String) invokeN("GetWordsNoDict", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), color}, 5);
    }
    public int SetShowErrorMsg(int show) throws COMException {
        return ((Integer) invokeN("SetShowErrorMsg", new Object[]{new Integer(show)}, 1)).intValue();
    }
    public int GetClientSize(int hwnd, Object width, Object height) throws COMException {
        return ((Integer) invokeN("GetClientSize", new Object[]{new Integer(hwnd), width, height}, 3)).intValue();
    }
    public int MoveWindow(int hwnd, int x, int y) throws COMException {
        return ((Integer) invokeN("MoveWindow", new Object[]{new Integer(hwnd), new Integer(x), new Integer(y)}, 3)).intValue();
    }
    public String GetColorHSV(int x, int y) throws COMException {
        return (String) invokeN("GetColorHSV", new Object[]{new Integer(x), new Integer(y)}, 2);
    }
    public String GetAveRGB(int x1, int y1, int x2, int y2) throws COMException {
        return (String) invokeN("GetAveRGB", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2)}, 4);
    }
    public String GetAveHSV(int x1, int y1, int x2, int y2) throws COMException {
        return (String) invokeN("GetAveHSV", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2)}, 4);
    }
    public int GetForegroundWindow() throws COMException {
        return ((Integer) invoke("GetForegroundWindow")).intValue();
    }
    public int GetForegroundFocus() throws COMException {
        return ((Integer) invoke("GetForegroundFocus")).intValue();
    }
    public int GetMousePointWindow() throws COMException {
        return ((Integer) invoke("GetMousePointWindow")).intValue();
    }
    public int GetPointWindow(int x, int y) throws COMException {
        return ((Integer) invokeN("GetPointWindow", new Object[]{new Integer(x), new Integer(y)}, 2)).intValue();
    }
    public String EnumWindow(int parent, String title, String class_name, int filter) throws COMException {
        return (String) invokeN("EnumWindow", new Object[]{new Integer(parent), title, class_name, new Integer(filter)}, 4);
    }
    public int GetWindowState(int hwnd, int flag) throws COMException {
        return ((Integer) invokeN("GetWindowState", new Object[]{new Integer(hwnd), new Integer(flag)}, 2)).intValue();
    }
    public int GetWindow(int hwnd, int flag) throws COMException {
        return ((Integer) invokeN("GetWindow", new Object[]{new Integer(hwnd), new Integer(flag)}, 2)).intValue();
    }
    public int GetSpecialWindow(int flag) throws COMException {
        return ((Integer) invokeN("GetSpecialWindow", new Object[]{new Integer(flag)}, 1)).intValue();
    }
    public int SetWindowText(int hwnd, String text) throws COMException {
        return ((Integer) invokeN("SetWindowText", new Object[]{new Integer(hwnd), text}, 2)).intValue();
    }
    public int SetWindowSize(int hwnd, int width, int height) throws COMException {
        return ((Integer) invokeN("SetWindowSize", new Object[]{new Integer(hwnd), new Integer(width), new Integer(height)}, 3)).intValue();
    }
    public int GetWindowRect(int hwnd, Object x1, Object y1, Object x2, Object y2) throws COMException {
        return ((Integer) invokeN("GetWindowRect", new Object[]{new Integer(hwnd), x1, y1, x2, y2}, 5)).intValue();
    }
    public String GetWindowTitle(int hwnd) throws COMException {
        return (String) invokeN("GetWindowTitle", new Object[]{new Integer(hwnd)}, 1);
    }
    public String GetWindowClass(int hwnd) throws COMException {
        return (String) invokeN("GetWindowClass", new Object[]{new Integer(hwnd)}, 1);
    }
    public int SetWindowState(int hwnd, int flag) throws COMException {
        return ((Integer) invokeN("SetWindowState", new Object[]{new Integer(hwnd), new Integer(flag)}, 2)).intValue();
    }
    public int CreateFoobarRect(int hwnd, int x, int y, int w, int h) throws COMException {
        return ((Integer) invokeN("CreateFoobarRect", new Object[]{new Integer(hwnd), new Integer(x), new Integer(y), new Integer(w), new Integer(h)}, 5)).intValue();
    }
    public int CreateFoobarRoundRect(int hwnd, int x, int y, int w, int h, int rw, int rh) throws COMException {
        return ((Integer) invokeN("CreateFoobarRoundRect", new Object[]{new Integer(hwnd), new Integer(x), new Integer(y), new Integer(w), new Integer(h), new Integer(rw), new Integer(rh)}, 7)).intValue();
    }
    public int CreateFoobarEllipse(int hwnd, int x, int y, int w, int h) throws COMException {
        return ((Integer) invokeN("CreateFoobarEllipse", new Object[]{new Integer(hwnd), new Integer(x), new Integer(y), new Integer(w), new Integer(h)}, 5)).intValue();
    }
    public int CreateFoobarCustom(int hwnd, int x, int y, String pic, String trans_color, double sim) throws COMException {
        return ((Integer) invokeN("CreateFoobarCustom", new Object[]{new Integer(hwnd), new Integer(x), new Integer(y), pic, trans_color, new Double(sim)}, 6)).intValue();
    }
    public int FoobarFillRect(int hwnd, int x1, int y1, int x2, int y2, String color) throws COMException {
        return ((Integer) invokeN("FoobarFillRect", new Object[]{new Integer(hwnd), new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), color}, 6)).intValue();
    }
    public int FoobarDrawText(int hwnd, int x, int y, int w, int h, String text, String color, int align) throws COMException {
        return ((Integer) invokeN("FoobarDrawText", new Object[]{new Integer(hwnd), new Integer(x), new Integer(y), new Integer(w), new Integer(h), text, color, new Integer(align)}, 8)).intValue();
    }
    public int FoobarDrawPic(int hwnd, int x, int y, String pic, String trans_color) throws COMException {
        return ((Integer) invokeN("FoobarDrawPic", new Object[]{new Integer(hwnd), new Integer(x), new Integer(y), pic, trans_color}, 5)).intValue();
    }
    public int FoobarUpdate(int hwnd) throws COMException {
        return ((Integer) invokeN("FoobarUpdate", new Object[]{new Integer(hwnd)}, 1)).intValue();
    }
    public int FoobarLock(int hwnd) throws COMException {
        return ((Integer) invokeN("FoobarLock", new Object[]{new Integer(hwnd)}, 1)).intValue();
    }
    public int FoobarUnlock(int hwnd) throws COMException {
        return ((Integer) invokeN("FoobarUnlock", new Object[]{new Integer(hwnd)}, 1)).intValue();
    }
    public int FoobarSetFont(int hwnd, String font_name, int size, int flag) throws COMException {
        return ((Integer) invokeN("FoobarSetFont", new Object[]{new Integer(hwnd), font_name, new Integer(size), new Integer(flag)}, 4)).intValue();
    }
    public int FoobarTextRect(int hwnd, int x, int y, int w, int h) throws COMException {
        return ((Integer) invokeN("FoobarTextRect", new Object[]{new Integer(hwnd), new Integer(x), new Integer(y), new Integer(w), new Integer(h)}, 5)).intValue();
    }
    public int FoobarPrintText(int hwnd, String text, String color) throws COMException {
        return ((Integer) invokeN("FoobarPrintText", new Object[]{new Integer(hwnd), text, color}, 3)).intValue();
    }
    public int FoobarClearText(int hwnd) throws COMException {
        return ((Integer) invokeN("FoobarClearText", new Object[]{new Integer(hwnd)}, 1)).intValue();
    }
    public int FoobarTextLineGap(int hwnd, int gap) throws COMException {
        return ((Integer) invokeN("FoobarTextLineGap", new Object[]{new Integer(hwnd), new Integer(gap)}, 2)).intValue();
    }
    public int Play(String file) throws COMException {
        return ((Integer) invokeN("Play", new Object[]{file}, 1)).intValue();
    }
    public int FaqCapture(int x1, int y1, int x2, int y2, int quality, int delay, int time) throws COMException {
        return ((Integer) invokeN("FaqCapture", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), new Integer(quality), new Integer(delay), new Integer(time)}, 7)).intValue();
    }
    public int FaqRelease(int handle) throws COMException {
        return ((Integer) invokeN("FaqRelease", new Object[]{new Integer(handle)}, 1)).intValue();
    }
    public String FaqSend(String server, int handle, int request_type, int time_out) throws COMException {
        return (String) invokeN("FaqSend", new Object[]{server, new Integer(handle), new Integer(request_type), new Integer(time_out)}, 4);
    }
    public int Beep(int fre, int delay) throws COMException {
        return ((Integer) invokeN("Beep", new Object[]{new Integer(fre), new Integer(delay)}, 2)).intValue();
    }
    public int FoobarClose(int hwnd) throws COMException {
        return ((Integer) invokeN("FoobarClose", new Object[]{new Integer(hwnd)}, 1)).intValue();
    }
    public int MoveDD(int dx, int dy) throws COMException {
        return ((Integer) invokeN("MoveDD", new Object[]{new Integer(dx), new Integer(dy)}, 2)).intValue();
    }
    public int FaqGetSize(int handle) throws COMException {
        return ((Integer) invokeN("FaqGetSize", new Object[]{new Integer(handle)}, 1)).intValue();
    }
    public int LoadPic(String pic_name) throws COMException {
        return ((Integer) invokeN("LoadPic", new Object[]{pic_name}, 1)).intValue();
    }
    public int FreePic(String pic_name) throws COMException {
        return ((Integer) invokeN("FreePic", new Object[]{pic_name}, 1)).intValue();
    }
    public int GetScreenData(int x1, int y1, int x2, int y2) throws COMException {
        return ((Integer) invokeN("GetScreenData", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2)}, 4)).intValue();
    }
    public int FreeScreenData(int handle) throws COMException {
        return ((Integer) invokeN("FreeScreenData", new Object[]{new Integer(handle)}, 1)).intValue();
    }
    public int WheelUp() throws COMException {
        return ((Integer) invoke("WheelUp")).intValue();
    }
    public int WheelDown() throws COMException {
        return ((Integer) invoke("WheelDown")).intValue();
    }
    public int SetMouseDelay(String type, int delay) throws COMException {
        return ((Integer) invokeN("SetMouseDelay", new Object[]{type, new Integer(delay)}, 2)).intValue();
    }
    public int SetKeypadDelay(String type, int delay) throws COMException {
        return ((Integer) invokeN("SetKeypadDelay", new Object[]{type, new Integer(delay)}, 2)).intValue();
    }
    public String GetEnv(int index, String name) throws COMException {
        return (String) invokeN("GetEnv", new Object[]{new Integer(index), name}, 2);
    }
    public int SetEnv(int index, String name, String value) throws COMException {
        return ((Integer) invokeN("SetEnv", new Object[]{new Integer(index), name, value}, 3)).intValue();
    }
    public int SendString(int hwnd, String str) throws COMException {
        return ((Integer) invokeN("SendString", new Object[]{new Integer(hwnd), str}, 2)).intValue();
    }
    public int DelEnv(int index, String name) throws COMException {
        return ((Integer) invokeN("DelEnv", new Object[]{new Integer(index), name}, 2)).intValue();
    }
    public String GetPath() throws COMException {
        return (String) invoke("GetPath");
    }
    public int SetDict(int index, String dict_name) throws COMException {
        return ((Integer) invokeN("SetDict", new Object[]{new Integer(index), dict_name}, 2)).intValue();
    }
    public int FindPic(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir, Object x, Object y) throws COMException {
        return ((Integer) invokeN("FindPic", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), pic_name, delta_color, new Double(sim), new Integer(dir), x, y}, 10)).intValue();
    }
    public String FindPicEx(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir) throws COMException {
        return (String) invokeN("FindPicEx", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), pic_name, delta_color, new Double(sim), new Integer(dir)}, 8);
    }
    public int SetClientSize(int hwnd, int width, int height) throws COMException {
        return ((Integer) invokeN("SetClientSize", new Object[]{new Integer(hwnd), new Integer(width), new Integer(height)}, 3)).intValue();
    }
    public int ReadInt(int hwnd, String addr, int type) throws COMException {
        return ((Integer) invokeN("ReadInt", new Object[]{new Integer(hwnd), addr, new Integer(type)}, 3)).intValue();
    }
    public float ReadFloat(int hwnd, String addr) throws COMException {
        return ((Float) invokeN("ReadFloat", new Object[]{new Integer(hwnd), addr}, 2)).floatValue();
    }
    public double ReadDouble(int hwnd, String addr) throws COMException {
        return ((Double) invokeN("ReadDouble", new Object[]{new Integer(hwnd), addr}, 2)).doubleValue();
    }
    public String FindInt(int hwnd, String addr_range, int int_value_min, int int_value_max, int type) throws COMException {
        return (String) invokeN("FindInt", new Object[]{new Integer(hwnd), addr_range, new Integer(int_value_min), new Integer(int_value_max), new Integer(type)}, 5);
    }
    public String FindFloat(int hwnd, String addr_range, float float_value_min, float float_value_max) throws COMException {
        return (String) invokeN("FindFloat", new Object[]{new Integer(hwnd), addr_range, new Float(float_value_min), new Float(float_value_max)}, 4);
    }
    public String FindDouble(int hwnd, String addr_range, double double_value_min, double double_value_max) throws COMException {
        return (String) invokeN("FindDouble", new Object[]{new Integer(hwnd), addr_range, new Double(double_value_min), new Double(double_value_max)}, 4);
    }
    public String FindString(int hwnd, String addr_range, String string_value, int type) throws COMException {
        return (String) invokeN("FindString", new Object[]{new Integer(hwnd), addr_range, string_value, new Integer(type)}, 4);
    }
    public int GetModuleBaseAddr(int hwnd, String module_name) throws COMException {
        return ((Integer) invokeN("GetModuleBaseAddr", new Object[]{new Integer(hwnd), module_name}, 2)).intValue();
    }
    public String MoveToEx(int x, int y, int w, int h) throws COMException {
        return (String) invokeN("MoveToEx", new Object[]{new Integer(x), new Integer(y), new Integer(w), new Integer(h)}, 4);
    }
    public String MatchPicName(String pic_name) throws COMException {
        return (String) invokeN("MatchPicName", new Object[]{pic_name}, 1);
    }
    public int AddDict(int index, String dict_info) throws COMException {
        return ((Integer) invokeN("AddDict", new Object[]{new Integer(index), dict_info}, 2)).intValue();
    }
    public int EnterCri() throws COMException {
        return ((Integer) invoke("EnterCri")).intValue();
    }
    public int LeaveCri() throws COMException {
        return ((Integer) invoke("LeaveCri")).intValue();
    }
    public int WriteInt(int hwnd, String addr, int type, int v) throws COMException {
        return ((Integer) invokeN("WriteInt", new Object[]{new Integer(hwnd), addr, new Integer(type), new Integer(v)}, 4)).intValue();
    }
    public int WriteFloat(int hwnd, String addr, float v) throws COMException {
        return ((Integer) invokeN("WriteFloat", new Object[]{new Integer(hwnd), addr, new Float(v)}, 3)).intValue();
    }
    public int WriteDouble(int hwnd, String addr, double v) throws COMException {
        return ((Integer) invokeN("WriteDouble", new Object[]{new Integer(hwnd), addr, new Double(v)}, 3)).intValue();
    }
    public int WriteString(int hwnd, String addr, int type, String v) throws COMException {
        return ((Integer) invokeN("WriteString", new Object[]{new Integer(hwnd), addr, new Integer(type), v}, 4)).intValue();
    }
    public int AsmAdd(String asm_ins) throws COMException {
        return ((Integer) invokeN("AsmAdd", new Object[]{asm_ins}, 1)).intValue();
    }
    public int AsmClear() throws COMException {
        return ((Integer) invoke("AsmClear")).intValue();
    }
    public int AsmCall(int hwnd, int mode) throws COMException {
        return ((Integer) invokeN("AsmCall", new Object[]{new Integer(hwnd), new Integer(mode)}, 2)).intValue();
    }
    public int FindMultiColor(int x1, int y1, int x2, int y2, String first_color, String offset_color, double sim, int dir, Object x, Object y) throws COMException {
        return ((Integer) invokeN("FindMultiColor", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), first_color, offset_color, new Double(sim), new Integer(dir), x, y}, 10)).intValue();
    }
    public String FindMultiColorEx(int x1, int y1, int x2, int y2, String first_color, String offset_color, double sim, int dir) throws COMException {
        return (String) invokeN("FindMultiColorEx", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), first_color, offset_color, new Double(sim), new Integer(dir)}, 8);
    }
    public String AsmCode(int base_addr) throws COMException {
        return (String) invokeN("AsmCode", new Object[]{new Integer(base_addr)}, 1);
    }
    public String Assemble(String asm_code, int base_addr, int is_upper) throws COMException {
        return (String) invokeN("Assemble", new Object[]{asm_code, new Integer(base_addr), new Integer(is_upper)}, 3);
    }
    public int SetWindowTransparent(int hwnd, int v) throws COMException {
        return ((Integer) invokeN("SetWindowTransparent", new Object[]{new Integer(hwnd), new Integer(v)}, 2)).intValue();
    }
    public String ReadData(int hwnd, String addr, int len) throws COMException {
        return (String) invokeN("ReadData", new Object[]{new Integer(hwnd), addr, new Integer(len)}, 3);
    }
    public int WriteData(int hwnd, String addr, String data) throws COMException {
        return ((Integer) invokeN("WriteData", new Object[]{new Integer(hwnd), addr, data}, 3)).intValue();
    }
    public String FindData(int hwnd, String addr_range, String data) throws COMException {
        return (String) invokeN("FindData", new Object[]{new Integer(hwnd), addr_range, data}, 3);
    }
    public int SetPicPwd(String pwd) throws COMException {
        return ((Integer) invokeN("SetPicPwd", new Object[]{pwd}, 1)).intValue();
    }
    public int Log(String info) throws COMException {
        return ((Integer) invokeN("Log", new Object[]{info}, 1)).intValue();
    }
    public String FindStrE(int x1, int y1, int x2, int y2, String str, String color, double sim) throws COMException {
        return (String) invokeN("FindStrE", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), str, color, new Double(sim)}, 7);
    }
    public String FindColorE(int x1, int y1, int x2, int y2, String color, double sim, int dir) throws COMException {
        return (String) invokeN("FindColorE", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), color, new Double(sim), new Integer(dir)}, 7);
    }
    public String FindPicE(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir) throws COMException {
        return (String) invokeN("FindPicE", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), pic_name, delta_color, new Double(sim), new Integer(dir)}, 8);
    }
    public String FindMultiColorE(int x1, int y1, int x2, int y2, String first_color, String offset_color, double sim, int dir) throws COMException {
        return (String) invokeN("FindMultiColorE", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), first_color, offset_color, new Double(sim), new Integer(dir)}, 8);
    }
    public int SetExactOcr(int exact_ocr) throws COMException {
        return ((Integer) invokeN("SetExactOcr", new Object[]{new Integer(exact_ocr)}, 1)).intValue();
    }
    public String ReadString(int hwnd, String addr, int type, int len) throws COMException {
        return (String) invokeN("ReadString", new Object[]{new Integer(hwnd), addr, new Integer(type), new Integer(len)}, 4);
    }
    public int FoobarTextPrintDir(int hwnd, int dir) throws COMException {
        return ((Integer) invokeN("FoobarTextPrintDir", new Object[]{new Integer(hwnd), new Integer(dir)}, 2)).intValue();
    }
    public String OcrEx(int x1, int y1, int x2, int y2, String color, double sim) throws COMException {
        return (String) invokeN("OcrEx", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), color, new Double(sim)}, 6);
    }
    public int SetDisplayInput(String mode) throws COMException {
        return ((Integer) invokeN("SetDisplayInput", new Object[]{mode}, 1)).intValue();
    }
    public int GetTime() throws COMException {
        return ((Integer) invoke("GetTime")).intValue();
    }
    public int GetScreenWidth() throws COMException {
        return ((Integer) invoke("GetScreenWidth")).intValue();
    }
    public int GetScreenHeight() throws COMException {
        return ((Integer) invoke("GetScreenHeight")).intValue();
    }
    public int BindWindowEx(int hwnd, String display, String mouse, String keypad, String public_desc, int mode) throws COMException {
        return ((Integer) invokeN("BindWindowEx", new Object[]{new Integer(hwnd), display, mouse, keypad, public_desc, new Integer(mode)}, 6)).intValue();
    }
    public String GetDiskSerial() throws COMException {
        return (String) invoke("GetDiskSerial");
    }
    public String Md5(String str) throws COMException {
        return (String) invokeN("Md5", new Object[]{str}, 1);
    }
    public String GetMac() throws COMException {
        return (String) invoke("GetMac");
    }
    public int ActiveInputMethod(int hwnd, String id) throws COMException {
        return ((Integer) invokeN("ActiveInputMethod", new Object[]{new Integer(hwnd), id}, 2)).intValue();
    }
    public int CheckInputMethod(int hwnd, String id) throws COMException {
        return ((Integer) invokeN("CheckInputMethod", new Object[]{new Integer(hwnd), id}, 2)).intValue();
    }
    public int FindInputMethod(String id) throws COMException {
        return ((Integer) invokeN("FindInputMethod", new Object[]{id}, 1)).intValue();
    }
    public int GetCursorPos(Object x, Object y) throws COMException {
        return ((Integer) invokeN("GetCursorPos", new Object[]{x, y}, 2)).intValue();
    }
    public int BindWindow(int hwnd, String display, String mouse, String keypad, int mode) throws COMException {
        return ((Integer) invokeN("BindWindow", new Object[]{new Integer(hwnd), display, mouse, keypad, new Integer(mode)}, 5)).intValue();
    }
    public int FindWindow(String class_name, String title_name) throws COMException {
        return ((Integer) invokeN("FindWindow", new Object[]{class_name, title_name}, 2)).intValue();
    }
    public int GetScreenDepth() throws COMException {
        return ((Integer) invoke("GetScreenDepth")).intValue();
    }
    public int SetScreen(int width, int height, int depth) throws COMException {
        return ((Integer) invokeN("SetScreen", new Object[]{new Integer(width), new Integer(height), new Integer(depth)}, 3)).intValue();
    }
    public int ExitOs(int type) throws COMException {
        return ((Integer) invokeN("ExitOs", new Object[]{new Integer(type)}, 1)).intValue();
    }
    public String GetDir(int type) throws COMException {
        return (String) invokeN("GetDir", new Object[]{new Integer(type)}, 1);
    }
    public int GetOsType() throws COMException {
        return ((Integer) invoke("GetOsType")).intValue();
    }
    public int FindWindowEx(int parent, String class_name, String title_name) throws COMException {
        return ((Integer) invokeN("FindWindowEx", new Object[]{new Integer(parent), class_name, title_name}, 3)).intValue();
    }
    public int SetExportDict(int index, String dict_name) throws COMException {
        return ((Integer) invokeN("SetExportDict", new Object[]{new Integer(index), dict_name}, 2)).intValue();
    }
    public String GetCursorShape() throws COMException {
        return (String) invoke("GetCursorShape");
    }
    public int DownCpu(int rate) throws COMException {
        return ((Integer) invokeN("DownCpu", new Object[]{new Integer(rate)}, 1)).intValue();
    }
    public String GetCursorSpot() throws COMException {
        return (String) invoke("GetCursorSpot");
    }
    public int SendString2(int hwnd, String str) throws COMException {
        return ((Integer) invokeN("SendString2", new Object[]{new Integer(hwnd), str}, 2)).intValue();
    }
    public int FaqPost(String server, int handle, int request_type, int time_out) throws COMException {
        return ((Integer) invokeN("FaqPost", new Object[]{server, new Integer(handle), new Integer(request_type), new Integer(time_out)}, 4)).intValue();
    }
    public String FaqFetch() throws COMException {
        return (String) invoke("FaqFetch");
    }
    public String FetchWord(int x1, int y1, int x2, int y2, String color, String word) throws COMException {
        return (String) invokeN("FetchWord", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), color, word}, 6);
    }
    public int CaptureJpg(int x1, int y1, int x2, int y2, String file, int quality) throws COMException {
        return ((Integer) invokeN("CaptureJpg", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), file, new Integer(quality)}, 6)).intValue();
    }
    public int FindStrWithFont(int x1, int y1, int x2, int y2, String str, String color, double sim, String font_name, int font_size, int flag, Object x, Object y) throws COMException {
        return ((Integer) invokeN("FindStrWithFont", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), str, color, new Double(sim), font_name, new Integer(font_size), new Integer(flag), x, y}, 12)).intValue();
    }
    public String FindStrWithFontE(int x1, int y1, int x2, int y2, String str, String color, double sim, String font_name, int font_size, int flag) throws COMException {
        return (String) invokeN("FindStrWithFontE", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), str, color, new Double(sim), font_name, new Integer(font_size), new Integer(flag)}, 10);
    }
    public String FindStrWithFontEx(int x1, int y1, int x2, int y2, String str, String color, double sim, String font_name, int font_size, int flag) throws COMException {
        return (String) invokeN("FindStrWithFontEx", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), str, color, new Double(sim), font_name, new Integer(font_size), new Integer(flag)}, 10);
    }
    public String GetDictInfo(String str, String font_name, int font_size, int flag) throws COMException {
        return (String) invokeN("GetDictInfo", new Object[]{str, font_name, new Integer(font_size), new Integer(flag)}, 4);
    }
    public int SaveDict(int index, String file) throws COMException {
        return ((Integer) invokeN("SaveDict", new Object[]{new Integer(index), file}, 2)).intValue();
    }
    public int GetWindowProcessId(int hwnd) throws COMException {
        return ((Integer) invokeN("GetWindowProcessId", new Object[]{new Integer(hwnd)}, 1)).intValue();
    }
    public String GetWindowProcessPath(int hwnd) throws COMException {
        return (String) invokeN("GetWindowProcessPath", new Object[]{new Integer(hwnd)}, 1);
    }
    public int LockInput(int lock) throws COMException {
        return ((Integer) invokeN("LockInput", new Object[]{new Integer(lock)}, 1)).intValue();
    }
    public String GetPicSize(String pic_name) throws COMException {
        return (String) invokeN("GetPicSize", new Object[]{pic_name}, 1);
    }
    public int GetID() throws COMException {
        return ((Integer) invoke("GetID")).intValue();
    }
    public int CapturePng(int x1, int y1, int x2, int y2, String file) throws COMException {
        return ((Integer) invokeN("CapturePng", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), file}, 5)).intValue();
    }
    public int CaptureGif(int x1, int y1, int x2, int y2, String file, int delay, int time) throws COMException {
        return ((Integer) invokeN("CaptureGif", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), file, new Integer(delay), new Integer(time)}, 7)).intValue();
    }
    public int ImageToBmp(String pic_name, String bmp_name) throws COMException {
        return ((Integer) invokeN("ImageToBmp", new Object[]{pic_name, bmp_name}, 2)).intValue();
    }
    public int FindStrFast(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y) throws COMException {
        return ((Integer) invokeN("FindStrFast", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), str, color, new Double(sim), x, y}, 9)).intValue();
    }
    public String FindStrFastEx(int x1, int y1, int x2, int y2, String str, String color, double sim) throws COMException {
        return (String) invokeN("FindStrFastEx", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), str, color, new Double(sim)}, 7);
    }
    public String FindStrFastE(int x1, int y1, int x2, int y2, String str, String color, double sim) throws COMException {
        return (String) invokeN("FindStrFastE", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), str, color, new Double(sim)}, 7);
    }
    public int EnableDisplayDebug(int enable_debug) throws COMException {
        return ((Integer) invokeN("EnableDisplayDebug", new Object[]{new Integer(enable_debug)}, 1)).intValue();
    }
    public int CapturePre(String file) throws COMException {
        return ((Integer) invokeN("CapturePre", new Object[]{file}, 1)).intValue();
    }
    public int RegEx(String code, String Ver, String ip) throws COMException {
        return ((Integer) invokeN("RegEx", new Object[]{code, Ver, ip}, 3)).intValue();
    }
    public String GetMachineCode() throws COMException {
        return (String) invoke("GetMachineCode");
    }
    public int SetClipboard(String data) throws COMException {
        return ((Integer) invokeN("SetClipboard", new Object[]{data}, 1)).intValue();
    }
    public String GetClipboard() throws COMException {
        return (String) invoke("GetClipboard");
    }
    public int GetNowDict() throws COMException {
        return ((Integer) invoke("GetNowDict")).intValue();
    }
    public int Is64Bit() throws COMException {
        return ((Integer) invoke("Is64Bit")).intValue();
    }
    public int GetColorNum(int x1, int y1, int x2, int y2, String color, double sim) throws COMException {
        return ((Integer) invokeN("GetColorNum", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), color, new Double(sim)}, 6)).intValue();
    }
    public String EnumWindowByProcess(String process_name, String title, String class_name, int filter) throws COMException {
        return (String) invokeN("EnumWindowByProcess", new Object[]{process_name, title, class_name, new Integer(filter)}, 4);
    }
    public int GetDictCount(int index) throws COMException {
        return ((Integer) invokeN("GetDictCount", new Object[]{new Integer(index)}, 1)).intValue();
    }
    public int GetLastError() throws COMException {
        return ((Integer) invoke("GetLastError")).intValue();
    }
    public String GetNetTime() throws COMException {
        return (String) invoke("GetNetTime");
    }
    public int EnableGetColorByCapture(int en) throws COMException {
        return ((Integer) invokeN("EnableGetColorByCapture", new Object[]{new Integer(en)}, 1)).intValue();
    }
    public int CheckUAC() throws COMException {
        return ((Integer) invoke("CheckUAC")).intValue();
    }
    public int SetUAC(int uac) throws COMException {
        return ((Integer) invokeN("SetUAC", new Object[]{new Integer(uac)}, 1)).intValue();
    }
    public int DisableFontSmooth() throws COMException {
        return ((Integer) invoke("DisableFontSmooth")).intValue();
    }
    public int CheckFontSmooth() throws COMException {
        return ((Integer) invoke("CheckFontSmooth")).intValue();
    }
    public int SetDisplayAcceler(int level) throws COMException {
        return ((Integer) invokeN("SetDisplayAcceler", new Object[]{new Integer(level)}, 1)).intValue();
    }
    public int FindWindowByProcess(String process_name, String class_name, String title_name) throws COMException {
        return ((Integer) invokeN("FindWindowByProcess", new Object[]{process_name, class_name, title_name}, 3)).intValue();
    }
    public int FindWindowByProcessId(int process_id, String class_name, String title_name) throws COMException {
        return ((Integer) invokeN("FindWindowByProcessId", new Object[]{new Integer(process_id), class_name, title_name}, 3)).intValue();
    }
    public String ReadIni(String section, String key, String file) throws COMException {
        return (String) invokeN("ReadIni", new Object[]{section, key, file}, 3);
    }
    public int WriteIni(String section, String key, String v, String file) throws COMException {
        return ((Integer) invokeN("WriteIni", new Object[]{section, key, v, file}, 4)).intValue();
    }
    public int RunApp(String path, int mode) throws COMException {
        return ((Integer) invokeN("RunApp", new Object[]{path, new Integer(mode)}, 2)).intValue();
    }
    public int delay(int mis) throws COMException {
        return ((Integer) invokeN("delay", new Object[]{new Integer(mis)}, 1)).intValue();
    }
    public int FindWindowSuper(String spec1, int flag1, int type1, String spec2, int flag2, int type2) throws COMException {
        return ((Integer) invokeN("FindWindowSuper", new Object[]{spec1, new Integer(flag1), new Integer(type1), spec2, new Integer(flag2), new Integer(type2)}, 6)).intValue();
    }
    public String ExcludePos(String all_pos, int type, int x1, int y1, int x2, int y2) throws COMException {
        return (String) invokeN("ExcludePos", new Object[]{all_pos, new Integer(type), new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2)}, 6);
    }
    public String FindNearestPos(String all_pos, int type, int x, int y) throws COMException {
        return (String) invokeN("FindNearestPos", new Object[]{all_pos, new Integer(type), new Integer(x), new Integer(y)}, 4);
    }
    public String SortPosDistance(String all_pos, int type, int x, int y) throws COMException {
        return (String) invokeN("SortPosDistance", new Object[]{all_pos, new Integer(type), new Integer(x), new Integer(y)}, 4);
    }
    public int FindPicMem(int x1, int y1, int x2, int y2, String pic_info, String delta_color, double sim, int dir, Object x, Object y) throws COMException {
        return ((Integer) invokeN("FindPicMem", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), pic_info, delta_color, new Double(sim), new Integer(dir), x, y}, 10)).intValue();
    }
    public String FindPicMemEx(int x1, int y1, int x2, int y2, String pic_info, String delta_color, double sim, int dir) throws COMException {
        return (String) invokeN("FindPicMemEx", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), pic_info, delta_color, new Double(sim), new Integer(dir)}, 8);
    }
    public String FindPicMemE(int x1, int y1, int x2, int y2, String pic_info, String delta_color, double sim, int dir) throws COMException {
        return (String) invokeN("FindPicMemE", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), pic_info, delta_color, new Double(sim), new Integer(dir)}, 8);
    }
    public String AppendPicAddr(String pic_info, int addr, int size) throws COMException {
        return (String) invokeN("AppendPicAddr", new Object[]{pic_info, new Integer(addr), new Integer(size)}, 3);
    }
    public int WriteFile(String file, String content) throws COMException {
        return ((Integer) invokeN("WriteFile", new Object[]{file, content}, 2)).intValue();
    }
    public int Stop(int id) throws COMException {
        return ((Integer) invokeN("Stop", new Object[]{new Integer(id)}, 1)).intValue();
    }
    public int SetDictMem(int index, int addr, int size) throws COMException {
        return ((Integer) invokeN("SetDictMem", new Object[]{new Integer(index), new Integer(addr), new Integer(size)}, 3)).intValue();
    }
    public String GetNetTimeSafe() throws COMException {
        return (String) invoke("GetNetTimeSafe");
    }
    public int ForceUnBindWindow(int hwnd) throws COMException {
        return ((Integer) invokeN("ForceUnBindWindow", new Object[]{new Integer(hwnd)}, 1)).intValue();
    }
    public String ReadIniPwd(String section, String key, String file, String pwd) throws COMException {
        return (String) invokeN("ReadIniPwd", new Object[]{section, key, file, pwd}, 4);
    }
    public int WriteIniPwd(String section, String key, String v, String file, String pwd) throws COMException {
        return ((Integer) invokeN("WriteIniPwd", new Object[]{section, key, v, file, pwd}, 5)).intValue();
    }
    public int DecodeFile(String file, String pwd) throws COMException {
        return ((Integer) invokeN("DecodeFile", new Object[]{file, pwd}, 2)).intValue();
    }
    public int KeyDownChar(String key_str) throws COMException {
        return ((Integer) invokeN("KeyDownChar", new Object[]{key_str}, 1)).intValue();
    }
    public int KeyUpChar(String key_str) throws COMException {
        return ((Integer) invokeN("KeyUpChar", new Object[]{key_str}, 1)).intValue();
    }
    public int KeyPressChar(String key_str) throws COMException {
        return ((Integer) invokeN("KeyPressChar", new Object[]{key_str}, 1)).intValue();
    }
    public int KeyPressStr(String key_str, int delay) throws COMException {
        return ((Integer) invokeN("KeyPressStr", new Object[]{key_str, new Integer(delay)}, 2)).intValue();
    }
    public int EnableKeypadPatch(int en) throws COMException {
        return ((Integer) invokeN("EnableKeypadPatch", new Object[]{new Integer(en)}, 1)).intValue();
    }
    public int EnableKeypadSync(int en, int time_out) throws COMException {
        return ((Integer) invokeN("EnableKeypadSync", new Object[]{new Integer(en), new Integer(time_out)}, 2)).intValue();
    }
    public int EnableMouseSync(int en, int time_out) throws COMException {
        return ((Integer) invokeN("EnableMouseSync", new Object[]{new Integer(en), new Integer(time_out)}, 2)).intValue();
    }
    public int DmGuard(int en, String type) throws COMException {
        return ((Integer) invokeN("DmGuard", new Object[]{new Integer(en), type}, 2)).intValue();
    }
    public int FaqCaptureFromFile(int x1, int y1, int x2, int y2, String file, int quality) throws COMException {
        return ((Integer) invokeN("FaqCaptureFromFile", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), file, new Integer(quality)}, 6)).intValue();
    }
    public String FindIntEx(int hwnd, String addr_range, int int_value_min, int int_value_max, int type, int step, int multi_thread, int mode) throws COMException {
        return (String) invokeN("FindIntEx", new Object[]{new Integer(hwnd), addr_range, new Integer(int_value_min), new Integer(int_value_max), new Integer(type), new Integer(step), new Integer(multi_thread), new Integer(mode)}, 8);
    }
    public String FindFloatEx(int hwnd, String addr_range, float float_value_min, float float_value_max, int step, int multi_thread, int mode) throws COMException {
        return (String) invokeN("FindFloatEx", new Object[]{new Integer(hwnd), addr_range, new Float(float_value_min), new Float(float_value_max), new Integer(step), new Integer(multi_thread), new Integer(mode)}, 7);
    }
    public String FindDoubleEx(int hwnd, String addr_range, double double_value_min, double double_value_max, int step, int multi_thread, int mode) throws COMException {
        return (String) invokeN("FindDoubleEx", new Object[]{new Integer(hwnd), addr_range, new Double(double_value_min), new Double(double_value_max), new Integer(step), new Integer(multi_thread), new Integer(mode)}, 7);
    }
    public String FindStringEx(int hwnd, String addr_range, String string_value, int type, int step, int multi_thread, int mode) throws COMException {
        return (String) invokeN("FindStringEx", new Object[]{new Integer(hwnd), addr_range, string_value, new Integer(type), new Integer(step), new Integer(multi_thread), new Integer(mode)}, 7);
    }
    public String FindDataEx(int hwnd, String addr_range, String data, int step, int multi_thread, int mode) throws COMException {
        return (String) invokeN("FindDataEx", new Object[]{new Integer(hwnd), addr_range, data, new Integer(step), new Integer(multi_thread), new Integer(mode)}, 6);
    }
    public int EnableRealMouse(int en, int mousedelay, int mousestep) throws COMException {
        return ((Integer) invokeN("EnableRealMouse", new Object[]{new Integer(en), new Integer(mousedelay), new Integer(mousestep)}, 3)).intValue();
    }
    public int EnableRealKeypad(int en) throws COMException {
        return ((Integer) invokeN("EnableRealKeypad", new Object[]{new Integer(en)}, 1)).intValue();
    }
    public int SendStringIme(String str) throws COMException {
        return ((Integer) invokeN("SendStringIme", new Object[]{str}, 1)).intValue();
    }
    public int FoobarDrawLine(int hwnd, int x1, int y1, int x2, int y2, String color, int style, int width) throws COMException {
        return ((Integer) invokeN("FoobarDrawLine", new Object[]{new Integer(hwnd), new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), color, new Integer(style), new Integer(width)}, 8)).intValue();
    }
    public String FindStrEx(int x1, int y1, int x2, int y2, String str, String color, double sim) throws COMException {
        return (String) invokeN("FindStrEx", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), str, color, new Double(sim)}, 7);
    }
    public int IsBind(int hwnd) throws COMException {
        return ((Integer) invokeN("IsBind", new Object[]{new Integer(hwnd)}, 1)).intValue();
    }
    public int SetDisplayDelay(int t) throws COMException {
        return ((Integer) invokeN("SetDisplayDelay", new Object[]{new Integer(t)}, 1)).intValue();
    }
    public int GetDmCount() throws COMException {
        return ((Integer) invoke("GetDmCount")).intValue();
    }
    public int DisableScreenSave() throws COMException {
        return ((Integer) invoke("DisableScreenSave")).intValue();
    }
    public int DisablePowerSave() throws COMException {
        return ((Integer) invoke("DisablePowerSave")).intValue();
    }
    public int SetMemoryHwndAsProcessId(int en) throws COMException {
        return ((Integer) invokeN("SetMemoryHwndAsProcessId", new Object[]{new Integer(en)}, 1)).intValue();
    }
    public int FindShape(int x1, int y1, int x2, int y2, String offset_color, double sim, int dir, Object x, Object y) throws COMException {
        return ((Integer) invokeN("FindShape", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), offset_color, new Double(sim), new Integer(dir), x, y}, 9)).intValue();
    }
    public String FindShapeE(int x1, int y1, int x2, int y2, String offset_color, double sim, int dir) throws COMException {
        return (String) invokeN("FindShapeE", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), offset_color, new Double(sim), new Integer(dir)}, 7);
    }
    public String FindShapeEx(int x1, int y1, int x2, int y2, String offset_color, double sim, int dir) throws COMException {
        return (String) invokeN("FindShapeEx", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), offset_color, new Double(sim), new Integer(dir)}, 7);
    }
    public String FindStrS(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y) throws COMException {
        return (String) invokeN("FindStrS", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), str, color, new Double(sim), x, y}, 9);
    }
    public String FindStrExS(int x1, int y1, int x2, int y2, String str, String color, double sim) throws COMException {
        return (String) invokeN("FindStrExS", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), str, color, new Double(sim)}, 7);
    }
    public String FindStrFastS(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y) throws COMException {
        return (String) invokeN("FindStrFastS", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), str, color, new Double(sim), x, y}, 9);
    }
    public String FindStrFastExS(int x1, int y1, int x2, int y2, String str, String color, double sim) throws COMException {
        return (String) invokeN("FindStrFastExS", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), str, color, new Double(sim)}, 7);
    }
    public String FindPicS(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir, Object x, Object y) throws COMException {
        return (String) invokeN("FindPicS", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), pic_name, delta_color, new Double(sim), new Integer(dir), x, y}, 10);
    }
    public String FindPicExS(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir) throws COMException {
        return (String) invokeN("FindPicExS", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), pic_name, delta_color, new Double(sim), new Integer(dir)}, 8);
    }
    public int ClearDict(int index) throws COMException {
        return ((Integer) invokeN("ClearDict", new Object[]{new Integer(index)}, 1)).intValue();
    }
    public String GetMachineCodeNoMac() throws COMException {
        return (String) invoke("GetMachineCodeNoMac");
    }
    public int GetClientRect(int hwnd, Object x1, Object y1, Object x2, Object y2) throws COMException {
        return ((Integer) invokeN("GetClientRect", new Object[]{new Integer(hwnd), x1, y1, x2, y2}, 5)).intValue();
    }
    public int EnableFakeActive(int en) throws COMException {
        return ((Integer) invokeN("EnableFakeActive", new Object[]{new Integer(en)}, 1)).intValue();
    }
    public int GetScreenDataBmp(int x1, int y1, int x2, int y2, Object data, Object size) throws COMException {
        return ((Integer) invokeN("GetScreenDataBmp", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), data, size}, 6)).intValue();
    }
    public int EncodeFile(String file, String pwd) throws COMException {
        return ((Integer) invokeN("EncodeFile", new Object[]{file, pwd}, 2)).intValue();
    }
    public String GetCursorShapeEx(int type) throws COMException {
        return (String) invokeN("GetCursorShapeEx", new Object[]{new Integer(type)}, 1);
    }
    public int FaqCancel() throws COMException {
        return ((Integer) invoke("FaqCancel")).intValue();
    }
    public String IntToData(int int_value, int type) throws COMException {
        return (String) invokeN("IntToData", new Object[]{new Integer(int_value), new Integer(type)}, 2);
    }
    public String FloatToData(float float_value) throws COMException {
        return (String) invokeN("FloatToData", new Object[]{new Float(float_value)}, 1);
    }
    public String DoubleToData(double double_value) throws COMException {
        return (String) invokeN("DoubleToData", new Object[]{new Double(double_value)}, 1);
    }
    public String StringToData(String string_value, int type) throws COMException {
        return (String) invokeN("StringToData", new Object[]{string_value, new Integer(type)}, 2);
    }
    public int SetMemoryFindResultToFile(String file) throws COMException {
        return ((Integer) invokeN("SetMemoryFindResultToFile", new Object[]{file}, 1)).intValue();
    }
    public int EnableBind(int en) throws COMException {
        return ((Integer) invokeN("EnableBind", new Object[]{new Integer(en)}, 1)).intValue();
    }
    public int SetSimMode(int mode) throws COMException {
        return ((Integer) invokeN("SetSimMode", new Object[]{new Integer(mode)}, 1)).intValue();
    }
    public int LockMouseRect(int x1, int y1, int x2, int y2) throws COMException {
        return ((Integer) invokeN("LockMouseRect", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2)}, 4)).intValue();
    }
    public int SendPaste(int hwnd) throws COMException {
        return ((Integer) invokeN("SendPaste", new Object[]{new Integer(hwnd)}, 1)).intValue();
    }
    public int IsDisplayDead(int x1, int y1, int x2, int y2, int t) throws COMException {
        return ((Integer) invokeN("IsDisplayDead", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), new Integer(t)}, 5)).intValue();
    }
    public int GetKeyState(int vk) throws COMException {
        return ((Integer) invokeN("GetKeyState", new Object[]{new Integer(vk)}, 1)).intValue();
    }
    public int CopyFile(String src_file, String dst_file, int over) throws COMException {
        return ((Integer) invokeN("CopyFile", new Object[]{src_file, dst_file, new Integer(over)}, 3)).intValue();
    }
    public int IsFileExist(String file) throws COMException {
        return ((Integer) invokeN("IsFileExist", new Object[]{file}, 1)).intValue();
    }
    public int DeleteFile(String file) throws COMException {
        return ((Integer) invokeN("DeleteFile", new Object[]{file}, 1)).intValue();
    }
    public int MoveFile(String src_file, String dst_file) throws COMException {
        return ((Integer) invokeN("MoveFile", new Object[]{src_file, dst_file}, 2)).intValue();
    }
    public int CreateFolder(String folder_name) throws COMException {
        return ((Integer) invokeN("CreateFolder", new Object[]{folder_name}, 1)).intValue();
    }
    public int DeleteFolder(String folder_name) throws COMException {
        return ((Integer) invokeN("DeleteFolder", new Object[]{folder_name}, 1)).intValue();
    }
    public int GetFileLength(String file) throws COMException {
        return ((Integer) invokeN("GetFileLength", new Object[]{file}, 1)).intValue();
    }
    public String ReadFile(String file) throws COMException {
        return (String) invokeN("ReadFile", new Object[]{file}, 1);
    }
    public int WaitKey(int key_code, int time_out) throws COMException {
        return ((Integer) invokeN("WaitKey", new Object[]{new Integer(key_code), new Integer(time_out)}, 2)).intValue();
    }
    public int DeleteIni(String section, String key, String file) throws COMException {
        return ((Integer) invokeN("DeleteIni", new Object[]{section, key, file}, 3)).intValue();
    }
    public int DeleteIniPwd(String section, String key, String file, String pwd) throws COMException {
        return ((Integer) invokeN("DeleteIniPwd", new Object[]{section, key, file, pwd}, 4)).intValue();
    }
    public int EnableSpeedDx(int en) throws COMException {
        return ((Integer) invokeN("EnableSpeedDx", new Object[]{new Integer(en)}, 1)).intValue();
    }
    public int EnableIme(int en) throws COMException {
        return ((Integer) invokeN("EnableIme", new Object[]{new Integer(en)}, 1)).intValue();
    }
    public int Reg(String code, String Ver) throws COMException {
        return ((Integer) invokeN("Reg", new Object[]{code, Ver}, 2)).intValue();
    }
    public String SelectFile() throws COMException {
        return (String) invoke("SelectFile");
    }
    public String SelectDirectory() throws COMException {
        return (String) invoke("SelectDirectory");
    }
    public int LockDisplay(int lock) throws COMException {
        return ((Integer) invokeN("LockDisplay", new Object[]{new Integer(lock)}, 1)).intValue();
    }
    public int FoobarSetSave(int hwnd, String file, int en, String header) throws COMException {
        return ((Integer) invokeN("FoobarSetSave", new Object[]{new Integer(hwnd), file, new Integer(en), header}, 4)).intValue();
    }
    public String EnumWindowSuper(String spec1, int flag1, int type1, String spec2, int flag2, int type2, int sort) throws COMException {
        return (String) invokeN("EnumWindowSuper", new Object[]{spec1, new Integer(flag1), new Integer(type1), spec2, new Integer(flag2), new Integer(type2), new Integer(sort)}, 7);
    }
    public int DownloadFile(String url, String save_file, int timeout) throws COMException {
        return ((Integer) invokeN("DownloadFile", new Object[]{url, save_file, new Integer(timeout)}, 3)).intValue();
    }
    public int EnableKeypadMsg(int en) throws COMException {
        return ((Integer) invokeN("EnableKeypadMsg", new Object[]{new Integer(en)}, 1)).intValue();
    }
    public int EnableMouseMsg(int en) throws COMException {
        return ((Integer) invokeN("EnableMouseMsg", new Object[]{new Integer(en)}, 1)).intValue();
    }
    public int RegNoMac(String code, String Ver) throws COMException {
        return ((Integer) invokeN("RegNoMac", new Object[]{code, Ver}, 2)).intValue();
    }
    public int RegExNoMac(String code, String Ver, String ip) throws COMException {
        return ((Integer) invokeN("RegExNoMac", new Object[]{code, Ver, ip}, 3)).intValue();
    }
    public int SetEnumWindowDelay(int delay) throws COMException {
        return ((Integer) invokeN("SetEnumWindowDelay", new Object[]{new Integer(delay)}, 1)).intValue();
    }
    public int FindMulColor(int x1, int y1, int x2, int y2, String color, double sim) throws COMException {
        return ((Integer) invokeN("FindMulColor", new Object[]{new Integer(x1), new Integer(y1), new Integer(x2), new Integer(y2), color, new Double(sim)}, 6)).intValue();
    }
    public String GetDict(int index, int font_index) throws COMException {
        return (String) invokeN("GetDict", new Object[]{new Integer(index), new Integer(font_index)}, 2);
    }
}

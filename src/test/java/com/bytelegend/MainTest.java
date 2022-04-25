package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    @CaptureSystemOutput
    public void test(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("I am Sub, the param is ParamSub"));
        Main.main(null);
    }

    @Test
    @CaptureSystemOutput
    public void test2(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("I am Base, the param is ParamBase"));
        new Base().print(new ParamBase());
    }

    @Test
    @CaptureSystemOutput
    public void test3(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("I am Sub, the param is ParamBase"));
        new Sub().print(new ParamBase());
    }

    @Test
    @CaptureSystemOutput
    public void test4(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("I am Base, the param is ParamSub"));
        new Base().print(new ParamSub());
    }

    @Test
    @CaptureSystemOutput
    public void test5(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("I am Sub, the param is ParamSub"));
        new Sub().print(new ParamSub());
    }
}

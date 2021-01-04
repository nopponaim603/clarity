package skadistats.clarity.io.unpacker.factory.s2;

import skadistats.clarity.io.s2.field.DecoderProperties;
import skadistats.clarity.io.unpacker.QAngleBitCountDecoder;
import skadistats.clarity.io.unpacker.QAngleNoBitCountDecoder;
import skadistats.clarity.io.unpacker.QAngleNoScaleDecoder;
import skadistats.clarity.io.unpacker.QAnglePitchYawOnlyDecoder;
import skadistats.clarity.io.unpacker.Decoder;
import skadistats.clarity.model.Vector;

public class QAngleDecoderFactory implements DecoderFactory<Vector> {

    public static Decoder<Vector> createDecoderStatic(DecoderProperties f) {
        int bc = f.getBitCountOrDefault(0);
        if ("qangle_pitch_yaw".equals(f.getEncoderType())) {
            return new QAnglePitchYawOnlyDecoder(bc);
        }
        if (bc == 0) {
            return new QAngleNoBitCountDecoder();
        }
        if (bc == 32) {
            return new QAngleNoScaleDecoder();
        }
        return new QAngleBitCountDecoder(bc);
    }

    @Override
    public Decoder<Vector> createDecoder(DecoderProperties f) {
        return createDecoderStatic(f);
    }

}